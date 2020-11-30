/*
package sk.it.Artem.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hbeagervslazy.hbeagervslazy.entity.Course;
import hbeagervslazy.hbeagervslazy.entity.Instructor;
import hbeagervslazy.hbeagervslazy.entity.InstructorDetail;

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
*/
