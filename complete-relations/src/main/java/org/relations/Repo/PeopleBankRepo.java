package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.PeopleBank;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeopleBankRepo implements PanacheRepository<PeopleBank>{
}
