package com.example.TrackBus.bus.repository;

import com.example.TrackBus.bus.entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<Status,String> {
}
