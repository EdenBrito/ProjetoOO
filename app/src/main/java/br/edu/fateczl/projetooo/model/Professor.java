package br.edu.fateczl.projetooo.model;

public abstract class Professor {

    private String nome;
    private String matricula;
    private String idade;

    public Professor() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public abstract double calcSalario();

}
