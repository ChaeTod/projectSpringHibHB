/*
package hbManyToMany.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CourseStudentEntityPK implements Serializable {
    private Integer courseId;
    private Integer studentId;

    @Column(name = "course_id", nullable = false)
    @Id
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Column(name = "student_id", nullable = false)
    @Id
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseStudentEntityPK that = (CourseStudentEntityPK) o;

        if (courseId != null ? !courseId.equals(that.courseId) : that.courseId != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
*/
