package jpa.entity.relationship.ex10;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "relationship_ex10_news")
public class News10 {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String content;
    @OneToMany(fetch = FetchType.EAGER)
    @OrderBy("postedDate desc")
    private List<Comment10> comments;

    // ======================================
    // =            Constructors            =
    // ======================================

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}