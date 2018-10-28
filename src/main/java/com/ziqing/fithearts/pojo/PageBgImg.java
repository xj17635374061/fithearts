package com.ziqing.fithearts.pojo;

import java.util.Date;

public class PageBgImg {
    private Integer id;

    private String img_placement;

    private String pageinfo;

    private String bg_img_path;

    private Date create_time;

    private Date modify_time;

    private String is_del;

    private String value_one;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg_placement() {
        return img_placement;
    }

    public void setImg_placement(String img_placement) {
        this.img_placement = img_placement == null ? null : img_placement.trim();
    }

    public String getPageinfo() {
        return pageinfo;
    }

    public void setPageinfo(String pageinfo) {
        this.pageinfo = pageinfo == null ? null : pageinfo.trim();
    }

    public String getBg_img_path() {
        return bg_img_path;
    }

    public void setBg_img_path(String bg_img_path) {
        this.bg_img_path = bg_img_path == null ? null : bg_img_path.trim();
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
}