// O sistema abaixo, é um script básico que coleta algumas informações como: CPF, nome, peso e altura
// Os dados não são enviados para nenhum banco de dados na nuvem. Não saem da maquina
// Link deste projeto no github: https://github.com/AdrianoCoding/Estudos/blob/main/portugol/sistema-de-cadastro.por
// Feito por Adriano J. (https://adrianojr.online)
programa
{
	inteiro numeroCPF
	cadeia nomeUsuario
	real pesoUsuario
	real alturaUsuario 
	
	funcao inicio()
	{
		escreva("-= Bem-vindo ao sistema =-")
		escreva("\n")
		escreva("Digite seu CPF: ")
		leia(numeroCPF)
		escreva("Como é seu nome?:")
		leia(nomeUsuario)
		escreva("Qual é seu peso? : ")
		leia(pesoUsuario)
		escreva("Qual é sua altura? : ")
		leia(alturaUsuario)
		escreva("\n\n")
		escreva("\n---\n Cadastro para: \nNome: " + nomeUsuario + "\nCPF: " + numeroCPF + "\npeso: " + pesoUsuario + "\naltura: " + alturaUsuario + "\n---\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 906; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */