package com.MyUniApp.MyUniAppBack.Services.MapServiceImp;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Services.MapService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MapServiceImpMemory implements MapService {
    HashMap<String, InterestPoint> InterestPoints = new HashMap<>();

    @Override
    public List<InterestPoint> getInterestPointsList() {
        mockData();
        List<InterestPoint> list = new ArrayList<InterestPoint>(InterestPoints.values());
        return list;
    }

    private void mockData() {

            InterestPoints.put("0",new InterestPoint("1","A","A","A",-74.0427843,4.7827587));
            InterestPoints.put("1",new InterestPoint("2","B","B","B",-74.0427804,4.7828577));
            InterestPoints.put("2",new InterestPoint("3","C","C","c",-74.0422877,4.7824575));


    }

    @Override
    public InterestPoint getInterestPointById(String id) {
        return InterestPoints.get(id);
    }

    @Override
    public InterestPoint createInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoints.put(id,new InterestPoint(id,description,title,label,lng,lat));
        return InterestPoints.get(id);
    }

    @Override
    public InterestPoint updateInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoints.put(id,new InterestPoint(id,description,title,label,lng,lat));
        return InterestPoints.get(id);
    }

    @Override
    public void deleteInterestPoint(String id) {

    }
}

