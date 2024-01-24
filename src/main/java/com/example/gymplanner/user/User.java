package com.example.gymplanner.user;

import java.time.LocalDate;

public record User(long id, String name, LocalDate birthday) {
}
