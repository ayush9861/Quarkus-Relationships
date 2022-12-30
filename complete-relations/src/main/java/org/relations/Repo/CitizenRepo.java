package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.Citizen;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CitizenRepo implements PanacheRepository<Citizen> {
}
