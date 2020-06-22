package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "COMMENT_TARGET")
public class CommentTarget extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name ="COMMENT_TARGET_ID")
//    private Integer id;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "COMMENT_TARGET_ID",nullable = false)
    private List<Comment> comments;

    @Column(name = "DATE_CREATED")
    private String dateCreated ;

    @Column(name = "DATE_MODIFIED")
    private String dateModified ;

    public CommentTarget() {
    }

    public CommentTarget(List<Comment> comments, String dateCreated, String dateModified) {
        this.comments = comments;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

//    public String getDateCreated() {
//        return dateCreated;
//    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
