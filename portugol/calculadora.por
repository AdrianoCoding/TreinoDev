// O script a seguir, é referente a aula do dia 26/02/2024
// Foi solicitado um script que calcule o valor de X e Y, por multiplicação, adição, divisão e substração
// Os dados não são enviados para nenhum banco de dados na nuvem. Não saem da maquina
// Link deste projeto no github: https://github.com/AdrianoCoding/Estudos/portugol
// Feito por Adriano J. (https://adrianojr.online)
// Os dados coletados são salvos em variaveis, ou seja, ao desligar o computador, todos estes dados serão excluido automaticamente
programa
{
	real valor1, valor2
	real soma, multi, divisao, subtracao
	funcao inicio()
	{
			// ascii de calculadora - Inicio
			escreva(" _____    ___    _       _____   _   _   _        ___   ______   _____  ______    ___  \n")
			escreva("/  __ \\  / _ \\  | |     /  __ \\ | | | | | |      / _ \\  |  _  \\ |  _  | | ___ \\  / _ \\ \n")
			escreva("| /  \\/ / /_\\ \\ | |     | /  \\/ | | | | | |     / /_\\ \\ | | | | | | | | | |_/ / / /_\\ \\ \n")
			escreva("| |     |  _  | | |     | |     | | | | | |     |  _  | | | | | | | | | |    /  |  _  | \n")
			escreva("| \\__/\\ | | | | | |____ | \\__/\\ | |_| | | |____ | | | | | |/ /  \\ \\_/ / | |\\ \\  | | | | \n")
			escreva(" \\____/ \\_| |_/ \\_____/  \\____/  \\___/  \\_____/ \\_| |_/ |___/    \\___/  \\_| \\_| \\_| |_| \n")
			// ascii de calculadora - Fim
			
			escreva("\n\n Digite o primeiro valor a se calcular: ")
			leia(valor1)
			escreva("Digite o segundo valor a se calcular: ")
			leia(valor2)
			soma = valor1 + valor2
			escreva("\n")
			escreva("-------------------------------------------- \n" + "A Soma entre " + valor1 + " e: " + valor2 + " é igual a: " + soma + "\n")
			multi = valor1 * valor2
			escreva("A multiplicação entre: " + valor1 + " e: " + valor2 + " é igual a: " + multi + "\n")
			divisao = valor1 / valor2
			escreva("A divisão entre: " + valor1 + " e: " + valor2 + " é igual a: " + divisao + "\n")
			subtracao = valor1 - valor2
			escreva("A subtração entre: " + valor1 + " e: " + valor2 + " é igual a: " + subtracao + "\n -------------------------------------------- \n")
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2012; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */