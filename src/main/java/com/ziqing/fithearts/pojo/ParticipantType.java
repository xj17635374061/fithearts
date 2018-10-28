package com.ziqing.fithearts.pojo;

import java.util.Date;

public class ParticipantType {
    private Integer id;

    private String ptype_name;

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

    public String getPtype_name() {
        return ptype_name;
    }

    public void setPtype_name(String ptype_name) {
        this.ptype_name = ptype_name == null ? null : ptype_name.trim();
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