package org.relations.Service;

import org.relations.Entity.Bank;
import org.relations.Entity.PeopleBank;
import org.relations.Repo.BankRepo;
import org.relations.Repo.PeopleBankRepo;
import org.relations.Repo.PeopleRepo;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/bank")
public class BankService {

    @Inject
    PeopleBankRepo peopleBankrepo;
    @Inject
    BankRepo bankRepo;

    @GET
    @Path("save")
    @Transactional
    public Response Save()
    {
        PeopleBank peopleBank = new PeopleBank();
        peopleBank.setName("Ayush");
        peopleBank.setSurname("Patel");

        Bank bank = new Bank();
        bank.setName("Sng");
        bank.setBranch("Dng");

        bank.setPeopleBank(List.of(peopleBank));
        peopleBank.setBank(List.of(bank));

        peopleBankrepo.persist(peopleBank);


        return Response.ok(peopleBank).build();


    }

}


