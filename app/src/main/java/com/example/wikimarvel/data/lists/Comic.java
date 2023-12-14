package com.example.wikimarvel.data.lists;


public class Comic {
    private String resourceURI;
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public Comic(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }
    public Comic(){}
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
        return "Comic{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
