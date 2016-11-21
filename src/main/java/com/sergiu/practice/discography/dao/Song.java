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
public class Song {
    
    protected String title;
    
    public Song(){
    }
    
    public Song(String title){
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Song)) {
            return false;
        }
        Song song = (Song) o;
        return Objects.equals(this.title,song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
    
}