package hbManyToMany;

import hb04oneToManyUni.entity.Course;
import hb04oneToManyUni.entity.Instructor;
import hb04oneToManyUni.entity.InstructorDetail;
import hb04oneToManyUni.entity.Review;
import hbManyToMany.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteMaryStudent {
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
            int temp_id = 2;
            //Course course = session.get(Course.class, temp_id);
            Student student = session.get(Student.class, temp_id);

            // delete the course
            System.out.println("Deleting student: " + student);
            session.delete(student);

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
