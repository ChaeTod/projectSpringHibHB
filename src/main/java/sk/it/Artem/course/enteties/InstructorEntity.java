package sk.it.Artem.course.enteties;

import javax.persistence.*;

@Entity
@Table(name = "instructor", schema = "hb-03-one-to-many")
public class InstructorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "first_name", nullable = true, length = 45)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = true, length = 45)
    private String lastName;

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    private String email;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}) // it will apply for any operation like UPDATE/DELETE and etc. and update the associated subject accordingly
    @JoinColumn(name = "instructor_detail_id", referencedColumnName = "id")
    private InstructorDetailEntity instructorDetailByInstructorDetailId;

    public InstructorEntity(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public InstructorEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public InstructorDetailEntity getInstructorDetailByInstructorDetailId() {
        return instructorDetailByInstructorDetailId;
    }

    public void setInstructorDetailByInstructorDetailId(InstructorDetailEntity instructorDetailByInstructorDetailId) {
        this.instructorDetailByInstructorDetailId = instructorDetailByInstructorDetailId;
    }

    @Override
    public String toString() {
        return "InstructorEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

