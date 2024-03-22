import java.util.Scanner;

public class atv4 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome_user = sc.nextLine();
        System.out.println("|> Certo, " + nome_user + " Agora digite sua idade: ");
        int idade_user = sc.nextInt();
        
            if (idade_user > 115) {
                System.out.println("Idade invalida, por favor, digite sua idade real !");
            }else if(idade_user < 115){
                System.out.println("|>" + nome_user + " Escolha seu sexo: [f] para feminino ou [m] para masculino");
                char sexo_user = sc.next().charAt(0);
                    if(sexo_user == 'm' || sexo_user == 'M'){
                        System.out.println("Masculino. OK");
                        System.out.println("Para fins de contato, digite seu telefone: ");
                        String telefone = sc.nextLine();


                    }else if(sexo_user == 'f' || sexo_user =='F'){
                        System.out.println("Feminino. OK");
                        System.out.println("Para fins de contato, digite seu telefone: ");
                        String telefone = sc.nextLine();
                        

                    }

                    System.out.println("\n \nCADASTRO REALIZADO COM SUCESSO");
                    System.out.println("NOME:" + nome_user);
                    System.out.println("IDADE " + idade_user);
                    if(sexo_user == 'm' || sexo_user == 'M'){
                    System.out.println("Sexo: Masculino");

                    }else if(sexo_user == 'f' || sexo_user == 'F'){
                    System.out.println("Sexo: Feminino");
                    
                    }
        }
    }
}
