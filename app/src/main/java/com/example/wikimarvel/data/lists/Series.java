package com.example.wikimarvel.data.lists;


public class Series {
    private String resourceURI;
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Series(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }
    public Series(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Series{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
