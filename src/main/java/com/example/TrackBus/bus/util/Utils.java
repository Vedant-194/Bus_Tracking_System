package com.example.TrackBus.bus.util;

import com.example.TrackBus.role.entity.Role;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static Role getDefaultRole(){
        return new Role( 3, "Passenger", "view buses,view routes" );
    }

    public static String getCurrentDateAsString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.now().format( formatter );
    }
}
