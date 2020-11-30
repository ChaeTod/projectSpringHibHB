package hb04oneToManyUni;

import hb04oneToManyUni.entity.Course;
import hb04oneToManyUni.entity.Instructor;
import hb04oneToManyUni.entity.InstructorDetail;
import hb04oneToManyUni.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetCourseAndReviews {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            // Start transaction
            session.beginTransaction();

            // get the course
            int temp_id = 10;
            Course course = session.get(Course.class, temp_id);

            // print the course
            System.out.println("Course: " + course.getTitle());

            // print the course reviews
            System.out.println("Reviews: " + course.getReviewList());

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
