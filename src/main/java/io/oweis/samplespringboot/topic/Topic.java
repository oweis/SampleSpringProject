package io.oweis.samplespringboot.topic;

public class Topic {
    private String id;
    private String name;
    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public Topic setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Topic setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Topic setDescription(String description) {
        this.description = description;
        return this;
    }
}
