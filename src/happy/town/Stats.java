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
public class Stats {
    
    public static double dinheiro;
    public static int populacao;
    public static double satisfacao;
    
    Stats (){
        this.dinheiro = 100000;
        this.populacao = 100;
        this.satisfacao = 0.7;
    }

    public static double getDinheiro() {
        return dinheiro;
    }

    public static void setDinheiro(double dinheiro) {
        Stats.dinheiro = dinheiro;
    }

    public static int getPopulacao() {
        return populacao;
    }

    public static void setPopulacao(int populacao) {
        Stats.populacao = populacao;
    }

    public static double getSatisfacao() {
        return satisfacao;
    }

    public static void setSatisfacao(double satisfacao) {
        if (Stats.satisfacao + satisfacao <= 1 )
        Stats.satisfacao = satisfacao;
        
    }
    
    
    
    
}
