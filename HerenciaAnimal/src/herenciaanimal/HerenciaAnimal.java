/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal;

import ico.fes.herencia.Animal;
import ico.fes.herencia.Gato;
import ico.fes.herencia.Perro;

/**
 *
 * @author USUARIO
 */
public class HerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro heren = new Perro("Pastor Aleman", "Guau", 18, 60, "Gris", 4, "omnívoro", "Viviparos", "Terrestre");
       System.out.println(heren);
       
       Gato herencia = new Gato("Persa", "Categoria I", 15, 46, 4, "omnivoro", "viviparo", "Terrestre");
       System.out.println(herencia);
       
    }
    
}
