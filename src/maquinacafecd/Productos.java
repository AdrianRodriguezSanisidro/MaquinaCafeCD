/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafecd;

/**
 *Todos los metodos que afectan al producto
 * @author Adry
 */
public class Productos {
    /**
     * Los 3 productos que se pueden comprar en la maquina
     */
    private static String cafe,te,chocolate;
    /**
     * Cantidad de azucar que se usara al elaborar el producto
     */
    private static int azucar;
/**
 * Getter de cafe
 * @return cafe
 */
    public static String getCafe() {
        return cafe;
    }
/**
 * Getter de te
 * @return te
 */
    public static String getTe() {
        return te;
    }
/**
 * Getter de chocolate
 * @return chocolate
 */
    public static String getChocolate() {
        return chocolate;
    }
/**
 * Getter de azucar
 * @return azucar
 */
    public static int getAzucar() {
        return azucar;
    }
    /**
     * Agrega el azucar al producto
     * @param azucar 
     */
    public static void agregarAzucar(int azucar){
        
    }
    /**
     * Aumenta la cantidad de azucar
     * @return azucar
     */
    public static int sumarAzucar(){
        return azucar;
    }
    /**
     * Reduce la cantidad de azucar
     * @return azucar
     */
    public static int restarAzucar(){
        return azucar;
    }
    /**
     * Prepara cafe con el azucar que se puso
     * @param azucar
     * @return cafe
     */
    public static String prepararCafe(int azucar){
        return cafe;
    }
    /**
     * Prepara te con el azucar que se puso
     * @param azucar
     * @return 
     */
    public static String prepararTe(int azucar){
        return te;
    }
    /**
     * Prepara chocolate con el azucar que se puso
     * @param azucar
     * @return 
     */
    public static String prepararChocolate(int azucar){
        return chocolate;
    }
}
