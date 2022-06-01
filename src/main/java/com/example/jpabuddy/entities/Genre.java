package com.example.jpabuddy.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @Column(name = "genre_id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 120)
    private String name;

    @OneToMany(mappedBy = "genre")
    private Set<Track> tracks = new LinkedHashSet<>();

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}