package com.vehiculerental.usersapi.api.controller;

import com.vehiculerental.usersapi.model.User;
import com.vehiculerental.usersapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable String id, User user) {
        Optional<User> currentUser = this.findById(id);
        if (currentUser.isPresent()) {

            if (user.getFirstname() != null) {
                currentUser.get().setFirstname(user.getFirstname());
            }
            if (user.getLastname() != null) {
                currentUser.get().setLastname(user.getLastname());
            }
            if (user.getBirthdate() != null) {
                currentUser.get().setBirthdate(user.getBirthdate());
            }
            if (user.getLicensedate() != null) {
                currentUser.get().setLicensedate(user.getLicensedate());
            }
            if (user.getLicensenumber() != null) {
                currentUser.get().setLicensenumber(user.getLicensenumber());
            }

            return userRepository.save(currentUser.get());
        }
        return null;
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable String id) {
        userRepository.deleteById(id);
    }


}
