/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate.naval;
import java.util.Scanner;
/**
 *
 * @author note
 */
public class CombateNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int usuario[][]= new int [5][5];
        int maquina [][] = new int [5][5];
        int fila ; 
        int columna;
        int filaAtaque;
        int columnaAtaque;
        int contU = 5;
        int contM = 5;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese coordenadas");
            System.out.println("ingrese fila y columna");
            fila = sc.nextInt();
            columna = sc.nextInt();
            usuario[fila][columna]= 1;
 
        }
        for (int i = 0; i < 5; i++) {
            fila = (int)(Math.random()*5);
            columna = (int)(Math.random()*5);
            usuario[fila][columna]= 1;
        }
        while((contU > 0) ||(contM > 0)) {
            System.out.println("Ingrese coordenadas de ataque");
            System.out.println("Ingrese fila y columna");
            filaAtaque= sc.nextInt();
            columnaAtaque = sc.nextInt();
            
            if (maquina[filaAtaque][columnaAtaque] == 1){
                maquina [filaAtaque][columnaAtaque] = 0;
                contM--;
                System.out.println("Al adversario le quedan " +contM + "barcos");
            }else{
                System.out.println("Fallaste");
            }
            System.out.println("");
            System.out.println("Es el turno de tu Adversario");
            System.out.println("");
            
            filaAtaque= (int)(Math.random()*5);
            columnaAtaque = (int)(Math.random()*5);
            
            if (usuario[filaAtaque][columnaAtaque] == 1){
                usuario [filaAtaque][columnaAtaque] = 0;
                contU--;
                System.out.println("Te quedan " +contU + "barcos");
            }else{
                System.out.println("El adversario fallo en su ataque");
            }
            System.out.println("");
        }
        if(contU == 0){
            System.out.println("Perdiste");
            System.out.println("");
            System.out.println("Game Over");
        }else{
            System.out.println("Has ganado");
        }    
    }
    
}
