import java.util.Scanner;

public class Fibonacci {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int a=1; 
        int b=0;
        int aux;
        System.out.println("Digite a posição do valor: ");
        int posiNum = sc.nextInt();


        for(int i=0; i<posiNum; i++){
            aux = a;
            a = a+b;
            b = aux;
        }
        System.out.print("O valor da posição: " + posiNum + " É igual a: " + b + "\n");
    }
}