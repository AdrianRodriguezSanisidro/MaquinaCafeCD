/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafecd;

/**
 *
 * @author Adry
 */
public class Productos {
    private static String cafe,te,chocolate;
    private static int azucar;

    public static String getCafe() {
        return cafe;
    }

    public static String getTe() {
        return te;
    }

    public static String getChocolate() {
        return chocolate;
    }

    public static int getAzucar() {
        return azucar;
    }
    
    public static void agregarAzucar(int azucar){
        
    }
    public static int sumarAzucar(){
        return azucar;
    }
    public static int restarAzucar(){
        return azucar;
    }
    public static String prepararCafe(int azucar){
        return cafe;
    }
    public static String prapararTe(int azucar){
        return te;
    }
    public static String prepararChocolate(int azucar){
        return chocolate;
    }
}
