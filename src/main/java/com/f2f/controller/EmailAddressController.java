package com.f2f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@CrossOrigin("*")
public class EmailAddressController {

//    private org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    EmailAddressService emailAddressService ;
//
//    public JsonObjects<EmailAddress> lisOfEmailAddress(){
//        //emailAddressService.list()
//        return null;
//    }
//
//    @ResponseBody
//    @PostMapping("/f2f/emailAdress/create")
//    public EmailAddress cerate(@RequestBody EmailAddress emailAddress){
//        ResponseResult<Object> responseResult = new ResponseResult<>();
//        try {
//            emailAddressService.create(emailAddress);
//        }catch (AlreadyExistsException ale){
//            if(log.isErrorEnabled()){
//                log.error("email address alreay exist"+emailAddress.toString());
//            }
//            responseResult.setStatus(GlobalConstant.ERROR);
//            responseResult.setMessage("email address already exist");
//        }catch (Exception ex){
//            if(log.isErrorEnabled()){
//                log.error("create email exception"+ex.toString());
//            }
//            responseResult.setStatus(GlobalConstant.ERROR);
//            responseResult.setMessage("error please try agian");
//        }
//        return emailAddress;
//    }
}
