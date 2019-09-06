package net.stedin.werkorderservice.rest;

import static net.stedin.werkorderservice.domain.WerkorderStatus.INACTIEF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lombok.extern.slf4j.Slf4j;
import net.stedin.werkorderservice.domain.Werkorder;
import net.stedin.werkorderservice.exceptions.WerkorderNotFoundException;

@Slf4j
@Path("/werkorders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WerkorderService {

    static List<Werkorder> werkorders = new ArrayList<>();

    @GET
    public List<Werkorder> findAll() {
        return werkorders;
    }

    @GET
    @Path("/{id}")
    public Werkorder find(@PathParam("id") Long id) {
        return werkorders.stream().filter(wo -> wo.getId().equals(id)).findFirst()
                .orElseThrow(() -> new WerkorderNotFoundException());
    }

    @POST
    public void save(Werkorder wo) {
        Long id = (long) werkorders.size() + 1;
        wo.setId(id);
        wo.setAanmaakDatum(new Date());
        wo.setStatus(INACTIEF);
        werkorders.add(wo);
        this.log.debug("new wo added:\n" + wo);
    }

    @DELETE
    public void delete(Long id) {
        werkorders.removeIf(wo -> wo.getId() == id);
    }
}