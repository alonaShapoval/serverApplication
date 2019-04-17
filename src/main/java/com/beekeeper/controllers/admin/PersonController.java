package com.beekeeper.controllers.admin;

import com.beekeeper.modules.domain.User;
import com.beekeeper.service.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.ws.rs.*;
import java.io.IOException;

@RestController
@RequestMapping(value = "/admin/user")
@Path("/admin/user")
@Component
public class PersonController {
    @Autowired
    private ServletUtilService servletUtil;
    @Autowired
    private SaveService saveService;
    @Autowired
    private UpdateService updateService;
    @Autowired
    private FindService findService;
    @Autowired
    private DeleteService deleteService;

    public PersonController() {
    }

    @POST
    @Path("/create")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public User createUser(User user) throws IOException {
        this.saveService.saveNewUser(user);

        return this.findService.getUserById(user.getId());
    }

    @POST
    @Path("/update")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long updateUser(User user) throws IOException {
        this.updateService.updateUser(user);
        return this.findService.getUserById(user.getId()).getId();
    }

    @GET
    @Path("/find/{id}")
    @Produces({"application/json"})
    public User findById(@PathParam("id") String id) throws IOException {
        User user = this.findService.getUserById(Long.parseLong(id));
        return user;
    }

    @DELETE
    @Path("/delete/{id}")
    public void deleteUser(@PathParam("id") Long id) throws ServletException, IOException {
        this.deleteService.deleteUserById(id.longValue());
    }
}
