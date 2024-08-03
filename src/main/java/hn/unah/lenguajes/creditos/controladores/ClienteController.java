package hn.unah.lenguajes.creditos.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.creditos.modelos.Cliente;
import hn.unah.lenguajes.creditos.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @PostMapping("/crear/nuevo")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {
        if(!this.clienteServicio.buscarCliente(nvoCliente.getDni())){
            return this.clienteServicio.crearCliente(nvoCliente);
        }
        return null;
    }

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }
    
    
    
}
