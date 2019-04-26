package com.MyUniApp.MyUniAppBack.Controller;


import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://myuniapp-eci.firebaseapp.com"})
//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/map")

public class MapController {

    @Autowired
    MapService ms;




    @RequestMapping(value = "/points", method = RequestMethod.GET)
    public List<InterestPoint> getAllInterestPoints() {
        List<InterestPoint> json = ms.getInterestPointsList();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/points/{id}", method = RequestMethod.GET)
    public InterestPoint getInterestPointById(@PathVariable("id") String id) {
        InterestPoint json = ms.getInterestPointById(id);
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/points",
            produces = "application/json",
            method=RequestMethod.POST)
    public ResponseEntity<?> createPoint(String id, String title, String label, double lng, double lat, String description){
            ms.createInterestPoint(description,title,label,lng,lat,id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }

    @RequestMapping(path = "/points/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> removePlayer(@PathVariable("id") String id) {
        ms.deleteInterestPoint(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }
}

