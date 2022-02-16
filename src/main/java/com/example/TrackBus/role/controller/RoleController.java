package com.example.TrackBus.role.controller;

import com.example.TrackBus.role.entity.Role;
import com.example.TrackBus.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable("id") Integer id){
        return roleService.getRoleById( id );
    }

    @PutMapping
    public Role saveRole( @RequestBody Role role ){
        return roleService.saveRole( role );
    }

}
