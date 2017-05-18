/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happy.town;

/**
 *
 * @author labccet
 */
public class Cidade {
    protected static int level;
    private double imposto;
    
    Cidade(){
        this.level = 1;
        this.imposto = 10;
    }
    
    private void uparLevel (){
        this.level ++;
    }
    
    private void aumentarImposto (){
        this.imposto++; 
    }
    
    private void reduzirImposto (){
        this.imposto--;
    }

    public int getLevel() {
        return level;
    }

    public double getImposto() {
        return imposto;
    }


    
}
