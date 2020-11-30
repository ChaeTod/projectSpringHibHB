package hbeagervslazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hbeagervslazy.entity.Course;
import hbeagervslazy.entity.Instructor;
import hbeagervslazy.entity.InstructorDetail;

public class DeleteCourses {
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

           // get a course id
            int temp_id = 10;
            Course course = session.get(Course.class, temp_id);

            // delete course
            System.out.println("Deleting course: " + course);
            session.delete(course);

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
