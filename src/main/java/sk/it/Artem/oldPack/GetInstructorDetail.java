/*
package sk.it.Artem.oldPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.Artem.oldPack.entities.InstructorDetailEntity;
import sk.it.Artem.oldPack.entities.InstructorEntity;


public class GetInstructorDetail {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InstructorEntity.class).addAnnotatedClass(InstructorDetailEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            // get the instructor detail object
            int fieldId = 2;
            InstructorDetailEntity instructorDetailEntity = session.get(InstructorDetailEntity.class, fieldId);

            // print the instructor detail
            System.out.println("Instructor Detail: " + instructorDetailEntity);

            // print the associated instructor
            System.out.println("The associated instructor: " + instructorDetailEntity.getInstructorEntity());

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // handle connection leak issue
            session.close();

            factory.close();
        }
    }
}
*/
