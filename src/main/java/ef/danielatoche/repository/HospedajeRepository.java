package ef.danielatoche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ef.danielatoche.model.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer>{

}
