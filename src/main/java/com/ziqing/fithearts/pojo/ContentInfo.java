package com.ziqing.fithearts.pojo;

import java.util.Date;

public class ContentInfo {
    private Integer id;

    private String typecode;

    private String title;

    private String icon_path;

    private String image_path;

    private Date create_time;

    private Date modify_time;

    private String is_del;

    private String value_one;

    private String content_info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon_path() {
        return icon_path;
    }

    public void setIcon_path(String icon_path) {
        this.icon_path = icon_path == null ? null : icon_path.trim();
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path == null ? null : image_path.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getIs_del() {
        return is_del;
    }

    public void setIs_del(String is_del) {
        this.is_del = is_del == null ? null : is_del.trim();
    }

    public String getValue_one() {
        return value_one;
    }

    public void setValue_one(String value_one) {
        this.value_one = value_one == null ? null : value_one.trim();
    }

    public String getContent_info() {
        return content_info;
    }

    public void setContent_info(String content_info) {
        this.content_info = content_info == null ? null : content_info.trim();
    }
}