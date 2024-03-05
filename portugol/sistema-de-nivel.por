programa
{
	real num1, num2, nivel1, nivel2, nivel3, nivel_verificar, aula_verificar, calcular
	funcao inicio()
	{
		nivel1 = 12.0
		nivel2 = 32.00
		nivel3 = 60.00
					// ascii de calculadora - INICIO
escreva(" █████  ██████  ██████  ███████ ███    ██ ██████   ███████   ██████\n")
escreva("██   ██ ██   ██ ██   ██ ██      ████   ██ ██   ██  ██        ██   ██\n")
escreva("███████ ██████  ██████  █████   ██ ██  ██ ██   ██  █████     ██████ \n")
escreva("██   ██ ██      ██   ██ ██      ██  ██ ██ ██   ██  ██        ██   ██\n")
escreva("██   ██ ██      ██   ██ ███████ ██   ████ ██████   ███████   ██   ██\n")
escreva("        Sistema Escolar de Computadores - Aprender\n\n")                                                                
                        // ascii de calculadora - Fim
		escreva("|> De acordo com seu contrato, informe seu nivel: ")
		leia(nivel_verificar)
		se(nivel_verificar > 3){
			escreva("\n--------------------\ninfelizmente o valor digitado não é valido\n\n")
			escreva("--|OBS: ESTE PAGAMENTO NÃO SERÁ CONSIDERADO|--\n--------------------\n")
			}
			
		escreva("|> Informe sua quantidade de aulas semanais: ")
		leia(aula_verificar)
		se(aula_verificar == 1){
			calcular = nivel1 * aula_verificar
			escreva("\n--------------------\n O valor a receber será: R$" + calcular + "\n--------------------\n")
			}

		se(aula_verificar == 2){
			calcular = nivel2 * aula_verificar
			escreva("\n--------------------\n O valor a receber será: R$" + calcular + "\n--------------------\n")
			}

		se(aula_verificar == 3){
			calcular = nivel3 * aula_verificar
			escreva("\n--------------------\n O valor a receber será: R$" + calcular + "\n--------------------\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 671; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2103; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */