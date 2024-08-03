package hn.unah.lenguajes.creditos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.Repositorios.ClienteRepositorio;
import hn.unah.lenguajes.creditos.modelos.Cliente;
import hn.unah.lenguajes.creditos.modelos.Prestamos;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente crearCliente(Cliente nvoCliente){

        List<Prestamos> prestamos = nvoCliente.getPrestamos();

        if(prestamos != null){
            for(Prestamos prestamo : prestamos){
                prestamo.setCliente(nvoCliente);
            }
        }
        return this.clienteRepositorio.save(nvoCliente);
        
    }

    public List<Cliente> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }


    public boolean buscarCliente(String codigoCliente){
        return this.clienteRepositorio.existsById(codigoCliente);
    }
    
}
