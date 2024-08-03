package hn.unah.lenguajes.creditos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.Repositorios.ClienteRepositorio;
import hn.unah.lenguajes.creditos.Repositorios.PrestamosRepositorio;
import hn.unah.lenguajes.creditos.modelos.Prestamos;

@Service
public class PrestamosServicio {

    @Autowired
    private PrestamosRepositorio prestamosRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;


    public Prestamos crearPrestamo(Prestamos nvoPrestamo, String dni){
        if(this.clienteRepositorio.existsById(dni)){
            //if(this.prestamosRepositorio.countByPrestamos(nvoPrestamo) < 2){
                nvoPrestamo.setCliente(this.clienteRepositorio.findById(dni).get());
                return this.prestamosRepositorio.save(nvoPrestamo);
            //}
        }
        return null;
    }

    public Prestamos obtenerPrestamoPorCodigo(long codigoPrestamo){
        if(this.prestamosRepositorio.existsById(codigoPrestamo)){
            return this.prestamosRepositorio.findById(codigoPrestamo).get();
        }
        return null;
    }
    
}
