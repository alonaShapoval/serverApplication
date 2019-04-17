package com.beekeeper.controllers;

import com.beekeeper.modules.domain.*;
import com.beekeeper.service.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.ws.rs.*;
import java.io.IOException;

@RestController
@RequestMapping(value = "/beehive")
@Path("/beehive")
@Component
public class BeehiveController {
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

    public BeehiveController() {
    }
    @POST
    @Path("/create")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long createBeehive(Beehive beehive) throws IOException {
        this.saveService.saveNewBeehive(beehive);
        return this.findService.getBeehiveById(beehive.getId()).getId();
    }
    @POST
    @Path("/add/temperature")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long addTemperature(Temperature temperature) throws IOException {
        this.saveService.saveNewTemperatureValue(temperature);
        return this.findService.getTemperatureById(temperature.getId()).getId();
    }
    @POST
    @Path("/add/humidity")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long addHumidity(Humidity humidity) throws IOException {
        this.saveService.saveNewHumidityValue(humidity);
        return this.findService.getHumidityById(humidity.getId()).getId();
    }

    @POST
    @Path("/add/oxygen")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long addOxygen(Oxygen oxygen) throws IOException {
        this.saveService.saveNewOxygenValue(oxygen);
        return this.findService.getOxygenById(oxygen.getId()).getId();
    }

    @POST
    @Path("/add/amount")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long addAmount(Amount amount) throws IOException {
        this.saveService.saveNewAmountValue(amount);
        return this.findService.getAmountById(amount.getId()).getId();
    }


    @POST
    @Path("/update")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public long updateUser(Beehive beehive) throws IOException {
        this.updateService.updateBeehive(beehive);
        return this.findService.getBeehiveById(beehive.getId()).getId();
    }
    @GET
    @Path("/find/{id}")
    @Produces({"application/json"})
    public Beehive findById(@PathParam("id") String id) throws IOException {
        Beehive beehive = this.findService.getBeehiveById(Long.parseLong(id));
        return beehive;
    }


}
