package com.MyUniApp.MyUniAppBack.Services;

import com.MyUniApp.MyUniAppBack.Exceptions.UserException;
import com.MyUniApp.MyUniAppBack.Model.User;

import java.util.List;

public interface UserService {

        List<User> getUsersList();

        User getUser(String userId) throws UserException;

        User createUser(User user) throws UserException;

        User updateUser(User user) throws UserException;

        void removeUser(String userId) throws UserException;

}
