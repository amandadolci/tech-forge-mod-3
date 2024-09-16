public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private Universidade universidade;
    private String curso;

    public Pessoa(String nome, String dataNascimento, Universidade universidade, String curso) {
        this.nome = nome;
        this.dataDeNascimento = dataNascimento;
        this.universidade = universidade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String getNomeCursoUniversidade() {
        return nome + ", professor de " + curso + " na " + universidade.getNome();
    }
}
