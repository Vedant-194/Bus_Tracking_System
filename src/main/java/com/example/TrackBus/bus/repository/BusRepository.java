package com.example.TrackBus.bus.repository;

import com.example.TrackBus.bus.entity.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends CrudRepository<Bus,Integer> {


    public List<Bus> findByRouteId(String routeId);

}
