package sk.it.Artem.course.enteties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course", schema = "hb-03-one-to-many")
public class Course {

    // define fields

    // define constructor

    // define getter and setters

    // define toString

    // annotate fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    // without REMOVE
    @JoinColumn(name = "instructor_id")
    private InstructorEntity instructorEntity_tmp;

    @OneToMany(mappedBy = "instructor", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}) // refers to the instructorEntity property in Course class
    private List<Course> coursesList; // list of courses

    public Course() {
    }

    public Course(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InstructorEntity getInstructorEntity_tmp() {
        return instructorEntity_tmp;
    }

    public void setInstructorEntity_tmp(InstructorEntity instructorEntity_tmp) {
        this.instructorEntity_tmp = instructorEntity_tmp;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    // add convenience methods for bi-directional relationship
    public void add (Course temp){
        if (coursesList == null) {
            coursesList = new ArrayList<>();
        }
        coursesList.add(temp);
        temp.setInstructorEntity_tmp(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
