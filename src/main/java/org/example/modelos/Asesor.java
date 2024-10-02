package org.example.modelos;

import java.time.LocalDate;

public class Asesor {

    private String nombreAsesor;

    private String apellidosAsesor;

    private Integer cedulaAsesor;

    private Integer numeroContactoAsesor;

    private Integer whatsappAsesor;

    private String estadoCivilAsesor;

    private String epsAsesor;

    private LocalDate direccionAsesor;

    private String cuentaBancariaAssor;

    private LocalDate fechaNacimientoAsesor;


    public Asesor() {
    }

    public Asesor(String nombreAsesor, String apellidosAsesor, Integer cedulaAsesor, Integer numeroContactoAsesor, Integer whatsappAsesor, String estadoCivilAsesor, String epsAsesor, LocalDate direccionAsesor, String cuentaBancariaAssor, LocalDate fechaNacimientoAsesor) {
        this.nombreAsesor = nombreAsesor;
        this.apellidosAsesor = apellidosAsesor;
        this.cedulaAsesor = cedulaAsesor;
        this.numeroContactoAsesor = numeroContactoAsesor;
        this.whatsappAsesor = whatsappAsesor;
        this.estadoCivilAsesor = estadoCivilAsesor;
        this.epsAsesor = epsAsesor;
        this.direccionAsesor = direccionAsesor;
        this.cuentaBancariaAssor = cuentaBancariaAssor;
        this.fechaNacimientoAsesor = fechaNacimientoAsesor;
    }


    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }

    public String getApellidosAsesor() {
        return apellidosAsesor;
    }

    public void setApellidosAsesor(String apellidosAsesor) {
        this.apellidosAsesor = apellidosAsesor;
    }

    public Integer getCedulaAsesor() {
        return cedulaAsesor;
    }

    public void setCedulaAsesor(Integer cedulaAsesor) {
        this.cedulaAsesor = cedulaAsesor;
    }

    public Integer getNumeroContactoAsesor() {
        return numeroContactoAsesor;
    }

    public void setNumeroContactoAsesor(Integer numeroContactoAsesor) {
        this.numeroContactoAsesor = numeroContactoAsesor;
    }

    public Integer getWhatsappAsesor() {
        return whatsappAsesor;
    }

    public void setWhatsappAsesor(Integer whatsappAsesor) {
        this.whatsappAsesor = whatsappAsesor;
    }

    public String getEstadoCivilAsesor() {
        return estadoCivilAsesor;
    }

    public void setEstadoCivilAsesor(String estadoCivilAsesor) {
        this.estadoCivilAsesor = estadoCivilAsesor;
    }

    public String getEpsAsesor() {
        return epsAsesor;
    }

    public void setEpsAsesor(String epsAsesor) {
        this.epsAsesor = epsAsesor;
    }

    public LocalDate getDireccionAsesor() {
        return direccionAsesor;
    }

    public void setDireccionAsesor(LocalDate direccionAsesor) {
        this.direccionAsesor = direccionAsesor;
    }

    public String getCuentaBancariaAssor() {
        return cuentaBancariaAssor;
    }

    public void setCuentaBancariaAssor(String cuentaBancariaAssor) {
        this.cuentaBancariaAssor = cuentaBancariaAssor;
    }

    public LocalDate getFechaNacimientoAsesor() {
        return fechaNacimientoAsesor;
    }

    public void setFechaNacimientoAsesor(LocalDate fechaNacimientoAsesor) {
        this.fechaNacimientoAsesor = fechaNacimientoAsesor;
    }
}
