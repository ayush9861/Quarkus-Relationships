package org.relations.Service;

import org.relations.Entity.People;
import org.relations.Entity.Simcard;
import org.relations.Repo.PeopleRepo;
import org.relations.Repo.SimCardRepo;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public class SimcardService {

    @Inject
    PeopleRepo peopleRepo;

    @Inject
    SimCardRepo simCardRepo;


    @GET
    @Path("sim")
    @Transactional

    public Response save()
    {

        People people = new People();
        people.setName("Ayush");
        people.setGender("m");

        Simcard simcard = new Simcard();
        simcard.setName("Kumar");
        simcard.setProvider("Jio");
        simcard.setPeople(people);

people.setSimcardList(List.of(simcard));

peopleRepo.persist(people);

return Response.ok(people).build();

    }



}
