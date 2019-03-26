package com.MyUniApp.MyUniAppBack.Services.MapServiceImp;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Services.MapService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MapServiceImpMemory implements MapService {
    HashMap<String, InterestPoint> InterestPoints = new HashMap<>();

    @Override
    public List<InterestPoint> getInterestPointsList() {
        mockData();
        List<InterestPoint> list = new ArrayList<InterestPoint>(InterestPoints.values());
        return list;
    }

    private void mockData() {
        for(int i=0;i<10;i++){
            InterestPoints.put(""+i,new InterestPoint("Mock"+i,"tite"+i,"label"+i,i,i,""+i));
        }

    }

    @Override
    public InterestPoint getInterestPointById(String id) {
        return InterestPoints.get(id);
    }

    @Override
    public InterestPoint createInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoints.put(id,new InterestPoint(description,title,label,lng,lat,id));
        return InterestPoints.get(id);
    }

    @Override
    public InterestPoint updateInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoints.put(id,new InterestPoint(description,title,label,lng,lat,id));
        return InterestPoints.get(id);
    }
}

