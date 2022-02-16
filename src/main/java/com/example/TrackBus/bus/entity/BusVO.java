package com.example.TrackBus.bus.entity;

import com.example.TrackBus.route.entity.Route;

import java.util.Objects;

public class BusVO {

    private Bus bus;
    private Route route;

    public BusVO(Bus bus, Route route) {
        this.bus = bus;
        this.route = route;
    }

    public BusVO() {
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "BusVO{" +
                "bus=" + bus +
                ", route=" + route +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusVO)) return false;
        BusVO busVO = (BusVO) o;
        return Objects.equals(bus, busVO.bus) &&
                Objects.equals(route, busVO.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bus, route);
    }
}