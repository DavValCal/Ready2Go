package uab.ready2go.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "expense")
public class Expense implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "travel_id", nullable = false)
    private Integer travelId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public Integer getTravelId() {
        return travelId;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id + '\'' +
                "description=" + description + '\'' +
                "userId=" + userId + '\'' +
                "travelId=" + travelId + '\'' +
                '}';
    }
}
