package com.example.TrackBus.bus.controller;

import com.example.TrackBus.bus.entity.Bus;
import com.example.TrackBus.bus.entity.BusVO;
import com.example.TrackBus.bus.entity.Status;
import com.example.TrackBus.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    BusService busService;

    @GetMapping()
    public List<BusVO> getBusesByRoute(@RequestParam(required = false)  String routeId){
        return busService.getAllBuses(routeId);
    }

    @PutMapping
    public Bus saveBuses(@RequestBody Bus bus ){
        return busService.saveBus( bus );
    }

    @GetMapping("/status/{id}")
    public Status getCurrentStatus(@PathVariable("id") String id, @RequestParam(required = false)  String date  ){
        return busService.getStatus( id, date );
    }

    @PostMapping("/status")
    public Status updateCurrentStatus( @RequestBody Status status ){
        return busService.updateStatus( status );
    }

}
