package sk.it.Artem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sk.it.Artem.entities.InstructorDetailEntity;
import sk.it.Artem.entities.InstructorEntity;


public class DeleteDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InstructorEntity.class).addAnnotatedClass(InstructorDetailEntity.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            // get instructor by the primary key / id
            int field = 1;
            InstructorEntity instructor = session.get(InstructorEntity.class, field);

            System.out.println("Found the instructor: " + instructor);

            // delete the instructions
            if (instructor != null){
                System.out.println("Deleting: " + instructor);

                // this will ALSO delete associated "details" object
                session.delete(instructor);
            }

            // commit transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
