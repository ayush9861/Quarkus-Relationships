package org.relations.Repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.relations.Entity.Bank;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankRepo implements PanacheRepository<Bank> {
}
