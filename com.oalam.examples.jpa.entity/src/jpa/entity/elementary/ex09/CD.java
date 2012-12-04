package jpa.entity.elementary.ex09;
import javax.persistence.*;
import java.util.HashMap;


@Entity
@Table(name = "elementary_ex09_cd")
public class CD {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Float price;
    private String description;
    @Lob
    private byte[] cover;
    //@ElementCollection TODO
//    @CollectionTable(name="Track")
    //@MapKeyColumn (name = "Position")
    //@Column(name = "title")
    //private HashMap<Integer, String> tracks;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CD() {
    }

    public CD(String title, Float price, String description, HashMap<Integer, String> tracks) {
        this.title = title;
        this.price = price;
        this.description = description;
        //this.tracks = tracks;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

//    public Map<Integer, String> getTracks() {
//        return tracks;
//    }
//
//    public void setTracks(HashMap<Integer, String> tracks) {
//        this.tracks = tracks;
//    }
}
