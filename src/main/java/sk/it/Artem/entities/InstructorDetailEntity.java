package sk.it.Artem.entities;

import javax.persistence.*;

// annotate the class as an entity and map to db table

// define the fields

// annotate the fields with db column names

// create constructors

// generate getter/setter methods

// generate toString()

@Entity
@Table(name = "instructor_detail", schema = "hb-01-one-to-one-uni")
public class InstructorDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "youtube_channel", nullable = true, length = 128)
    private String youtubeChannel;

    @Basic
    @Column(name = "hobby", nullable = true, length = 45)
    private String hobby;

    public InstructorDetailEntity() {
    }

    public InstructorDetailEntity(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetailEntity{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
