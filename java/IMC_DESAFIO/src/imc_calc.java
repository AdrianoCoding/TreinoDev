import java.util.Scanner;

public class imc_calc { // IGNORA ESSA CLASS, É APENAS PARA O PROJETO FUNCIONAR AQUI...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String NOME = sc.nextLine();
        System.out.println("Obrigado, " + NOME);

        System.out.println("[1] Masculino");
        System.out.println("[2] Feminino");
        System.out.print("Selecione o sexo da pessoa de acordo com as alternativas acima: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Sexo Masculino");
        } else if (num == 2) {
            System.out.println("Sexo feminino");
        }

        System.out.print("Agora digite sua altura (utilize o ponto para decimais, exemplo 1.70): ");
        double altura = sc.nextDouble();

        double pesoIdeal;

        if (num == 1) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para esse Homem é: " + pesoIdeal);
        } else if (num == 2) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para essa Mulher é: " + pesoIdeal);
        }
    }
}
