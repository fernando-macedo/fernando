/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happy.town;

import java.util.ArrayList;

/**
 *
 * @author labccet
 */
public class Hospital extends Cidade{
    private double preco;
    private double lucro;
    
    public Hospital (){
        if (Cidade.level == 1) {
            this.preco = 20000;
        }
        if (Cidade.level == 2) {
            this.preco = 30000;
        }
        if (Cidade.level == 3) {
            this.preco = 40000;
        }
    }
    
    private void construirHospital(){
        Hospital hospital = new Hospital();
        Stats.dinheiro -= this.preco;
        Stats.satisfacao += 0.05;
    }
    
    
    
}
