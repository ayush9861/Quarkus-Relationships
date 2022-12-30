package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.People;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeopleRepo implements PanacheRepository<People> {
}
