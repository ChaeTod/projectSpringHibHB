package hb04oneToManyUni;

import hb04oneToManyUni.entity.Course;
import hb04oneToManyUni.entity.Instructor;
import hb04oneToManyUni.entity.InstructorDetail;
import hb04oneToManyUni.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseAndReviews {
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

            // create a course
            Course course_1 = new Course("Pacman - How to score One Million Points");

            // add some reviews
            course_1.addReview(new Review("Great course, loved it!"));
            course_1.addReview(new Review("Cool course, job well done!"));
            course_1.addReview(new Review("What a dumb course!"));

            // save the course and leverage the cascade all
            System.out.println("Saving the course");
            System.out.println(course_1);
            session.save(course_1); // will save the course and also will cascade saves for all of the reviews

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
