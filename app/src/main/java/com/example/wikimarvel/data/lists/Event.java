package com.example.wikimarvel.data.lists;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Event {
    private String resourceURI;
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public Event(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }
    public Event(){}
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
