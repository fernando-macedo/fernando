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
public class Moradia {
    public double preco;
    
    public Moradia (){
        this.preco = preco;
    }
    
    private void construirCasa(){
        Moradia casa = new Moradia ();
        preco = 500;
        Stats.dinheiro -= preco;
        Stats.populacao += 3;
    }
    
    private void construirPredio(){
        Moradia predio = new Moradia ();
        preco = 5000;
        Stats.dinheiro -= preco;
        Stats.populacao += 20;
        
    }
}
