package com.MyUniApp.MyUniAppBack.Persistence;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import java.net.UnknownHostException;

public class MongoConnection {

    public static Datastore getConnection() {
        final Morphia morphia = new Morphia();
        morphia.mapPackage("com.test.beans");
        final Datastore datastore = morphia.createDatastore(new MongoClient(new MongoClientURI("mongodb://admin:admin@cluster0-shard-00-00-tjnvl.mongodb.net:27017,cluster0-shard-00-01-tjnvl.mongodb.net:27017,cluster0-shard-00-02-tjnvl.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin")),
                "MyUniAppData");
        datastore.ensureIndexes();
        return datastore;
    }
}
