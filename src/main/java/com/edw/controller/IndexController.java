package com.edw.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;


/**
 * <pre>
 *  com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 10 Sept 2026 9:41
 */
@Path("/")
public class IndexController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response index() {
        return Response.ok(new HashMap(){{
                    put("hello", "world");
                }})
                .build();
    }
}
