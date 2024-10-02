package org.example.modelos;

import java.time.LocalDate;

public class Inmueble {

    private String id;

    private String nombreInmueble;

    private LocalDate direccionInmueble;

    private Integer numeroOficinasInmueble;

    private Integer ContactoInmueble;

    private Integer numeroPaequeaderoInmueble;

    private String NombrePropietarioInmueble;

    private Integer numeroLocalInmueble;

    private String NombreArredadorInmueble;

    private String ContactoInmueble;


    public Inmueble() {
    }


    public Inmueble(String id, String nombreInmueble, LocalDate direccionInmueble, Integer numeroOficinasInmueble, Integer contactoInmueble, Integer numeroPaequeaderoInmueble, String nombrePropietarioInmueble, Integer numeroLocalInmueble, String nombreArredadorInmueble, String contactoInmueble1) {
        this.id = id;
        this.nombreInmueble = nombreInmueble;
        this.direccionInmueble = direccionInmueble;
        this.numeroOficinasInmueble = numeroOficinasInmueble;
        ContactoInmueble = contactoInmueble;
        this.numeroPaequeaderoInmueble = numeroPaequeaderoInmueble;
        NombrePropietarioInmueble = nombrePropietarioInmueble;
        this.numeroLocalInmueble = numeroLocalInmueble;
        NombreArredadorInmueble = nombreArredadorInmueble;
        ContactoInmueble = contactoInmueble1;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreInmueble() {
        return nombreInmueble;
    }

    public void setNombreInmueble(String nombreInmueble) {
        this.nombreInmueble = nombreInmueble;
    }

    public LocalDate getDireccionInmueble() {
        return direccionInmueble;
    }

    public void setDireccionInmueble(LocalDate direccionInmueble) {
        this.direccionInmueble = direccionInmueble;
    }

    public Integer getNumeroOficinasInmueble() {
        return numeroOficinasInmueble;
    }

    public void setNumeroOficinasInmueble(Integer numeroOficinasInmueble) {
        this.numeroOficinasInmueble = numeroOficinasInmueble;
    }

    public Integer getContactoInmueble() {
        return ContactoInmueble;
    }

    public void setContactoInmueble(String contactoInmueble) {
        ContactoInmueble = contactoInmueble;
    }

    public void setContactoInmueble(Integer contactoInmueble) {
        ContactoInmueble = contactoInmueble;
    }

    public Integer getNumeroPaequeaderoInmueble() {
        return numeroPaequeaderoInmueble;
    }

    public void setNumeroPaequeaderoInmueble(Integer numeroPaequeaderoInmueble) {
        this.numeroPaequeaderoInmueble = numeroPaequeaderoInmueble;
    }

    public String getNombrePropietarioInmueble() {
        return NombrePropietarioInmueble;
    }

    public void setNombrePropietarioInmueble(String nombrePropietarioInmueble) {
        NombrePropietarioInmueble = nombrePropietarioInmueble;
    }

    public Integer getNumeroLocalInmueble() {
        return numeroLocalInmueble;
    }

    public void setNumeroLocalInmueble(Integer numeroLocalInmueble) {
        this.numeroLocalInmueble = numeroLocalInmueble;
    }

    public String getNombreArredadorInmueble() {
        return NombreArredadorInmueble;
    }

    public void setNombreArredadorInmueble(String nombreArredadorInmueble) {
        NombreArredadorInmueble = nombreArredadorInmueble;
    }
}
