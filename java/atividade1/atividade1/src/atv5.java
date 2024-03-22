/*
 * Criar um programa que mostra a ordem dos números, até o número solicitado pelo usuario, 
 * os valores impares e pares até o número desejado. Usando FOR e Scanner
 */

import java.util.Scanner;

public class atv5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor desejado: ");
        int num_escolhido = sc.nextInt();
        for(int num = 0; num <= num_escolhido ; num++  ){
            System.out.println(num);
        }
    }
}
