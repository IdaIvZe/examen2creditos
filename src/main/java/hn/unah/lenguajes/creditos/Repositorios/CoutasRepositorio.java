package hn.unah.lenguajes.creditos.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.creditos.modelos.Cuotas;

@Repository
public interface CoutasRepositorio extends JpaRepository<Cuotas, Long> {
    
}
