algoritmo "Controle de Custos Log�sticos"
 //codigo criado usando visualg 3.0.7.0
var
   kmPercorrido, kmValor, valorTotal: real
   qtdCaminhao, i: inteiro
   tonelada: inteiro
   capacidade, distancia: vetor[1..100] de real
   valorKm: vetor[1..100] de real
   cargaTotal: real
   valorTransporte: vetor[1..100] de real
   qtdUltilizado : inteiro

inicio
   escreval("Bem-vindo ao centro de log�stica")
   escreval("")
   escreva("Digite a carga em toneladas: ")
   leia(tonelada)
   escreva("Digite a quantidade de caminh�es dispon�veis: ")
   leia(qtdCaminhao)

   valorTotal <- 0
   cargaTotal <- 0
   qtdUltilizado <- 1
   escreval("")
   escreval("========================================")
   escreva("")

   i <- 1
   enquanto cargaTotal < tonelada fa�a
      escreval(cargaTotal," tonelada de ", tonelada, " toneladas alocada.")
      escreva("Digite a capacidade do caminh�o ", i, " em toneladas: ")
      leia(capacidade[i])

      se cargaTotal + capacidade[i] > tonelada ent�o
         capacidade[i] <- tonelada - cargaTotal // Ajusta a capacidade para a carga restante
      fimse

      cargaTotal <- cargaTotal + capacidade[i]

      escreva("Digite a dist�ncia que o caminh�o ", i, " percorrer� em KM: ")
      leia(distancia[i])
      escreva("Digite o valor por KM rodado do caminh�o ", i, ": ")
      leia(valorKm[i])

      escreval("_______________________________________________________")
      escreva("")

      // Sem desconto dos 25%
      valorTransporte[i] <- capacidade[i] * distancia[i] * valorKm[i]

      //verificia se tera ou nao desconto
      se capacidade[i] >= 45 ent�o
         valorTransporte[i] <- valorTransporte[i] * 0.75
      fimse
      valorTotal <- valorTotal + valorTransporte[i]

      //aqui atualiza a variaveis de controle
      i <- i + 1
      qtdUltilizado <- qtdUltilizado + 1
      escreval("")
   fimenquanto
   //corre��o da variavel para nao exibir um caminh�o zerado
   qtdUltilizado <- qtdUltilizado - 1
   escreval("")
   escreval("            Relat�rio de Valores:")
   escreval("")
   escreval("")
   escreval("Carga total: ", tonelada," Toneladas.")
   escreval("Carga alocada em", qtdUltilizado," caminh�o")
   escreval("Valor total do transporte: R$", valorTotal, )
   escreval("")
   escreval("relatorio individual")
      para i de 1 ate qtdUltilizado faca
        escreval("Custo do camin�o ", i,"�: R$", valorTransporte[i])
        escreval("Distancia a ser percorrido: ", distancia[i]," KM")
        escreval("========================================")
   escreval("")
   fimpara



fimalgoritmo

