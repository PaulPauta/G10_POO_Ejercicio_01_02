/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pautaroman_trabajo2.u1;

/**
 *
 * @author PC-19
 */
public class PautaRoman_Trabajo2U1 {

    public static void main(String[] args) {

        var empleado1 = new Empleado();
        empleado1.costoHora = 2.5;
        empleado1.horasTrabajadas = 170;
        empleado1.nombre = "Jorge";
        empleado1.yearIngreso = 2010;

        var empleado2 = new Empleado();
        empleado2.nombre = "Diego";
        empleado2.horasTrabajadas = 110;
        empleado2.costoHora = 2;
        empleado2.yearIngreso = 2013;

        var empleado3 = new Empleado();
        empleado3.nombre = "Camila";
        empleado3.horasTrabajadas = 105;
        empleado3.costoHora = 3.5;
        empleado3.yearIngreso = 2007;

        System.out.println("El empleado se llama: " + empleado1.nombre
                + " ,a trabajado un total de " + empleado1.horasTrabajadas
                + " horas " + "a un costo de " + empleado1.costoHora + "$ la hora."
                + " Ingreso a la empresa en el año: "
                + empleado1.yearIngreso + ".");
        System.out.println("El ingreso del empleado es "
                + empleado1.calcularIngresos(2022) + "$");
        System.out.println("El bono por horas extras es de:"
                + empleado1.calcularHorasExtra() + "$");
        System.out.println("El impuesto a pagar es de: "
                + empleado1.calcularImpuesto(100, 200, 300) + "$");
        System.out.println("El ingreso total es de: "
                + empleado1.calcularTotal(2022, 100, 200, 300) + "$");

        System.out.println("El empleado se llama: " + empleado2.nombre
                + " ,a trabajado un total de " + empleado2.horasTrabajadas
                + " horas " + "a un costo de " + empleado2.costoHora + "$ la hora."
                + " Ingreso a la empresa en el año: "
                + empleado2.yearIngreso + ".");
        System.out.println("El ingreso del empleado es "
                + empleado2.calcularIngresos(2022) + "$");
        System.out.println("El bono por horas extras es de:"
                + empleado2.calcularHorasExtra() + "$");
        System.out.println("El impuesto a pagar es de: "
                + empleado2.calcularImpuesto(100, 200, 300) + "$");
        System.out.println("El ingreso total es de: "
                + empleado2.calcularTotal(2022, 100, 200, 300) + "$");

        System.out.println("El empleado se llama: " + empleado3.nombre
                + " ,a trabajado un total de " + empleado3.horasTrabajadas
                + " horas " + "a un costo de " + empleado3.costoHora + "$ la hora."
                + " Ingreso a la empresa en el año: "
                + empleado3.yearIngreso + ".");
        System.out.println("El ingreso del empleado es "
                + empleado3.calcularIngresos(2022) + "$");
        System.out.println("El bono por horas extras es de:"
                + empleado3.calcularHorasExtra() + "$");
        System.out.println("El impuesto a pagar es de: "
                + empleado3.calcularImpuesto(100, 200, 300) + "$");
        System.out.println("El ingreso total es de: "
                + empleado3.calcularTotal(2022, 100, 200, 300) + "$");

    }

}
