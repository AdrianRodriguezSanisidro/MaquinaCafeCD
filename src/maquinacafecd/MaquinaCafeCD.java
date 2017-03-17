/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafecd;

import javax.swing.JOptionPane;
import static maquinacafecd.Monedero.devolverDinero;
import static maquinacafecd.Monedero.meterDinero;
import static maquinacafecd.Productos.restarAzucar;
import static maquinacafecd.Productos.sumarAzucar;
import static maquinacafecd.Productos.prepararCafe;
import static maquinacafecd.Productos.prepararTe;
import static maquinacafecd.Productos.prepararChocolate;
import static maquinacafecd.Productos.getAzucar;
/**
 *Se elige la accion a realizar mediante el switch case
 * @author Adry
 */
public class MaquinaCafeCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Eleccion que realiza el usuario
         */
        int eleccion=0;
        do{
        switch(Integer.parseInt(JOptionPane.showInputDialog("1=Sumar azucar;2=Restar azucar;3=Introducir dinero;4=Cafe;5=Te;6=Chocolate;7=Devolver dinero;0=Salir"))){
            case 1:sumarAzucar();
            break;
            case 2:restarAzucar();
            break;
            case 3:meterDinero();
            break;
            case 4:prepararCafe(getAzucar());
            break;
            case 5:prepararTe(getAzucar());
            break;
            case 6:prepararChocolate(getAzucar());
            break;
            case 7:devolverDinero();
            break;
            case 0:System.exit(0);
            break;
        }
    }while(eleccion<0&&eleccion>7);
        }
}
