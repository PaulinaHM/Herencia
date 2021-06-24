/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoracomposicion;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.componentes.Computadora;

/**
 *
 * @author USUARIO
 */
public class ComputadoraComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computadora co = new Computadora("Hp", "Intel Core i5");
        System.out.println(co);
                
        Monitor com = new Monitor("dell", "E2019", 8);
        System.out.println(com);
        
        CPU comp= new CPU("Dell", "Intel i5", 4);
        System.out.println(comp);
        
        Mouse compu= new Mouse("Hp", "Dual Mode", 300);
        System.out.println(compu);
        
        Teclado comput= new Teclado("Perrix", "Periduo", 90, 2);
        System.out.println(comput);
    }
    
}
