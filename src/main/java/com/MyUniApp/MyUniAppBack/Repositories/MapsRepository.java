package com.MyUniApp.MyUniAppBack.Repositories;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MapsRepository extends MongoRepository<InterestPoint,String> {
}
