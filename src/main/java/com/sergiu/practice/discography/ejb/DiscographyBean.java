/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiu.practice.discography.ejb;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author derp
 */
@Stateless
@Path("discography")
public class DiscographyBean {

    /**
     * 
     * @return All discographies
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDiscographies() {
        return "";
    }
    
    /**
     * 
     * @param artistID
     * @return Discography of given artist
     */
    @Path("artist/{artistID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDiscography(@PathParam("artistID") long artistID) {
        return "";
    }
    
    @Path("artist/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createArtist(){
        
    }
    
    @Path("artist/{artistID}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateArtist(){
        
    }
    
    @Path("artist/{artistID}")
    @DELETE
    public void deleteArtist(){
        
    }
}
