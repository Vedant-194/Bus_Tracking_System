package com.example.TrackBus.role.repository;

import com.example.TrackBus.role.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//WHat have I done?
//Created a class and annotated it with anotation Repository
@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {

}
