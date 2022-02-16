package com.example.TrackBus.route.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "route")
public class Route {

    @Id
    String routeId;
    String route;

    public Route(String routeId, String route) {
        this.routeId = routeId;
        this.route = route;
    }

    public Route() {
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;
        Route route1 = (Route) o;
        return Objects.equals(routeId, route1.routeId) &&
                Objects.equals(route, route1.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, route);
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId='" + routeId + '\'' +
                ", route='" + route + '\'' +
                '}';
    }
}
