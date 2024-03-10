public class Aula {
    public static void main(String[]args){
    float alt_objeto, larg_objeto, compriment_objeto, calc_objeto;
    alt_objeto =  2.5f;
    larg_objeto = 3.70f;
    compriment_objeto = 4.10f;
    
    calc_objeto = alt_objeto * larg_objeto * compriment_objeto;
    
    System.out.print("O objeto com os seguintes parametros: \n" + alt_objeto + "\n" + larg_objeto + "\n" + compriment_objeto + "\nTem o volume equivalente a: " + calc_objeto + "\n");    
    }
}
