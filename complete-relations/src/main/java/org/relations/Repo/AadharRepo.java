package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.Aadhar;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AadharRepo implements PanacheRepository<Aadhar> {
}
