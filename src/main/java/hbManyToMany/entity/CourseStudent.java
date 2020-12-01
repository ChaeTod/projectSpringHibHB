/*
package hbManyToMany.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_student", schema = "hb-05-many-to-many", catalog = "")
@IdClass(CourseStudentEntityPK.class)
public class CourseStudent {
    private Integer courseId;
    private Integer studentId;

    @Id
    @Column(name = "course_id", nullable = false)
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "student_id", nullable = false)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


}
*/
