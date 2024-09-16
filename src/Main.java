public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("John Doe", 20, 70.5, 1.75);

        if (aluno1.maiorDeIdade()) {
            System.out.println(aluno1.getNome() + " é maior de idade.");
        } else {
            System.out.println(aluno1.getNome() + " é menor de idade.");
        }

        double imc = aluno1.calculoIMC();
        System.out.println("Seu IMC é: " + imc);


        Aluno aluno2 = new Aluno("Fulano de Tal", 17, 50.5, 1.55);

        if (aluno2.maiorDeIdade()) {
            System.out.println(aluno2.getNome() + " é maior de idade.");
        } else {
            System.out.println(aluno2.getNome() + " é menor de idade.");
        }

        double imc2 = aluno2.calculoIMC();
        System.out.println("Seu IMC é: " + imc2);
    }
}
