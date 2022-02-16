package com.example.TrackBus.bus.vo;


import java.util.Objects;

public class BusStatus {

    private String busId;
    private String currentStop;

    public BusStatus() {
    }

    public BusStatus(String busId, String currentStop) {
        this.busId = busId;
        this.currentStop = currentStop;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getCurrentStop() {
        return currentStop;
    }

    public void setCurrentStop(String currentStop) {
        this.currentStop = currentStop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusStatus)) return false;
        BusStatus busStatus = (BusStatus) o;
        return Objects.equals(busId, busStatus.busId) &&
                Objects.equals(currentStop, busStatus.currentStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId, currentStop);
    }

    @Override
    public String toString() {
        return "BusStatus{" +
                "busId='" + busId + '\'' +
                ", currentStop='" + currentStop + '\'' +
                '}';
    }
}
