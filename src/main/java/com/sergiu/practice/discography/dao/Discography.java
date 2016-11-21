/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiu.practice.discography.dao;

import com.google.common.collect.ArrayListMultimap;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


/**
 * 
 * @author derp
 */
@Startup
@Singleton
public class Discography {
    
    private ArrayListMultimap<Artist, ArrayListMultimap<Album, Song>> discographyStore;
    
    @PostConstruct
    void init(){
        discographyStore = ArrayListMultimap.create();
        // Add init data
        Song a = new Song("Innuendo");
        Song b = new Song("I'm Going Slightly Mad");
        Song c = new Song("Headlong");
        Song d = new Song("I Can't Live With You");
        Song e = new Song("Ride The Wild Wind");
        Song f = new Song("All God's People");
        Song g = new Song("These Are The Days Of Our Lives");
        Song h = new Song("Delilah");
        Song i = new Song("Don't Try So Hard");
        Song j = new Song("The Hitman");
        Song k = new Song("Bijou");
        Song l = new Song("The Show Must Go On");

        Album album = new Album("Innuendo","1991");
        
        Artist artist = new Artist("Queen");
        
    }

}
