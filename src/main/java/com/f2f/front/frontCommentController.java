package com.f2f.front;

import com.f2f.dao.comment.CommentDTO;
import com.f2f.entity.common.KeyValues;
import com.f2f.service.comment.CommentService;
import com.f2f.service.comment.CommentTargetService;
import com.f2f.service.product.ProductService;
import com.revengemission.sso.oauth2.server.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("frontCommentController")
@RequestMapping("/front/comments")
public class frontCommentController {
    @Autowired
    CommentService commentService;

    @ResponseBody
    @RequestMapping("/list")
    public List<CommentDTO> getListOfCommentsForProductId(Long productId){
        List<CommentDTO> commentList = commentService.getListOfCommentsForProductId(productId);
        return commentList;
    }

    @RequestMapping("/count")
    public KeyValues getCommentCount(){
        KeyValues kv = new KeyValues("result","10");
        return  kv;
    }
}
