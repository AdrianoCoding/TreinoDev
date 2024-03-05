programa
{
	real nivel_prof, horas_prof ,nivel1, nivel2, nivel3, soma
	
	funcao inicio()
	{
	nivel1 = 12.00
	nivel2 = 17.00
	nivel3 = 25.00
	
	
	escreva("Digite o nivel: ")
	leia(nivel_prof)
	escreva("Quantas horas você trabalhou: ")
	leia(horas_prof)

		se(nivel_prof == 1){
			soma = nivel1 * horas_prof
			escreva("O valor a receber, será: R$" + soma) 
			}

		senao se(nivel_prof == 2){
			soma = nivel2 * horas_prof
			escreva("O valor a receber, será: R$" + soma) 
			}

		senao se(nivel_prof == 3){
			soma = nivel3 * horas_prof
			escreva("O valor a receber, será: R$" + soma) 
			}

		senao{
			escreva("==--Este nivel não existe --==")
			}

	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */