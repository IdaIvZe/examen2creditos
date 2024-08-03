package hn.unah.lenguajes.creditos.modelos;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="prestamos")
@Data
public class Prestamos {

    @Id
    @Column(name="codigoprestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoPrestamo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertura;
    
    private double monto;

    private double cuota;

    private Integer plazo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    // @OneToMany(mappedBy = "prestamos")
    // private List<Cuotas> cuotas;
}
