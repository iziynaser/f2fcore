package com.f2f.controller;

import com.f2f.entity.EmailAddress;
import com.f2f.service.EmailAddressService;
import com.revengemission.sso.oauth2.server.domain.AlreadyExistsException;
import com.revengemission.sso.oauth2.server.domain.GlobalConstant;
import com.revengemission.sso.oauth2.server.domain.JsonObjects;
import com.revengemission.sso.oauth2.server.domain.ResponseResult;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@CrossOrigin("*")
public class EmailAddressController {

    private org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
EmailAddressService emailAddressService ;

    public JsonObjects<EmailAddress> lisOfEmailAddress(){
       // List<EmailAddress> li = emailAddressService.list();
        return null;
    }

    @ResponseBody
    @PostMapping("/f2f/emailAdress/create")
    public EmailAddress cerate(@RequestBody EmailAddress emailAddress){
        ResponseResult<Object> responseResult = new ResponseResult<>();
        try {
            emailAddressService.create(emailAddress);
        }catch (AlreadyExistsException ale){
            if(log.isErrorEnabled()){
                log.error("email address alreay exist"+emailAddress.toString());
            }
            responseResult.setStatus(GlobalConstant.ERROR);
            responseResult.setMessage("email address already exist");
        }catch (Exception ex){
            if(log.isErrorEnabled()){
                log.error("create email exception"+ex.toString());
            }
            responseResult.setStatus(GlobalConstant.ERROR);
            responseResult.setMessage("error please try agian");
        }
        return emailAddress;
    }
}
