package com.example.TrackBus.bus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "status")
public class Status {

    @Id
    private String id;
    private String currentStatus;

    public Status() {
    }

    public Status(String id, String currentStatus) {
        this.id = id;
        this.currentStatus = currentStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return Objects.equals(id, status.id) &&
                Objects.equals(currentStatus, status.currentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currentStatus);
    }

    @Override
    public String toString() {
        return "Status{" +
                "id='" + id + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}
