package com.f2f.front;

import com.f2f.entity.content.Content;
import com.f2f.service.content.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("frontContentController")
@RequestMapping("/front/content")
public class frontContentController {
    @Autowired
    private ContentService contentService;

    @ResponseBody
    @GetMapping("/load")
    public Content getContentByCode(String code, String language){
        Content content = contentService.getContentByCodeAndLangauge(code,language);
        return content;
    }
}
