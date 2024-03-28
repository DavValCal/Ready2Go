package uab.ready2go.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "tag_name", nullable = false)
    private String tagName;

    @ManyToMany(mappedBy = "preferences")
    List<User> users;

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagName=" + tagName + '\'' +
                '}';
    }
}
