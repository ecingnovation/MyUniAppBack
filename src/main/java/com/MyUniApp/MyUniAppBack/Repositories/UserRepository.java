package com.MyUniApp.MyUniAppBack.Repositories;

import com.MyUniApp.MyUniAppBack.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
