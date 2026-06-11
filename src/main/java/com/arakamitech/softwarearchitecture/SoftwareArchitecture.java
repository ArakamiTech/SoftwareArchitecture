/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.arakamitech.softwarearchitecture;

import com.arakamitech.softwarearchitecture.solidprinciples.D.MySqlRepository;
import com.arakamitech.softwarearchitecture.solidprinciples.D.OracleRepository;
import com.arakamitech.softwarearchitecture.solidprinciples.D.UsuarioService;
import com.arakamitech.softwarearchitecture.solidprinciples.D.UsuarioInterface;
import com.arakamitech.softwarearchitecture.solidprinciples.I.Comible;
import com.arakamitech.softwarearchitecture.solidprinciples.I.Dormible;
import com.arakamitech.softwarearchitecture.solidprinciples.I.Persona;
import com.arakamitech.softwarearchitecture.solidprinciples.I.Robot;
import com.arakamitech.softwarearchitecture.solidprinciples.I.Trabajable;
import com.arakamitech.softwarearchitecture.solidprinciples.L.Aguila;
import com.arakamitech.softwarearchitecture.solidprinciples.L.Ave;
import com.arakamitech.softwarearchitecture.solidprinciples.L.Pinguino;
import com.arakamitech.softwarearchitecture.solidprinciples.L.Volador;
import com.arakamitech.softwarearchitecture.solidprinciples.O.Descuento;
import com.arakamitech.softwarearchitecture.solidprinciples.O.DescuentoNormal;
import com.arakamitech.softwarearchitecture.solidprinciples.O.DescuentoService;
import com.arakamitech.softwarearchitecture.solidprinciples.O.DescuentoVIP;
import com.arakamitech.softwarearchitecture.solidprinciples.S.EmailService;
import com.arakamitech.softwarearchitecture.solidprinciples.S.ReporteService;
import com.arakamitech.softwarearchitecture.solidprinciples.S.UsuarioEntity;

/**
 *
 * @author cristhian
 */
public class SoftwareArchitecture {

    public static void S() {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setId(Long.MIN_VALUE);
        usuario.setNumeroIdentificacion("1031");

        EmailService emailService = new EmailService();
        emailService.enviarCorreo(usuario);

        ReporteService reporteService = new ReporteService();
        reporteService.generarReporte();

        com.arakamitech.softwarearchitecture.solidprinciples.S.UsuarioService usuarioService = new com.arakamitech.softwarearchitecture.solidprinciples.S.UsuarioService();
        usuarioService.guardarUsuario(usuario);
    }

    public static void O() {
        Descuento descuentoNormal = new DescuentoNormal();
        DescuentoService descuentoService = new DescuentoService();
        descuentoService.calcular(descuentoNormal, 1000);

        Descuento descuentoVIP = new DescuentoVIP();
        DescuentoService descuentoService2 = new DescuentoService();
        descuentoService2.calcular(descuentoVIP, 1000);
    }

    public static void L() {
        Volador voladorInterface = new Aguila();
        voladorInterface.volar();

        Ave abstractClass = new Pinguino();
        abstractClass.toString();
    }

    public static void I() {
        Comible comibleInterface = new Persona();
        comibleInterface.comer();
        Dormible dormibleInterface = new Persona();
        dormibleInterface.dormir();
        Trabajable trabajableInterface = new Persona();
        trabajableInterface.trabajar();

        Trabajable trabajableRobotInterface = new Robot();
        trabajableRobotInterface.trabajar();
    }

    public static void D() {
        UsuarioInterface usuarioInterface = new OracleRepository();
        UsuarioService usuarioService = new UsuarioService(usuarioInterface);
        usuarioService.guardarUsuarioOracle();

        UsuarioInterface usuarioMysqlInterface = new MySqlRepository();
        UsuarioService usuarioService2 = new UsuarioService(usuarioMysqlInterface);
        usuarioService2.guardarUsuarioMysql();
    }

    public static void main(String[] args) {
        S();
        O();
        L();
        I();
        D();
    }
}
