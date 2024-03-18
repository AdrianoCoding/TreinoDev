/*
Informar ao usuário a seguinte mensagem:
Digite o dia da semana (1 a 5 dias úteis, 6 para Sábado e 7 para Domingo)
Desenvolva um algoritmo para receber o número do dia (1 a 7), onde o sistema
deverá exibir se é dia útil ou final de semana. Se caso o valor recebido esteja fora do solicitado,
emitir uma mensagem informando que o valor é inválido.
 */

 import java.util.Scanner;
    public class atv2 {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            
        System.out.print( "\n "+ "=".repeat(10)+"Bem vindo ao Sistema" + "=".repeat(10) + "\n Digite um dia (1 a 7): ");
        int dia_user = sc.nextInt();

            if(dia_user >= 1 && dia_user <= 5){
                System.out.print("Hoje é um dia útil. Vamos ser produtivos! \n");
            }
            else if( dia_user == 6){
                System.out.print("É sábado! Aproveite o final de semana!\n");
            }else if( dia_user == 7){
                System.out.print("É domingo! Aproveite o final de semana!\n");
            }else{
                System.out.print("O valor inserido está fora do intervalo permitido (1 a 7). Por favor, tente novamente. \n");
            }

        }
    }
