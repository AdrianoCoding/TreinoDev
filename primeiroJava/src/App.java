import java.util.Scanner;
public class App{
    public void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia (1 a 7): ");
        int dia = scanner.nextInt();
        
        if(dia > 7 || dia <= 0){
            System.out.println("Esse dia não é valido, tente novamente");
        }else{
            if (dia <= 5) {
                System.out.println("É um dia útil");
            }else{
                if(dia == 6 || dia == 7){
                    System.out.println("Não é um dia útil");
                }
            }
        }
    }
}