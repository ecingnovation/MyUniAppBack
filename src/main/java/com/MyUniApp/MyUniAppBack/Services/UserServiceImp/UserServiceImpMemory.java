package com.MyUniApp.MyUniAppBack.Services.UserServiceImp;

import com.MyUniApp.MyUniAppBack.Exceptions.UserException;
import com.MyUniApp.MyUniAppBack.Model.User;
import com.MyUniApp.MyUniAppBack.Services.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;

@Service
public class UserServiceImpMemory implements UserService {

    private HashMap<String,User> userHashMap = new HashMap<String, User>();

    @PostConstruct
    private void populateSampleData()
    {
        userHashMap.put("admin", new User("admin", "admin", "admin@admin.com", 123, "admin"));
        userHashMap.put("test@mail.com", new User("Juan", "Suarez", "juan.suarez@mail.com", 123, "password"));
    }

    @Override
    public List<User> getUsersList() {
        List<User> users = new ArrayList<User>(userHashMap.values());
        return users;
    }

    @Override
    public User getUser(String userId) throws UserException {
        if(!userHashMap.containsKey(userId)){
            throw new UserException(UserException.NOT_FOUND);
        }
        User user = userHashMap.get(userId);
        return user;
    }

    @Override
    public User createUser(User user) throws UserException {
        user.setId(user.getEmail());
        if(userHashMap.containsKey(user.getId())){
            throw new UserException(UserException.ALREADY_EXISTS);
        }
        userHashMap.put(user.getId(),user);
        System.out.println(user.toString());
        return user;
    }

    @Override
    public User updateUser(User user) throws UserException{
        if(!userHashMap.containsKey(user.getId())){
            throw new UserException(UserException.NOT_FOUND);
        }
        userHashMap.replace(user.getId(),user);
        return user;
    }

    @Override
    public void removeUser(String userId) throws UserException {
        if(!userHashMap.containsKey(userId)){
            throw new UserException(UserException.NOT_FOUND);
        }
        userHashMap.remove(userId);
    }
}
