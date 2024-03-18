/*
Faça uma estrutura em Java utilizando if-else para verificar se um determinado número é positivo,
negativo ou nulo (igual a zero). Essa informação deverá ser recebida por meio da classe Scanner.
Imprima na tela o resultado.
 */

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("== Olá == \nDigite um número: ");
        int val = sc.nextInt();
        sc.close();

            if( val > 0){
                System.out.println("O valor digitado é POSITIVO");
            }else if(val < 0 ){
                System.out.println("O valor digitado é NEGATIVO");
            }else if(val == 0){
                System.out.println("O valor digitado é NULO");
            }
    }
}
