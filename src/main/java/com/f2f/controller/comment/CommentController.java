package com.f2f.controller.comment;

import com.f2f.dao.comment.CommentDTO;
import com.f2f.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/f2f/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @ResponseBody
    @RequestMapping("/list")
    public List<CommentDTO> getListOfComments(){
        List<CommentDTO> commentDTOS = commentService.getListOfComments();
        return commentDTOS;
    }

}
