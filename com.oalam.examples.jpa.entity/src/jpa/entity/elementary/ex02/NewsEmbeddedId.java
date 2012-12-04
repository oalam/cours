package jpa.entity.elementary.ex02;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "elementary_ex02_news")
public class NewsEmbeddedId {

    // ======================================
    // =             Attributes             =
    // ======================================
    @EmbeddedId
    private NewsId id;
    private String content;

    // ======================================
    // =            Constructors            =
    // ======================================

    public NewsEmbeddedId() {
    }

    public NewsEmbeddedId(NewsId id, String content) {
        this.id = id;
        this.content = content;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public NewsId getId() {
        return id;
    }

    public void setId(NewsId id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}