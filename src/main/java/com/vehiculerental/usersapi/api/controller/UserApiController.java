package com.vehiculerental.usersapi.api.controller;

import com.vehiculerental.usersapi.hashComponent.ComponentSHA1;
import com.vehiculerental.usersapi.model.User;
import com.vehiculerental.usersapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> usersList() {
        return userRepository.findAll();
    }

    @GetMapping("users/{id}")
    public Optional<User> findById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        String shaPassword = ComponentSHA1.getSha1(user.getPassword());
        user.setPassword(shaPassword);
        Date date = new Date();
        user.setCreatedAt(date);
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        Optional<User> currentUser = this.findById(id);
        if (currentUser.isPresent()) {

            if (user.getFirstName() != null) {
                currentUser.get().setFirstName(user.getFirstName());
            }
            if (user.getLastName() != null) {
                currentUser.get().setLastName(user.getLastName());
            }
            if (user.getBirthDate() != null) {
                currentUser.get().setBirthDate(user.getBirthDate());
            }
            if (user.getLicenseDate() != null) {
                currentUser.get().setLicenseDate(user.getLicenseDate());
            }
            if (user.getLicenseNumber() != null) {
                currentUser.get().setLicenseNumber(user.getLicenseNumber());
            }
            Date date = new Date();
            currentUser.get().setUpdatedAt(date);
            return userRepository.save(currentUser.get());
        }
        return null;
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable String id) {
        userRepository.deleteById(id);
    }



}
