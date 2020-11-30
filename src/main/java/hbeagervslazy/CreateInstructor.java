/*
package hbeagervslazy.hbeagervslazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hbeagervslazy.hbeagervslazy.entity.Course;
import hbeagervslazy.hbeagervslazy.entity.InstructorDetail;
import hbeagervslazy.hbeagervslazy.entity.Instructor;

public class CreateInstructor {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // create the objects
            Instructor instructor = new Instructor("")

            InstructorDetail instructorDetail = new InstructorDetail()

            // associate the objects
            instructor.setInstructorDetail(instructorDetail);

            // start a transaction
            session.beginTransaction();

            // save the instructor
            // this will ALSO save the details object because of CascadeType.ALL
            System.out.println("Saving instructor: " + instructor);
            session.save(instructor);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {

            // add clean up code
            session.close();

            factory.close();
        }
    }
}
*/
