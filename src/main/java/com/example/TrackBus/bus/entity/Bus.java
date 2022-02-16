package com.example.TrackBus.bus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    private Integer busId;
    private String routeId;

    public Bus() {
    }

    public Bus(Integer busId, String routeId) {
        this.busId = busId;
        this.routeId = routeId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return routeId == bus.routeId &&
                Objects.equals(busId, bus.busId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId, routeId);
    }
}