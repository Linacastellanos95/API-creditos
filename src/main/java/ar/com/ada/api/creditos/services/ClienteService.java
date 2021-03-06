package ar.com.ada.api.creditos.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.creditos.entities.*;
import ar.com.ada.api.creditos.repos.ClienteRepository;

/// Vamos a crear un service con la funcionalidad de traer todos los clientes y de ingresar un cliente.

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public List<Cliente> traerTodos() {
        return repository.findAll();
    }
    
    public void crearCliente(Cliente cliente){
        repository.save(cliente);
    }

    
}
