package com.example.TrackBus.user.util;


import com.example.TrackBus.role.entity.Role;

public class UserUtils {

    public static Role getDefaultRole(){
        return new Role( 3, "Passenger", "view buses,view routes" );
    }
}
