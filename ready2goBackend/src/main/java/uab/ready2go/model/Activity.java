package uab.ready2go.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "activity")
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tag", nullable = false)
    private String tag;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "time_unit")
    private Integer timeUnit;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "travel_id", nullable = false)
    private Integer travelId;

    @Column(name = "api_id")
    private String apiId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public Integer getTravelId() {
        return travelId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getApiId() {
        return apiId;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id + '\'' +
                "tag=" + tag + '\'' +
                "name=" + name + '\'' +
                "startDate=" + startDate + '\'' +
                "endDate=" + endDate + '\'' +
                "timeUnit=" + timeUnit + '\'' +
                "urlImage=" + urlImage + '\'' +
                "mobileNumber=" + mobileNumber + '\'' +
                "price=" + price + '\'' +
                "travelId=" + travelId + '\'' +
                "apiId=" + apiId + '\'' +
                '}';
    }
}
