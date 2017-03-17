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
    private String cafe,te,chocolate;
    int azucar;

    public String getCafe() {
        return cafe;
    }

    public String getTe() {
        return te;
    }

    public String getChocolate() {
        return chocolate;
    }

    public int getAzucar() {
        return azucar;
    }
    
    public void agregarAzucar(int azucar){
        
    }
    public int sumarAzucar(){
        return azucar;
    }
    public int restarAzucar(){
        return azucar;
    }
    public String prepararCafe(){
        return cafe;
    }
    public String prapararTe(){
        return te;
    }
    public String prepararChocolate(){
        return chocolate;
    }
}
