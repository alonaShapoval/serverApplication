package com.beekeeper.controllers.admin;

import com.beekeeper.modules.domain.WorkingHours;
import com.beekeeper.service.implementations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/admin/user/work/statistics")
@Path("/admin/user/work/statistics")
@Component
public class WorkStatisticsController {
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

    public WorkStatisticsController() {
    }
    @GET
    @Path("/find/{id}")
    @Produces({"application/json"})
    public List<WorkingHours> findByUserId(@PathParam("id") String id) throws IOException {

        return this.findService.getWorkingHoursByUserName(Long.parseLong(id));
    }
}
