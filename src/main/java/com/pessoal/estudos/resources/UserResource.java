package com.pessoal.estudos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pessoal.estudos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User teste = new User(1L, "Marlene", "marlene@gmail.com", "777", "3213");
        return ResponseEntity.ok().body(teste);
    }
}