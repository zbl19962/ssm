package com.example.pojo;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User : 51103942@qq.com
 * Date : 2018/1/3
 * Time : 10:47
 * Talk is cheap. Show me the code.
 */
@Entity
@Table(name = "t_blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    private String title;
    private String context;
    private String createTime;
    private String fonts;
    private String fileLocation;
    private String photo;//封面

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name="user_id", referencedColumnName="uid")//外键为user_id，与user中的id关联
    private User user;


    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Categories.class)
    @JoinColumn(name="categories_id", referencedColumnName="cid")//外键为user_id，与user中的id关联
    private Categories categories;
    public Blog(){

    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFonts() {
        return fonts;
    }

    public void setFonts(String fonts) {
        this.fonts = fonts;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
