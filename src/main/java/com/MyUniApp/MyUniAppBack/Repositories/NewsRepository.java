package com.MyUniApp.MyUniAppBack.Repositories;

import com.MyUniApp.MyUniAppBack.Model.AppNew;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<AppNew,Integer> {
}
