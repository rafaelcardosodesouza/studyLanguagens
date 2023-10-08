package car;

public class Car {
    public String modelo;

    public int tempoUso;
    public String nome;
    public int ano;

    public int ligado;

    public void desligarCarro() {
        System.out.println(nome + " desligando");
        ligado = 0;
    }
    public void ligarCarro(){
        System.out.println("Ligando o carro: ");
    }
    public void detalhes() {
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("tempo de uso: " + tempoUso);
        System.out.println("Nome do veiculo: " + nome);

    }

    public void ligadoDesligado() {
        if (ligado == 1) {
            ligarCarro();
            System.out.println("Carro esta ligado");
        } else {
            desligarCarro();
            System.out.println("Carro desligado");
        }
    }

}
