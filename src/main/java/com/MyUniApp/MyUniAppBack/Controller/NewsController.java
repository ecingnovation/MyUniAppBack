package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.AppNew;

import com.MyUniApp.MyUniAppBack.Repositories.NewsRepository;
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
    NewsRepository newsRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<AppNew> getAllNews() {
        List<AppNew> value = newsRepository.findAll();
        return value;
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void postNew(@RequestBody AppNew appNew) {
        appNew.setId(newsRepository.findAll().size() + 1);
        newsRepository.save(appNew);
    }
    
}

