package life.com.community.dto;

/**
 * @Author : denglong
 * @Description:
 * @Date: Created 17:42 2019/8/13
 * @Modified By:
 */
public class GithubUser {

    private String name;

    private Long id;

    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
