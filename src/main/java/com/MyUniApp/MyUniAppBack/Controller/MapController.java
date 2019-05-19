package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Repositories.MapsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/map")
public class MapController {

    @Autowired
    MapsRepository ms;

    @RequestMapping(value = "/points", method = RequestMethod.GET)
    public List<InterestPoint> getAllInterestPoints() {
        List<InterestPoint> json = ms.findAll();

        return json;
    }

    @RequestMapping(value = "/points/{id}", method = RequestMethod.GET)
    public InterestPoint getInterestPointById(@PathVariable("id") String id) {
        InterestPoint json = ms.findById(id).get();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/points",
            produces = "application/json",
            method=RequestMethod.POST)
    public ResponseEntity<?> createPoint(String id, String title, String label, Double lng, Double lat, String description, String image){
            ms.save(new InterestPoint(id,description,title,label,lng,lat,image));
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "/points/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> removePlayer(@PathVariable("id") String id) {
        ms.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}

