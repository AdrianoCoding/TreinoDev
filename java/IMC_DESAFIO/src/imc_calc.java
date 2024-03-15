/*
Construa um algoritmo que calcule o peso ideal de uma pessoa. Dados de entrada: 
VARIAVEIS NECESSARIA: altura e sexo. 

Fórmulas para cálculo do peso: peso ideal de 

homem = (72,7 x altura) - 58

mulher = (62,1 x altura) - 44,7

*/


import java.util.Scanner;
public class imc_calc {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite seu sexo (F ou M): ");
    String sexo_usuario = sc.nextLine();
    if(sexo_usuario.equals("f")){
        System.out.println("Ok, você é: MULHER \n");
        System.out.println("Por favor, digite seu peso: ");
        int peso_usuario = sc.nextInt();
        System.out.println("Por favor, digite sua altura (em CM): ");
        int altura_usuario = sc.nextInt();
        
        // Parte em que o usuario irá ver as informações coletadas
        System.out.println("\n Verificando dados: ");
        System.out.print("Sexo: " + sexo_usuario + "\n");
        System.out.println("Peso: " + peso_usuario );
        System.out.println("As informações estão corretas ? (S para sim ou N para não)");
        String continuar_user = sc.nextLine();
        if(continuar_user.equals("s")){
            System.out.println("O peso ideal para tais parâmetros é: ");
        }
    
    }
    else if(sexo_usuario.equals("h")){
        System.out.println("Certo, você é: HOMEM");
        }
    else{
        System.out.println("O valor digitado não é VALIDO...");
        }
    }
}
