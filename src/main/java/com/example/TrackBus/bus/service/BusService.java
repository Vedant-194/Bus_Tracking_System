package com.example.TrackBus.bus.service;

import com.example.TrackBus.bus.entity.Bus;
import com.example.TrackBus.bus.entity.BusVO;
import com.example.TrackBus.bus.entity.Status;
import com.example.TrackBus.bus.repository.BusRepository;
import com.example.TrackBus.bus.repository.StatusRepository;
import com.example.TrackBus.bus.util.Utils;
import com.example.TrackBus.route.entity.Route;
import com.example.TrackBus.route.repository.RouteRepository;
import com.example.TrackBus.route.util.RouteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusService {

    @Autowired
    BusRepository busRepository;

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    StatusRepository statusRepository;

    public List<BusVO> getAllBuses(String routeId){
        List<BusVO> busVOs = new ArrayList<>();
        List<Route> routes = new ArrayList<>();
        routeRepository.findAll().forEach( route -> routes.add(route) );
        Map<String, Route> routeIdToRoute = populateRouteIdToRouteMap( routes );
        if( null == routeId ){
            busRepository.findAll().forEach( bus -> {
                BusVO busVO;
                if( routeIdToRoute.containsKey( bus.getRouteId() ) ){
                    busVO = new BusVO( bus, routeIdToRoute.get( bus.getRouteId()) );
                }else{
                    busVO = new BusVO( bus, RouteUtils.getDefaultRoute() );
                }

                busVOs.add( busVO );
            });

        }else{
            busRepository.findByRouteId( routeId ).forEach( bus -> {
                BusVO busVO;
                if( routeIdToRoute.containsKey( bus.getRouteId() ) ){
                    busVO = new BusVO( bus, routeIdToRoute.get( bus.getRouteId()) );
                }else{
                    busVO = new BusVO( bus, RouteUtils.getDefaultRoute() );
                }

                busVOs.add( busVO );
            });
        }
        return busVOs;
    }

    private Map<String, Route> populateRouteIdToRouteMap(List<Route> routes ){
        Map<String, Route> routeIdToRoute = new HashMap<>();
        for( Route route: routes ){
            routeIdToRoute.put( route.getRouteId(), route );
        }
        return routeIdToRoute;
    }

    public Bus getBusById( Integer busId){
        Optional<Bus> bus = busRepository.findById(busId);
        return bus.get();
    }

    public Bus saveBus( Bus bus ){
        return busRepository.save( bus );
    }

    public Status updateStatus( Status status ){
        status.setId( status.getId()+ Utils.getCurrentDateAsString() );
        return statusRepository.save(status);
    }

    public Status getStatus( String id, String date ){
        if( null != date ){
            return statusRepository.findById( id+date ).get();
        }else{
            return statusRepository.findById( id+ Utils.getCurrentDateAsString() ).get();
        }

    }

}
