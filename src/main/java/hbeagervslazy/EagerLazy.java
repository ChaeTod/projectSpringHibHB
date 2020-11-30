package hbeagervslazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hbeagervslazy.entity.Course;
import hbeagervslazy.entity.InstructorDetail;
import hbeagervslazy.entity.Instructor;

public class EagerLazy {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            // Start transaction
            session.beginTransaction();

            // Get instructor from DB
            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);

            System.out.println("EAGER Instructor: " + instructor);

            // get course for the instructor
            System.out.println("EAGER Courses: " + instructor.getCourses()); // retrieving the lazy data

           // Commit transaction
            session.getTransaction().commit();

            // close the session
            session.close();

            System.out.println("Session is now closed!");

            // option 1: call getter method while session is open

            // get course for the instructor
            System.out.println("EAGER Courses: " + instructor.getCourses()); // call the courses in a middle air while the session was opened

            System.out.println("EAGER Done!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
