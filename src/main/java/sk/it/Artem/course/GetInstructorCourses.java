package sk.it.Artem.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.Artem.course.enteties.Course;
import sk.it.Artem.course.enteties.Instructor;
import sk.it.Artem.course.enteties.InstructorDetail;

public class GetInstructorCourses {
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

            System.out.println("Instructor: " + instructor);

            // get course for the instructor
            System.out.println("Courses: " + instructor.getCourses());

            // Commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
