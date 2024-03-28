package uab.ready2go.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_planning", nullable = false)
    private Boolean createPlanning;

    @Column(name = "delete_planning", nullable = false)
    private Boolean deletePlanning;

    @Column(name = "add_activity", nullable = false)
    private Boolean addActivity;

    @Column(name = "move_activity", nullable = false)
    private Boolean moveActivity;

    @Column(name = "delete_activity", nullable = false)
    private Boolean deleteActivity;

    @Column(name = "add_image", nullable = false)
    private Boolean addImage;

    @Column(name = "remove_image", nullable = false)
    private Boolean removeImage;

    @Column(name = "see_images", nullable = false)
    private Boolean seeImages;

    @Column(name = "add_travelers", nullable = false)
    private Boolean addTravelers;

    @Column(name = "remove_travelers", nullable = false)
    private Boolean removeTravelers;

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

    public void setCreatePlanning(Boolean createPlanning) {
        this.createPlanning = createPlanning;
    }

    public Boolean isCreatePlanning() {
        return createPlanning;
    }

    public void setDeletePlanning(Boolean deletePlanning) {
        this.deletePlanning = deletePlanning;
    }

    public Boolean isDeletePlanning() {
        return deletePlanning;
    }

    public void setAddActivity(Boolean addActivity) {
        this.addActivity = addActivity;
    }

    public Boolean isAddActivity() {
        return addActivity;
    }

    public void setMoveActivity(Boolean moveActivity) {
        this.moveActivity = moveActivity;
    }

    public Boolean isMoveActivity() {
        return moveActivity;
    }

    public void setDeleteActivity(Boolean deleteActivity) {
        this.deleteActivity = deleteActivity;
    }

    public Boolean isDeleteActivity() {
        return deleteActivity;
    }

    public void setAddImage(Boolean addImage) {
        this.addImage = addImage;
    }

    public Boolean isAddImage() {
        return addImage;
    }

    public void setRemoveImage(Boolean removeImage) {
        this.removeImage = removeImage;
    }

    public Boolean isRemoveImage() {
        return removeImage;
    }

    public void setSeeImages(Boolean seeImages) {
        this.seeImages = seeImages;
    }

    public Boolean isSeeImages() {
        return seeImages;
    }

    public void setAddTravelers(Boolean addTravelers) {
        this.addTravelers = addTravelers;
    }

    public Boolean isAddTravelers() {
        return addTravelers;
    }

    public void setRemoveTravelers(Boolean removeTravelers) {
        this.removeTravelers = removeTravelers;
    }

    public Boolean isRemoveTravelers() {
        return removeTravelers;
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
        return "Permission{" +
                "id=" + id + '\'' +
                "createPlanning=" + createPlanning + '\'' +
                "deletePlanning=" + deletePlanning + '\'' +
                "addActivity=" + addActivity + '\'' +
                "moveActivity=" + moveActivity + '\'' +
                "deleteActivity=" + deleteActivity + '\'' +
                "addImage=" + addImage + '\'' +
                "removeImage=" + removeImage + '\'' +
                "seeImages=" + seeImages + '\'' +
                "addTravelers=" + addTravelers + '\'' +
                "removeTravelers=" + removeTravelers + '\'' +
                "userId=" + userId + '\'' +
                "travelId=" + travelId + '\'' +
                '}';
    }
}
