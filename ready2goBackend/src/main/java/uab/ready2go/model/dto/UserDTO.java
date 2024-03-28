package uab.ready2go.model.dto;

public class UserDTO {
    private Integer id;

    private String name;

    private String surname;

    private String urlImage;

    private String email;

    private String password;

    private Boolean passwordValidated;

    private String oauthPlatform;

    private String token;

    private String refreshToken;

    public UserDTO() {
    }

    public UserDTO(Integer id, String name, String surname, String urlImage, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.urlImage = urlImage;
        this.email = email;
        this.password = password;
    }

    public UserDTO(Integer id, String name, String surname, String urlImage, String email, String password, Boolean passwordValidated, String oauthPlatform, String token, String refreshToken) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.urlImage = urlImage;
        this.email = email;
        this.password = password;
        this.passwordValidated = passwordValidated;
        this.oauthPlatform = oauthPlatform;
        this.token = token;
        this.refreshToken = refreshToken;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getPasswordValidated() {
        return passwordValidated;
    }

    public String getOauthPlatform() {
        return oauthPlatform;
    }

    public String getToken() {
        return token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordValidated(Boolean passwordValidated) {
        this.passwordValidated = passwordValidated;
    }

    public void setOauthPlatform(String oauthPlatform) {
        this.oauthPlatform = oauthPlatform;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordValidated=" + passwordValidated +
                ", oauthPlatform='" + oauthPlatform + '\'' +
                ", token='" + token + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
