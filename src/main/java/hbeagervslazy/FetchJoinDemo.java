package hbeagervslazy;

import hbeagervslazy.entity.Course;
import hbeagervslazy.entity.Instructor;
import hbeagervslazy.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {
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

            // option 2: Hibernate query with HQL


            // Get instructor from DB
            int id = 1;

            // when executed, will load instructor and courses all at once
            Query<Instructor> query = session.createQuery("select i from Instructor i " + " JOIN FETCH i.courses " + " where i.id=:theInstructorId ", Instructor.class);

            // set parameter on query
            query.setParameter("theInstructorId", id);

            // execute query and get instructor
            Instructor instructor = query.getSingleResult(); // load instructor and courses all at once, because of that special query up there

            System.out.println("EAGER Instructor: " + instructor);

            // Commit transaction
            session.getTransaction().commit();

            // close the session
            session.close();

            System.out.println("Session is now closed!");

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
