public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public boolean maiorDeIdade() {
        return idade >= 18;
    }

    public double calculoIMC() {
        return peso / (altura * altura);
    }
}
