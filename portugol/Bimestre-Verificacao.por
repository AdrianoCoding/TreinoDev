// Construir um algoritmo em PORTUGOL que leia dois números e efetue a adição.
// - Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se 
// a ele mais 8;
// - Caso o valor somado seja menor ou igual a 20, este deverá ser apresentado 
// Substraindo-se 5.

programa{
	real num1, num2, soma, sub, juro
	
	funcao inicio(){
		// ascii de calculadora - Inicio
			escreva(" █████  ██       ██████   ██████  ██████  ██ ████████ ███    ███  ██████  \n")
			escreva("██   ██ ██      ██       ██    ██ ██   ██ ██    ██    ████  ████ ██    ██ \n")
			escreva("███████ ██      ██   ███ ██    ██ ██████  ██    ██    ██ ████ ██ ██    ██ \n")
			escreva("██   ██ ██      ██    ██ ██    ██ ██   ██ ██    ██    ██  ██  ██ ██    ██ \n")
			escreva("██   ██ ███████  ██████   ██████  ██   ██ ██    ██    ██      ██  ██████  \n")
			// ascii de calculadora - Fim

			// Inicio da função do algoritmo
			escreva("\n Digite o primeiro valor: ")
			leia(num1)
			escreva("\n Digite o segundo valor: ")
			leia(num2)
			escreva("\n\n")
			
			soma= num1 + num2
			se(soma>20){
				juro = soma + 8
				escreva("O valor é:  " + soma + "  com acrecimo de 8:  " + juro + "\n\n")
				}senao{
					juro = soma - 5
					escreva("o valor é:  " + soma + " com decrecimo de 5:  " + juro + "\n\n")
				}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */