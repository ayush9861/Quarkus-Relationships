package org.relations.Service;

import org.relations.Entity.Aadhar;
import org.relations.Entity.Citizen;
import org.relations.Repo.AadharRepo;
import org.relations.Repo.CitizenRepo;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class AadharService {

    @Inject
    AadharRepo aadharRepo;

    @Inject
    CitizenRepo citizenRepo;


    @GET
    @Path("save")
    @Transactional
    public Response save() {

        Citizen citizen = new Citizen();
        citizen.setName("Kumar");
        citizen.setGender("Male");


        Aadhar aadhar = new Aadhar();
        aadhar.setAadharNumber(986194659L);
        aadhar.setCompany("Ayush");
        aadhar.setCitizen(citizen);
        citizen.setAadhar(aadhar);
        citizenRepo.persist(citizen);//        Citizen citizen = citizenRepo.findById(1L);
        return  Response.ok(citizen).build();
    }

}
