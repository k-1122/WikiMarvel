package com.example.wikimarvel.data.lists;


public class Events {
    private String resourceURI;
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public Events(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }
    public Events(){}
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
