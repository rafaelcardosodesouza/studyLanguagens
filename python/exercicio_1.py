#calculo de IMC

'''
#execicio principal
nome = "Rafael Cardoso"
altura = 1.70
peso = 130
imc = peso / (altura*altura) #peso/(altura*altura)

print("o seu nome é", nome)
print("tem", altura, "metros")
print(nome, "o seu imc é:", imc)
'''
#formatação de string (introdução)

nome = "Rafael Cardoso"
altura = 1.70
peso = 130
imc = peso / (altura*altura) #peso/(altura*altura)

linha1 = f'o seu nome é {nome}' #inciamos a string com aspas simples e antes da abertura colocamos f
                              #isso faz com que podemos formatar a string, para chamar as variaveis 
                              # dentro da propria string usamos {} para indicar que nao é uma palavra 
                              # mas sim uma variavel 

linha2 = f'tem {altura: .2f} metros' #para fazer uma formação nas casas decimais, ou seja, para exibir uma
                                     #quatidade X de casas decimas usamos .2f indica que apois do ponto tera
                                     #duas casas decimais para indicar que iremos formatar a variavel temos 
                                     #que por dois pontos : 

linha3 = f'nome o seu imc é: {int(imc)}' #aqui fiz a converção do imc para um numero int

#print("o seu nome é", nome)
#print("tem", altura, "metros")
#print(nome, "o seu imc é:", imc)

print(linha1)
print(linha2)
print(linha3)

