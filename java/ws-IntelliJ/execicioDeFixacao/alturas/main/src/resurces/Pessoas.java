package resurces;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }


}
