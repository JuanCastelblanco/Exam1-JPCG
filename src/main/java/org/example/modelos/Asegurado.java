package org.example.modelos;

import java.time.LocalDate;

public class Asegurado {

    private String nombreAsegurado;

    private String apellidosAsegurado;

    private Integer numeroCelularAsegurado;

    private Integer numeroWhatsappAsegurado;

    private Integer numeroCasaAsegurado;

    private LocalDate FechaNacimientoAsegurado;

    private String EstadoCivilAsegurado;

    private LocalDate direccionAsegurado;

    private Integer numeroHijosAsegurado;

    private String TipoSangreAsegurado;

    private Integer numeroPropiedadesAsegurado;

    private Integer numeroMascotasAsegurado;

    private String placaVehiculoAsegurado;

    private String id;

    private Integer cuentaBancariaAsegurado;


    public Asegurado() {
    }


    public Asegurado(String nombreAsegurado, String apellidosAsegurado, Integer numeroCelularAsegurado, Integer numeroWhatsappAsegurado, Integer numeroCasaAsegurado, LocalDate fechaNacimientoAsegurado, String estadoCivilAsegurado, LocalDate direccionAsegurado, Integer numeroHijosAsegurado, String tipoSangreAsegurado, Integer numeroPropiedadesAsegurado, Integer numeroMascotasAsegurado, String placaVehiculoAsegurado, String id, Integer cuentaBancariaAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
        this.apellidosAsegurado = apellidosAsegurado;
        this.numeroCelularAsegurado = numeroCelularAsegurado;
        this.numeroWhatsappAsegurado = numeroWhatsappAsegurado;
        this.numeroCasaAsegurado = numeroCasaAsegurado;
        FechaNacimientoAsegurado = fechaNacimientoAsegurado;
        EstadoCivilAsegurado = estadoCivilAsegurado;
        this.direccionAsegurado = direccionAsegurado;
        this.numeroHijosAsegurado = numeroHijosAsegurado;
        TipoSangreAsegurado = tipoSangreAsegurado;
        this.numeroPropiedadesAsegurado = numeroPropiedadesAsegurado;
        this.numeroMascotasAsegurado = numeroMascotasAsegurado;
        this.placaVehiculoAsegurado = placaVehiculoAsegurado;
        this.id = id;
        this.cuentaBancariaAsegurado = cuentaBancariaAsegurado;
    }


    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public String getApellidosAsegurado() {
        return apellidosAsegurado;
    }

    public void setApellidosAsegurado(String apellidosAsegurado) {
        this.apellidosAsegurado = apellidosAsegurado;
    }

    public Integer getNumeroCelularAsegurado() {
        return numeroCelularAsegurado;
    }

    public void setNumeroCelularAsegurado(Integer numeroCelularAsegurado) {
        this.numeroCelularAsegurado = numeroCelularAsegurado;
    }

    public Integer getNumeroWhatsappAsegurado() {
        return numeroWhatsappAsegurado;
    }

    public void setNumeroWhatsappAsegurado(Integer numeroWhatsappAsegurado) {
        this.numeroWhatsappAsegurado = numeroWhatsappAsegurado;
    }

    public Integer getNumeroCasaAsegurado() {
        return numeroCasaAsegurado;
    }

    public void setNumeroCasaAsegurado(Integer numeroCasaAsegurado) {
        this.numeroCasaAsegurado = numeroCasaAsegurado;
    }

    public LocalDate getFechaNacimientoAsegurado() {
        return FechaNacimientoAsegurado;
    }

    public void setFechaNacimientoAsegurado(LocalDate fechaNacimientoAsegurado) {
        FechaNacimientoAsegurado = fechaNacimientoAsegurado;
    }

    public String getEstadoCivilAsegurado() {
        return EstadoCivilAsegurado;
    }

    public void setEstadoCivilAsegurado(String estadoCivilAsegurado) {
        EstadoCivilAsegurado = estadoCivilAsegurado;
    }

    public LocalDate getDireccionAsegurado() {
        return direccionAsegurado;
    }

    public void setDireccionAsegurado(LocalDate direccionAsegurado) {
        this.direccionAsegurado = direccionAsegurado;
    }

    public Integer getNumeroHijosAsegurado() {
        return numeroHijosAsegurado;
    }

    public void setNumeroHijosAsegurado(Integer numeroHijosAsegurado) {
        this.numeroHijosAsegurado = numeroHijosAsegurado;
    }

    public String getTipoSangreAsegurado() {
        return TipoSangreAsegurado;
    }

    public void setTipoSangreAsegurado(String tipoSangreAsegurado) {
        TipoSangreAsegurado = tipoSangreAsegurado;
    }

    public Integer getNumeroPropiedadesAsegurado() {
        return numeroPropiedadesAsegurado;
    }

    public void setNumeroPropiedadesAsegurado(Integer numeroPropiedadesAsegurado) {
        this.numeroPropiedadesAsegurado = numeroPropiedadesAsegurado;
    }

    public Integer getNumeroMascotasAsegurado() {
        return numeroMascotasAsegurado;
    }

    public void setNumeroMascotasAsegurado(Integer numeroMascotasAsegurado) {
        this.numeroMascotasAsegurado = numeroMascotasAsegurado;
    }

    public String getPlacaVehiculoAsegurado() {
        return placaVehiculoAsegurado;
    }

    public void setPlacaVehiculoAsegurado(String placaVehiculoAsegurado) {
        this.placaVehiculoAsegurado = placaVehiculoAsegurado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCuentaBancariaAsegurado() {
        return cuentaBancariaAsegurado;
    }

    public void setCuentaBancariaAsegurado(Integer cuentaBancariaAsegurado) {
        this.cuentaBancariaAsegurado = cuentaBancariaAsegurado;
    }
}
