package com.example.wikimarvel.data.lists;

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
public class Story {
    private String resourceURI;
    private String name;
    private String type;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Story(String resourceURI, String name, String type) {
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }
    public Story(){}

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Story{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
