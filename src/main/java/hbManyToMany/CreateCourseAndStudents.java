package hbManyToMany;

import hbManyToMany.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateCourseAndStudents {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            // Start transaction
            session.beginTransaction();

            // create a course
            Course course_1 = new Course("Pacman - How to score One Million Points");

            // save the course
            System.out.println("Saving the course");
            session.save(course_1);
            System.out.println("Saved the course: " + course_1);

            // create the students
            Student student_1 = new Student("John", "Doe", "john@gmail.com");
            Student student_2 = new Student("Mary", "Public", "mary@gmail.com");

            // create students to the course
            course_1.addStudent(student_1);
            course_1.addStudent(student_2);

            // save the students
            System.out.println("Saving the student");
            session.save(student_1);
            session.save(student_2);
            System.out.println("Saved the students: " + course_1);

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
