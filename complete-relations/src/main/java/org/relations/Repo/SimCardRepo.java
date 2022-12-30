package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.Simcard;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimCardRepo implements PanacheRepository<Simcard> {
}
