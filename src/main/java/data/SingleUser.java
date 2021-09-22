package data;

import org.testng.Assert;

public class SingleUser {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;


    public SingleUser() {
        super();
    }

    public SingleUser(Integer id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void asserFieldsNotNull() {
        Assert.assertNotNull(id, "Поле id у пользователя " + first_name + " пустое");
        Assert.assertNotNull(email, "Поле email у пользователя " + id + " пустое");
        Assert.assertNotNull(first_name, "Поле first_name у пользователя " + id + " пустое");
        Assert.assertNotNull(last_name, "Поле last_name у пользователя " + id + " пустое");
        Assert.assertNotNull(avatar, "Поле avatar у пользователя " + id + " пустое");
    }
}
