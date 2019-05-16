package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.AppNew;
import com.MyUniApp.MyUniAppBack.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<AppNew> getAllNews() {
        List<AppNew> value = newsService.getAllNews();
        return value;
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void postNew(@RequestBody AppNew appNew) {
        newsService.postNew(appNew);
    }
    
}

