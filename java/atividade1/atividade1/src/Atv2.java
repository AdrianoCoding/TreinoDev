/*
 * Elabore um programa que solicite ao usuário três notas. Sendo assim: primeira prova, segunda prova
 * e trabalho. Em seguida, calcule a média dessas notas. 
 * Usando o operador ternário, determine se o aluno foi aprovado ou reprovado. 
 * Faça a impressão da média e situação do aluno na tela.
 */

import java.util.Scanner;

public class Atv2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
            
        System.out.println("\n|> Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("|> Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("|> Digite a nota do seu trabalho: ");
        int nota_trab = sc.nextInt();

        sc.close();

        int calc_media;
        calc_media = (nota1 + nota2 + nota_trab)/3;

        System.out.println("\nA nota de media é igual a: " + calc_media + "\n");
            if(calc_media >= 6){
                System.out.println("-".repeat(30));
                System.out.println(" ==== O aluno foi: APROVADO ====");
                System.out.println("-".repeat(30));
            }else{
                System.out.println("-".repeat(30));
                System.out.println(" ==== O aluno foi REPROVADO ====");
                System.out.println("-".repeat(30));
            }
            }
        }
    
