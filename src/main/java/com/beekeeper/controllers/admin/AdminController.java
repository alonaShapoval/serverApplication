package com.beekeeper.controllers.admin;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RestController
@RequestMapping(value = "/admin")
@Path("/admin")
@Component
public class AdminController {
    @GET
    @Path("/main")
    public String goToMainAdmin() {
        return "admin_main";
    }
}
