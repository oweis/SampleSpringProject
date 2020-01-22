package io.oweis.samplespringboot.course;

import io.oweis.samplespringboot.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Course() {
    }

    public Course(String id, String name, String description, Topic topic) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public Course setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }

    public Topic getTopic() {
        return topic;
    }

    public Course setTopic(Topic topic) {
        this.topic = topic;
        return this;
    }
}
