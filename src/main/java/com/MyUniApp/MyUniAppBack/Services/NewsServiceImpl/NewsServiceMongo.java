package com.MyUniApp.MyUniAppBack.Services.NewsServiceImpl;

import com.MyUniApp.MyUniAppBack.Model.AppNew;
import com.MyUniApp.MyUniAppBack.Persistence.MongoConnection;
import com.MyUniApp.MyUniAppBack.Services.NewsService;
import org.mongodb.morphia.Datastore;
import java.util.List;

public class NewsServiceMongo implements NewsService {
    private Datastore datastore = MongoConnection.getConnection();

    @Override
    public List<AppNew> getAllNews() {
        return null;
    }

    @Override
    public void postNew(AppNew appNew) {

    }
}