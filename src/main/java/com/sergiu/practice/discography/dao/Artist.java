/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiu.practice.discography.dao;

import java.util.Objects;

/**
 *
 * @author derp
 */

public class Artist {

    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) o;
        return Objects.equals(this.name,artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    
}
