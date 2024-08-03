package hn.unah.lenguajes.creditos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.creditos.modelos.Prestamos;
import hn.unah.lenguajes.creditos.servicios.PrestamosServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/prestamos")
public class PrestamosController {

    @Autowired
    private PrestamosServicio prestamosServicio;

    @PostMapping("/asociar/{dni}")
    public Prestamos crearPrestamo(@PathVariable(name="dni") String dni ,
                                @RequestBody Prestamos nvoPrestamo) {  

        return this.prestamosServicio.crearPrestamo(nvoPrestamo, dni);
    }

    @GetMapping("/obtener/{codigoPrestamo}")
    public Prestamos obtenerPrestamoPorCodigo(@PathVariable(name="codigoPrestamo") long codigoPrestamo) {
        return this.prestamosServicio.obtenerPrestamoPorCodigo(codigoPrestamo);
    }
    
    
    
}
