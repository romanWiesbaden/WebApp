package de.challenge.tshirt.WebApp.repository;

import de.challenge.tshirt.WebApp.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

}
