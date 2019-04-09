package com.MyUniApp.MyUniAppBack.Services.MapServiceImp;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.MyUniApp.MyUniAppBack.Persistence.MongoConnection;
import com.MyUniApp.MyUniAppBack.Services.MapService;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MapServiceMongo implements MapService {
    private Datastore datastore = MongoConnection.getConnection();


    @Override
    public List<InterestPoint> getInterestPointsList() {

        return datastore.createQuery(InterestPoint.class).asList();
    }


    @Override
    public InterestPoint getInterestPointById(String id) {

        return  datastore.createQuery(InterestPoint.class).field("id").equal(id).get();
    }

    @Override
    public InterestPoint createInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoint ip = new InterestPoint(id,description,title,label,lng,lat);;

        datastore.save(ip);
        return ip;
    }

    @Override
    public InterestPoint updateInterestPoint(String description, String title, String label, double lng, double lat, String id) {
        InterestPoint ip = new InterestPoint(id,description,title,label,lng,lat);;
        datastore.save(ip);
        return ip;
    }

    @Override
    public void deleteInterestPoint(String id) {
        Query<InterestPoint> query = datastore.createQuery(InterestPoint.class).filter("id =", id);
        datastore.delete(query);
    }
}

