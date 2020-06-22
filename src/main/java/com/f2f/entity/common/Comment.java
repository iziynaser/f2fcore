package com.f2f.entity.common;

import com.revengemission.sso.oauth2.server.persistence.entity.BaseEntity;
import com.revengemission.sso.oauth2.server.persistence.entity.UserAccountEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COMMENT")
public class Comment extends BaseEntity implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name ="COMMENT_ID")
//    private Integer id;

    @Column(name = "SUBJECT")
    private String subject ;

    @Column(name = "BENEFITS")
    private String benefits;

    @Column(name = "DISADVANTAGES")
    private String disadvatages;

    @Column(name = "BODY")
    private String body ;

//    @Column(name = "DATE_CREATED")
//    private String dateCreated ;
//
//    @Column(name = "DATE_MODIFIED")
//    private String dateModified ;

    @OneToOne
    @JoinColumn(name = "USER_ACCOUNT")
    private UserAccountEntity userAccountEntity;

    @OneToOne(mappedBy = "comment",cascade = CascadeType.ALL)
    private CommentLikes commentLikes;

    public Comment() {
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDisadvatages() {
        return disadvatages;
    }

    public void setDisadvatages(String disadvatages) {
        this.disadvatages = disadvatages;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public String getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(String dateCreated) {
//        this.dateCreated = dateCreated;
//    }

//    public String getDateModified() {
//        return dateModified;
//    }
//
//    public void setDateModified(String dateModified) {
//        this.dateModified = dateModified;
//    }

    public UserAccountEntity getUserAccountEntity() {
        return userAccountEntity;
    }

    public void setUserAccountEntity(UserAccountEntity userAccountEntity) {
        this.userAccountEntity = userAccountEntity;
    }

    public CommentLikes getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(CommentLikes commentLikes) {
        this.commentLikes = commentLikes;
    }
}
