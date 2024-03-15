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
        System.out.println("|> Por favor, digite seu peso: ");
        int peso_usuario = sc.nextInt();
        System.out.println("|> Por favor, digite sua altura (em CM): ");
        int altura_usuario = sc.nextInt();
        
        // Parte em que o usuario irá ver as informações coletadas
        System.out.println("\n --==Verificando dados==-- ");
        System.out.println("|> Sexo: " + sexo_usuario + "   <|");
        System.out.println("|> Peso: " + peso_usuario + "   <|");
        System.out.println("|> Altura: " + altura_usuario + " <|");
        // FIM parte em que o usuario irá ver as informações coletadas
        
        System.out.println("O peso ideal para tais parâmetros é: ");
        double peso_adequado_usuario;
        peso_adequado_usuario = (62.1 * (altura_usuario / 100)) - 44.7;
        System.out.print("======= " + peso_adequado_usuario + " =======" + "\n");
        }
    else if(sexo_usuario.equals("h")){
        System.out.println("Certo, você é: HOMEM");
        }
    else{
        System.out.println("O valor digitado não é VALIDO...");
        }
    }
}
