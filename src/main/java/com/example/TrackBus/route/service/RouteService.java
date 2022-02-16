package com.example.TrackBus.route.service;

import com.example.TrackBus.route.entity.Route;
import com.example.TrackBus.route.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RouteService {

    @Autowired
    RouteRepository routeRepository;

    public List<Route> getAllRoutes(){
        List<Route> routes = new ArrayList<>();
        routeRepository.findAll().forEach( route -> routes.add(route));
        return routes;
    }

    public Route getRouteById( String routeId){
        Optional<Route> route = routeRepository.findById(routeId);
        return route.get();
    }

    public Route saveRoute( Route route ){
        return routeRepository.save( route );
    }

}
