/*
package sk.it.Artem.oldPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.Artem.oldPack.entities.InstructorDetailEntity;
import sk.it.Artem.oldPack.entities.InstructorEntity;


public class CreateDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InstructorEntity.class).addAnnotatedClass(InstructorDetailEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // create the objects
            InstructorEntity instructor = new InstructorEntity("Madhu", "Patel", "madhu@mail.com");

            InstructorDetailEntity instructorDetailEntity = new InstructorDetailEntity("www.youtube.com", "Guitar!");

            // associate the objects
            instructor.setInstructorDetailByInstructorDetailId(instructorDetailEntity);


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
            factory.close();
        }
    }
}
*/
