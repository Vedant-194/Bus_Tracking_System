package com.example.TrackBus.route.repository;

import com.example.TrackBus.route.entity.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<Route,String> {

}
