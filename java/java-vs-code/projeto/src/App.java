/*
 * CRIE UM ALGORITMO QUE :

CALCULE O VOLUME DE UMA CAIXA D'AGUA
QUE POSSUI AS SEGUINTES MEDIDAS:

ALTURA = 2.5
LARGURA = 3.70
COMPRIMENTO = 4.10

VALUME = ALTURA * LARGURA * COMPRIMENTO
 */


public class App{
    public static void main (String[] args){
        float alt_obj, larg_obj, compr_obj, calc_obj;
        alt_obj = 2.5f;
        larg_obj = 3.70f;
        compr_obj = 4.10f;
        calc_obj = alt_obj * larg_obj * compr_obj;
    System.out.println("\n O volume deste objeto é: " + calc_obj);

    }
}