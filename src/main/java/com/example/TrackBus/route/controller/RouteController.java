package com.example.TrackBus.route.controller;

import com.example.TrackBus.route.entity.Route;
import com.example.TrackBus.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    RouteService routeService;

    @GetMapping
    public List<Route> getRoutes(){
        return routeService.getAllRoutes();

    }

    @PutMapping
    public Route saveRoute( @RequestBody Route route ){
        return routeService.saveRoute( route );
    }

}
