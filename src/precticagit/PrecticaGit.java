/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precticagit;

import java.util.Scanner;

/**
 *
 * @author medin
 */
public class PrecticaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio = 0, resultado = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el radio: ");
        radio = sc.nextDouble();
        resultado = Math.PI*(radio)*(radio);
        System.out.println("El resultado es: " + resultado);
    }
    
}
