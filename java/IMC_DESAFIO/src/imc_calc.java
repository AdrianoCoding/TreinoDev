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
    
    
    System.out.println("|> Digite seu sexo (F ou H): ");
    String sexo_usuario = sc.nextLine();
    
    if(sexo_usuario.equals("f")){
        System.out.println("|> Digite seu nome: ");
        String nome_usuario = sc.nextLine();
        System.out.println("|> Por favor, digite seu peso: ");
        int peso_usuario = sc.nextInt();
        System.out.println("|> Por favor, digite sua altura (em CM): ");
        int altura_usuario = sc.nextInt();
        
        // Parte em que o usuario irá ver as informações coletadas
        System.out.println("\n --==Verificando dados==-- ");
        System.out.println("|> Nome: " + nome_usuario + "<|");
        System.out.println("|> Sexo: " + sexo_usuario + "   <|");
        System.out.println("|> Peso: " + peso_usuario + "   <|");
        System.out.println("|> Altura: " + altura_usuario + " <|");
        // FIM parte em que o usuario irá ver as informações coletadas
        
        System.out.println("Seu peso adequado é: ");
        double peso_adequado_usuario;
        peso_adequado_usuario = (62.1 * (altura_usuario / 100)) - 44.7;
        System.out.print("======= " + peso_adequado_usuario + " =======" + "\n");
            if(peso_adequado_usuario < 18.5){
                System.out.println(nome_usuario + " você está abaixo do peso");
            } 
            if(peso_adequado_usuario >= 18.5 && peso_adequado_usuario < 24.9){
                System.out.println(nome_usuario + " você está com peso normal");
            }
            if(peso_adequado_usuario >= 25 && peso_adequado_usuario < 29.9){
                System.out.println(nome_usuario + " você está com sobrepeso");
            } 
                else {
                    System.out.println("O paciente está obeso");
                }
        }
    else if(sexo_usuario.equals("h")){
        System.out.println("|> Digite seu nome: ");
        String nome_user = sc.nextLine();
        System.out.println("|> Por favor, digite seu peso: ");
        int peso_usuario = sc.nextInt();
        System.out.println("|> Por favor, digite sua altura (em CM): ");
        int altura_usuario = sc.nextInt();
        
        // Parte em que o usuario irá ver as informações coletadas
        System.out.println("\n --==Verificando dados==-- ");
        System.out.println("|> Nome: " + nome_user + "      <|");
        System.out.println("|> Sexo: " + sexo_usuario + "   <|");
        System.out.println("|> Peso: " + peso_usuario + " <|");
        System.out.println("|> Altura: " + altura_usuario + " <|");
        // FIM parte em que o usuario irá ver as informações coletadas
        
        System.out.println("Seu peso adequado é ");
        double peso_adequado_usuario;
        peso_adequado_usuario = (72.7 * (altura_usuario / 100)) - 44.7;
        System.out.print("======= " + peso_adequado_usuario + " =======" + "\n");
        if(peso_adequado_usuario < 18.5){
                System.out.println(nome_user + " você está abaixo do peso");
            } 
            if(peso_adequado_usuario >= 18.5 && peso_adequado_usuario < 24.9){
                System.out.println(nome_user + " Você está com peso normal");
            }
            if(peso_adequado_usuario >= 25 && peso_adequado_usuario < 29.9){
                System.out.println(nome_user + " Você está com sobrepeso");
            } 
            else {
                System.out.println(nome_user + " Você está obeso\n");
            }
    }
    else{
        System.out.println("O valor digitado não é VALIDO...");
        }
    }
}