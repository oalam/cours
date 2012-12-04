package jpa.entity.elementary.ex03;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "elementary_ex03_news")
@IdClass(NewsId.class)
public class NewsIdClass {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    private String title;
    @Id
    private String language;
    private String content;

    // ======================================
    // =            Constructors            =
    // ======================================

    public NewsIdClass() {
    }

    public NewsIdClass(String title, String language, String content) {
        this.title = title;
        this.language = language;
        this.content = content;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}