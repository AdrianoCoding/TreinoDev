/*
 * X patinhos, foram passear, alem das montanhas para brincar, a mamãe chamou X qua... 
 * E nenhum patinho voltou de lá....
 * 
 * 
 * Fazer um programa que determine a quantidade de patinhos
 */

import java.util.Scanner;

public class Patinho {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de patinhos: ");
        int pat_Quantidade = sc.nextInt();

        System.out.println( "\n\n"+pat_Quantidade + " patinhos foram passear");
        System.out.println("Além das montanhas");
        System.out.println("Para brincar");
        System.out.println("A mamã gritou: Quá, quá, quá, quá");
        System.out.println("Mas só " + (pat_Quantidade - 1) + " patinhos voltaram de lá.");
    }
}