package com.example.TrackBus.role.service;

import com.example.TrackBus.role.entity.Role;
import com.example.TrackBus.role.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        List<Role> roles = new ArrayList<>();
        roleRepository.findAll().forEach( role -> roles.add(role));
        return roles;

    }

    public Role getRoleById( Integer roleId){
        Optional<Role> role = roleRepository.findById(roleId);
        return role.get();
    }

    public Role saveRole( Role role ){
        return roleRepository.save( role );
    }
}
