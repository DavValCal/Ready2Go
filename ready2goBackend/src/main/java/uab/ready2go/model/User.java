package uab.ready2go.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "password_validated")
    private Boolean passwordValidated;

    @Column(name = "oauth_platform")
    private String oauthPlatform;

    @Column(name = "token")
    private String token;

    @Column(name = "refresh_token")
    private String refreshToken;

    @ManyToMany
    @JoinTable(
            name = "preferences",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_tag_name"))
    List<Tag> preferences;

    @ManyToMany
    @JoinTable(
            name = "friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id1"))
    List<User> friends;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordValidated(Boolean passwordValidated) {
        this.passwordValidated = passwordValidated;
    }

    public Boolean isPasswordValidated() {
        return passwordValidated;
    }

    public void setOauthPlatform(String oauthPlatform) {
        this.oauthPlatform = oauthPlatform;
    }

    public String getOauthPlatform() {
        return oauthPlatform;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public List<Tag> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Tag> preferences) {
        this.preferences = preferences;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "surname=" + surname + '\'' +
                "urlImage=" + urlImage + '\'' +
                "email=" + email + '\'' +
                "password=" + password + '\'' +
                "passwordValidated=" + passwordValidated + '\'' +
                "oauthPlatform=" + oauthPlatform + '\'' +
                "token=" + token + '\'' +
                "refreshToken=" + refreshToken + '\'' +
                '}';
    }
}
