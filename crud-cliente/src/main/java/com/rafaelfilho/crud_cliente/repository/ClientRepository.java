package com.rafaelfilho.crud_cliente.repository;

import com.rafaelfilho.crud_cliente.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
