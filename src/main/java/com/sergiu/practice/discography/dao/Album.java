/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiu.practice.discography.dao;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author derp
 */
public class Album {

    private String year;
    private String title;

    public Album() {
    }

    public Album(String year, String title) {
        this.year = year;
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof Album)) {
            return false;
        }
        Album album = (Album) o;
        return Objects.equals(this.title, album.title) && Objects.equals(this.year, album.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

}
