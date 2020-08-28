package com.f2f.entity.content;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CONTENT")
public class Content extends BaseEntity implements Serializable {

    @Lob
    private String Body ;

    @Column(name = "CODE")
    private String code ;

    @Column(name = "DATE")
    private String date;

    @Column(name = "LANGUAGE")
    private String language ;

//    @Column(name = "STATUS")
//    private String status ;

    @Column(name = "TITLE")
    private String title ;

    @Column(name = "name")
    private String name;

    @Column(name = "seq",columnDefinition = "short default 0")
    private short seq;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "CONTENT_TAG" ,
            joinColumns = @JoinColumn(name = "CONTENT_ID") ,
            inverseJoinColumns = @JoinColumn(name = "TAG_ID")
    )
    private List<Tag> tags = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "CONTENT_RELATED_CONTENT" ,
            joinColumns = {@JoinColumn(name = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "RELATED_CONTENT_ID")})
    private List<Content> relatedContents = new ArrayList<>();


    public List<Content> getRelatedContents() {
        return relatedContents;
    }

    public void setRelatedContents(List<Content> relatedContents) {
        this.relatedContents = relatedContents;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getSeq() {
        return seq;
    }

    public void setSeq(short seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
