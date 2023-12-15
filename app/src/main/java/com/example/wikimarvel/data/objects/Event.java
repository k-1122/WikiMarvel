package com.example.wikimarvel.data.objects;
import com.example.wikimarvel.data.lists.Events;

import java.util.List;

public class Event {
    private int available;
    private String collectionURI;
    private List<Events> eventsList;

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public Event() {
    }

    @Override
    public String toString() {
        return "Event{" +
                "available=" + available +
                ", collectionURI='" + collectionURI + '\'' +
                ", eventsList=" + eventsList +
                '}';
    }

    public Event(int available, String collectionURI, List<Events> eventsList) {
        this.available = available;
        this.collectionURI = collectionURI;
        this.eventsList = eventsList;
    }
}
