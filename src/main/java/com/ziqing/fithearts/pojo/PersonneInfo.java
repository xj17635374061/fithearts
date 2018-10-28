package com.ziqing.fithearts.pojo;

import java.util.Date;

public class PersonneInfo {
    private Integer id;

    private String name;

    private String email;

    private String phone_or_wechat;

    private Integer participantid;

    private String message;

    private String url;

    private String comname;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone_or_wechat() {
        return phone_or_wechat;
    }

    public void setPhone_or_wechat(String phone_or_wechat) {
        this.phone_or_wechat = phone_or_wechat == null ? null : phone_or_wechat.trim();
    }

    public Integer getParticipantid() {
        return participantid;
    }

    public void setParticipantid(Integer participantid) {
        this.participantid = participantid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
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