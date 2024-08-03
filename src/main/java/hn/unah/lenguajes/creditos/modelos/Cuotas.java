package hn.unah.lenguajes.creditos.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cuotas")
@Data
public class Cuotas {

    @Id
    @Column(name="codigocuota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoCuota;

    private Integer mes;

    private double interes;

    private double capital;

    private double saldo;

    // @JsonIgnore
    // @ManyToOne
    // @JoinColumn(name="codigoprestamo")
    // private Prestamos prestamos;
    
}
