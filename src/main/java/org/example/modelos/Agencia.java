package org.example.modelos;

import java.time.LocalDate;

public class Agencia {
    private String nombreAgencia;

    private LocalDate direccionAgencia;

    private Integer numeroTelefono;

    private Integer numeroWhatsappAgencia;

    private String horarioAgencia;

    private String logoAgencia;

    private String serviciosAgencia;

    private String sedesAgencia;

    private String id;

    private Integer numeroCuenta;


    public Agencia() {
    }


    public Agencia(String nombreAgencia, LocalDate direccionAgencia, Integer numeroTelefono, Integer numeroWhatsappAgencia, String horarioAgencia, String logoAgencia, String serviciosAgencia, String sedesAgencia, String id, Integer numeroCuenta) {
        this.nombreAgencia = nombreAgencia;
        this.direccionAgencia = direccionAgencia;
        this.numeroTelefono = numeroTelefono;
        this.numeroWhatsappAgencia = numeroWhatsappAgencia;
        this.horarioAgencia = horarioAgencia;
        this.logoAgencia = logoAgencia;
        this.serviciosAgencia = serviciosAgencia;
        this.sedesAgencia = sedesAgencia;
        this.id = id;
        this.numeroCuenta = numeroCuenta;
    }


    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public LocalDate getDireccionAgencia() {
        return direccionAgencia;
    }

    public void setDireccionAgencia(LocalDate direccionAgencia) {
        this.direccionAgencia = direccionAgencia;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Integer getNumeroWhatsappAgencia() {
        return numeroWhatsappAgencia;
    }

    public void setNumeroWhatsappAgencia(Integer numeroWhatsappAgencia) {
        this.numeroWhatsappAgencia = numeroWhatsappAgencia;
    }

    public String getHorarioAgencia() {
        return horarioAgencia;
    }

    public void setHorarioAgencia(String horarioAgencia) {
        this.horarioAgencia = horarioAgencia;
    }

    public String getLogoAgencia() {
        return logoAgencia;
    }

    public void setLogoAgencia(String logoAgencia) {
        this.logoAgencia = logoAgencia;
    }

    public String getServiciosAgencia() {
        return serviciosAgencia;
    }

    public void setServiciosAgencia(String serviciosAgencia) {
        this.serviciosAgencia = serviciosAgencia;
    }

    public String getSedesAgencia() {
        return sedesAgencia;
    }

    public void setSedesAgencia(String sedesAgencia) {
        this.sedesAgencia = sedesAgencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}

