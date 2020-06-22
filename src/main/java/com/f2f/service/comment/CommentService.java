package com.f2f.service.comment;

import com.f2f.dao.comment.CommentDTO;
import com.f2f.dao.comment.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PreAuthorize("isAuthenticated()")
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    public List<CommentDTO> getListOfComments(){
        List<CommentDTO> commentDTOS = commentDao.getListOfCommentsNative();
        return commentDTOS;
    }
}
