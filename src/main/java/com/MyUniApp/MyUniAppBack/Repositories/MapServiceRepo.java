package com.MyUniApp.MyUniAppBack.Services;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MapServiceRepo extends MongoRepository<InterestPoint,String> {



}
