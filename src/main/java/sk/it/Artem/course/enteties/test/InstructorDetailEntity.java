/*
package sk.it.Artem.course.enteties;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail", schema = "hb-03-one-to-many", catalog = "")
public class InstructorDetailEntity {
    private Integer id;
    private String youtubeChannel;
    private String hobby;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "youtube_channel", nullable = true, length = 128)
    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    @Basic
    @Column(name = "hobby", nullable = true, length = 45)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstructorDetailEntity that = (InstructorDetailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (youtubeChannel != null ? !youtubeChannel.equals(that.youtubeChannel) : that.youtubeChannel != null)
            return false;
        if (hobby != null ? !hobby.equals(that.hobby) : that.hobby != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (youtubeChannel != null ? youtubeChannel.hashCode() : 0);
        result = 31 * result + (hobby != null ? hobby.hashCode() : 0);
        return result;
    }
}
*/
