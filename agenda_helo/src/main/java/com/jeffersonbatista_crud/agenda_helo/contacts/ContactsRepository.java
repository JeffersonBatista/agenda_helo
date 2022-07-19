package com.jeffersonbatista_crud.agenda_helo.contacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactsRepository extends JpaRepository<Contact, Long>{
}