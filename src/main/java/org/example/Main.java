package org.example;


import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n Welcome !!!");

        Scanner lea = new Scanner(System.in);
        Agencia agencia = new Agencia();
        Agencia agencia2 = new Agencia("nombreAgencia", LocalDate.now(), 20202020, 2010003030, "horarioAgencia", "logoAgencia", "serviciosAgencia", "sedesAgencia", "id", 21000);
        Asesor asesor = new Asesor();
        Asesor asesor2 = new Asesor("nombreAsesor", "apellidoAsesor"3242662, 53783763, "estadoCivilAsesor", "epsAsesor"; LocalDate.now());, "cuentaBancariaAsssor", LocalDate.now();
        Asegurado asegurado = new Asegurado("nombreAsegurado","aoelidoAsegurado", 727263653, 802, LocalDate.now(), "estadoCivilAsegurado", LocalDate.now(), 4, "tipoSangreAsegurado", 10, 5, "placaVehiculoAsegurado", "id", 8777647;
        Beneficiario beneficiario = new Beneficiario("nombreAsegurado", "apellidosAsegurado", LocalDate.now(), LocalDate.now(), 658686980, 1234567890, "epsBeneficiario", "id", "cuentaBancaria", 50;
        Inmueble inmueble = new Inmueble("id", "nombreInmueble", LocalDate.now(), 80, 5463939747, 16, "nombrePropietarioInmueble", 9841, "nombreArrendadorInmueble", "contactoInmueble";

        System.out.println("Digite nombre agencia");
        agencia.setNombreAgencia(lea.nextLine());

        System.out.println("Digite direccion agencia");
        agencia.setDireccionAgencia(lea.nextLine());

        System.out.println("Digite numero telefono agencia");
        agencia.setNumeroTelefono(lea.nextLine());

        System.out.println("Digite numero whatsapp agencia");
        agencia.setNumeroWhatsappAgencia(lea.nextLine());

        System.out.println("Digite horario agencia");
        agencia.setHorarioAgencia(lea.nextLine());

        System.out.println("Digite logo agencia");
        agencia.setLogoAgencia(lea.nextLine());

        System.out.println("Digite servicios agencia");
        agencia.setServiciosAgencia(lea.nextLine());

        System.out.println("Digite sedes agencia");
        agencia.setSedesAgencia(lea.nextLine());

        System.out.println("Digite id agencia");
        agencia.setId(lea.nextLine());

        System.out.println("Digite numero cuenta agencia");
        agencia.setNumeroCuenta(lea.nextLine());







        //imprimiendo los datos de la agencia:
        System.out.println(agencia);


        System.out.println("Digite nombre asesor");
        asesor.setNombreAsesor(lea.nextLine());

        System.out.println("Digite apellidos asesor");
        asesor.setApellidosAsesor(lea.nextLine());

        System.out.println("Digite cedula asesor");
        asesor.setCedulaAsesor(lea.nextLine());

        System.out.println("Digite numero contacto asesor");
        asesor.setNumeroContactoAsesor(lea.nextLine());

        System.out.println("Digite whatsapp asesor");
        asesor.setWhatsappAsesor(lea.nextLine());

        System.out.println("Digite estado civil asesor");
        asesor.setEstadoCivilAsesor(lea.nextLine());

        System.out.println("Digite eps asesor");
        asesor.setEpsAsesor(lea.nextLine());

        System.out.println("Digite direccion asesor");
        asesor.setDireccionAsesor(lea.nextLine());

        System.out.println("Digite cuenta bancaria asesor");
        asesor.setCuentaBancariaAssor(lea.nextLine());

        System.out.println("Digite fecha nacimiento asesor");
        asesor.setFechaNacimientoAsesor(lea.nextLine());


        //imprimiendo los datos del asesor:
        System.out.println(asesor);






















    }
}
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



