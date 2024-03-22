import java.util.Scanner;

public class imc_calc {
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite seu peso: ");
        int peso_user = sc.nextInt();

        System.out.println("\nDigite sua altura: ");
        float altura_user = sc.nextFloat();

        float calc_imc = peso_user/(altura_user*altura_user);
        
        System.out.println("Seu IMC é equivalente a: " + calc_imc);

        System.out.print("=".repeat(30) + "\n");
        if(calc_imc < 18.5){
            System.out.println("Você está abaixo do peso");
            }else if(calc_imc >= 18.6 && calc_imc < 24.9){
                System.out.println("Você está no peso ideal");
                }else if(calc_imc >= 25.0 && calc_imc <= 29.9){
                    System.out.println("Levemente a cima do peso");
                    }else if(calc_imc >= 30.0 && calc_imc <= 34.9){
                        System.out.println("ATENÇÃO: Obesidade grau 1");
                        }else if(calc_imc >= 35.0 && calc_imc <= 39.9){
                            System.out.println("ATENÇÃO: Obesidade grau 2");
                            }else if (calc_imc >= 40.0) {
                                System.out.println("ATENÇÃO: Obesidade grau 3");
                                }
        System.out.print("=".repeat(30) + "\n");
    }
}



