package com.example.gymplanner.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "name") String name, @RequestParam(value = "birthday") String birthday) {
        return new User(counter.incrementAndGet(), name, LocalDate.parse(birthday));
    }
}
