package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.Administrative;
import com.MyUniApp.MyUniAppBack.Model.Student;
import com.MyUniApp.MyUniAppBack.Model.Teacher;
import com.MyUniApp.MyUniAppBack.Model.User;
import com.MyUniApp.MyUniAppBack.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/private/all")
    public ResponseEntity<?> getUser(){
        try{
            return new ResponseEntity<>(userRepository.findAll(), HttpStatus.ACCEPTED);
        }catch(Exception ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/private/{id}")
    public ResponseEntity<?> getUserById(@PathVariable ("id") String id){
        if(userRepository.findById(id).isPresent()){
            return new ResponseEntity<>(userRepository.findById(id).get(),HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/private/")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        if(userRepository.findById(user.getId()).isPresent()) {
            return new ResponseEntity<>(userRepository.save(user), HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> createUser(User user){
        user.setId(user.getEmail());
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="/public/createstudent", method=RequestMethod.POST)
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return createUser(student);
    }

    @RequestMapping(value="/public/createteacher", method=RequestMethod.POST)
    public ResponseEntity<?> createTeacher(@RequestBody Teacher teacher) {
        return createUser(teacher);
    }

    @RequestMapping(value="/public/createadministrative", method=RequestMethod.POST)
    public ResponseEntity<?> createAdministrative(@RequestBody Administrative admin) {
        return createUser(admin);
    }

    @DeleteMapping("/private/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id){
        if(userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
    }
}
