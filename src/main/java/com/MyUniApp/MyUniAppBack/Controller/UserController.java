package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Exceptions.UserException;
import com.MyUniApp.MyUniAppBack.Model.Administrative;
import com.MyUniApp.MyUniAppBack.Model.Student;
import com.MyUniApp.MyUniAppBack.Model.Teacher;
import com.MyUniApp.MyUniAppBack.Model.User;
import com.MyUniApp.MyUniAppBack.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/All")
    public ResponseEntity<?> getUser(){
        try{
            return new ResponseEntity<>(userService.getUsersList(), HttpStatus.ACCEPTED);
        }catch(Exception ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable ("id") String id){
        try{
            return new ResponseEntity<>(userService.getUser(id),HttpStatus.ACCEPTED);
        } catch (UserException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user){
        try {
            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.ACCEPTED);
        } catch (UserException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    
    public ResponseEntity<?> createUser(User user){
        try{
            return new ResponseEntity<>(userService.createUser(user), HttpStatus.ACCEPTED);
        } catch (UserException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(value="/createstudent", method=RequestMethod.POST)
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return createUser(student);
    }

    @RequestMapping(value="/createteacher", method=RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@RequestBody Teacher teacher) {
        return createUser(teacher);
    }

    @RequestMapping(value="/createadministrative", method=RequestMethod.POST)
    public ResponseEntity<?> createAdministrative(@RequestBody Administrative admin) {
        return createUser(admin);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id){
        try{
            userService.removeUser(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (UserException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
