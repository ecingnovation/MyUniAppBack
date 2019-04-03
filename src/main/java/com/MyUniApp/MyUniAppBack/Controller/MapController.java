package com.MyUniApp.MyUniAppBack.Controller;


import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Services.MapService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/map")
public class MapController {

    @Autowired
    MapService ms;


    @RequestMapping(value = "/points", method = RequestMethod.GET)
    public List<InterestPoint> getAllInterestPoints() {
        List<InterestPoint> json = ms.getInterestPointsList();
        //System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/points/{id}", method = RequestMethod.GET)
    public InterestPoint getInterestPointById(@PathVariable("id") String id) {
        InterestPoint json = ms.getInterestPointById(id);
        System.out.println(json);
        return json;
    }
}

