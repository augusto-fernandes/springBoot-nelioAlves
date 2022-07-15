package com.devsuperior.course.entities.resources;

import com.devsuperior.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User>findAll(){
        User u = new User(1L,"Maria", "Maria@gmail","99999", "1234");
        return ResponseEntity.ok().body(u);
    }

}
