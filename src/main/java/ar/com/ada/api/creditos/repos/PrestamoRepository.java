package ar.com.ada.api.creditos.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.creditos.entities.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{
    
}
