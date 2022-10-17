/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pautaroman_trabajo2.u1;

/**
 *
 * @author PC-19
 */
public class Empleado {
    
        String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;

    public double calcularHorasExtra(){
        var retorno=0.0d;
        if (this.horasTrabajadas>160){
            var horasAdicionales=0;
            horasAdicionales=(this.horasTrabajadas-160);
            var valorPagarHoraExtra=this.costoHora*2;
            retorno=horasAdicionales * valorPagarHoraExtra;
       }
        return retorno;


    }
    public double calcularIngresos(int yearActual){     
        var retorno=0.0;
        var ingresoBasico=this.costoHora*this.horasTrabajadas;
        var ingresoAntiguedad = yearActual-this.yearIngreso;
        var valor20=ingresoBasico*0.02;
        var valorPorYear=valor20*ingresoAntiguedad;
        retorno=ingresoBasico;


        return retorno;

    }
    public double calcularImpuesto(int limite1, int limite2, int limite3){

        //< o > &&

        var retorno=0.0;
        if(this.calcularIngresos(yearIngreso)<=limite1){
            retorno=this.calcularIngresos(yearIngreso)*0;

        }if(this.calcularIngresos(yearIngreso)>limite1 && 
                this.calcularIngresos(yearIngreso)<=limite2){
        retorno=this.calcularIngresos(yearIngreso)*0.05;

        }if(this.calcularIngresos(yearIngreso)>limite2 && 
                this.calcularIngresos(yearIngreso)<=limite3){
        retorno=this.calcularIngresos(yearIngreso)*0.12;

        }if(this.calcularIngresos(yearIngreso)>limite3){
        retorno=this.calcularIngresos(yearIngreso)*0.25;
        }

        return retorno;
    }
    public double calcularTotal(){

        var retorno=0.0;
        retorno=this.calcularIngresos(yearIngreso)+this.calcularHorasExtra()-
                this.calcularImpuesto(100, 200, 300);

        return retorno;
    }
}
