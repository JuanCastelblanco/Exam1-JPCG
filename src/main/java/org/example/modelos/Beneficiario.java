package org.example.modelos;

import java.time.LocalDate;

public class Beneficiario {

    private String nombreBeneficiario;

    private String apellidosBeneficiario;

    private LocalDate direccionBeneficiario;

    private LocalDate fechaNacimientoBeneficiario;

    private Integer numeroContactoBeneficiario;

    private Integer numeroWhatsappBeneficiario;

    private String epsBeneficiario;

    private String id;

    private String cuentaBancaria;

    private Integer edadBeneficiario;


    public Beneficiario() {
    }


    public Beneficiario(String nombreBeneficiario, String apellidosBeneficiario, LocalDate direccionBeneficiario, LocalDate fechaNacimientoBeneficiario, Integer numeroContactoBeneficiario, Integer numeroWhatsappBeneficiario, String epsBeneficiario, String id, String cuentaBancaria, Integer edadBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.apellidosBeneficiario = apellidosBeneficiario;
        this.direccionBeneficiario = direccionBeneficiario;
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
        this.numeroContactoBeneficiario = numeroContactoBeneficiario;
        this.numeroWhatsappBeneficiario = numeroWhatsappBeneficiario;
        this.epsBeneficiario = epsBeneficiario;
        this.id = id;
        this.cuentaBancaria = cuentaBancaria;
        this.edadBeneficiario = edadBeneficiario;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getApellidosBeneficiario() {
        return apellidosBeneficiario;
    }

    public void setApellidosBeneficiario(String apellidosBeneficiario) {
        this.apellidosBeneficiario = apellidosBeneficiario;
    }

    public LocalDate getDireccionBeneficiario() {
        return direccionBeneficiario;
    }

    public void setDireccionBeneficiario(LocalDate direccionBeneficiario) {
        this.direccionBeneficiario = direccionBeneficiario;
    }

    public LocalDate getFechaNacimientoBeneficiario() {
        return fechaNacimientoBeneficiario;
    }

    public void setFechaNacimientoBeneficiario(LocalDate fechaNacimientoBeneficiario) {
        this.fechaNacimientoBeneficiario = fechaNacimientoBeneficiario;
    }

    public Integer getNumeroContactoBeneficiario() {
        return numeroContactoBeneficiario;
    }

    public void setNumeroContactoBeneficiario(Integer numeroContactoBeneficiario) {
        this.numeroContactoBeneficiario = numeroContactoBeneficiario;
    }

    public Integer getNumeroWhatsappBeneficiario() {
        return numeroWhatsappBeneficiario;
    }

    public void setNumeroWhatsappBeneficiario(Integer numeroWhatsappBeneficiario) {
        this.numeroWhatsappBeneficiario = numeroWhatsappBeneficiario;
    }

    public String getEpsBeneficiario() {
        return epsBeneficiario;
    }

    public void setEpsBeneficiario(String epsBeneficiario) {
        this.epsBeneficiario = epsBeneficiario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Integer getEdadBeneficiario() {
        return edadBeneficiario;
    }

    public void setEdadBeneficiario(Integer edadBeneficiario) {
        this.edadBeneficiario = edadBeneficiario;
    }
}
