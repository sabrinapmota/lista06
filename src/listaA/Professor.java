package listaA;

public class Professor extends Funcionario {


    String nivelGraduacao;
    String disciplinaMinistrada;
    Integer quantidadeAlunos;
    Integer quantigadeTurmas;
    Double salarioProfessor;
    Double aumentoSalario = 0.10;


    public Professor(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario, String nivelGraduacao, String disciplinaMinistrada, Integer quantidadeAlunos, Integer quantigadeTurmas) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantigadeTurmas = quantigadeTurmas;
    }


    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public Integer getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(Integer quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public Integer getQuantigadeTurmas() {
        return quantigadeTurmas;
    }

    public void setQuantigadeTurmas(Integer quantigadeTurmas) {
        this.quantigadeTurmas = quantigadeTurmas;
    }

    public void adicionarTurma(Integer quantigadeTurmas, Integer addTurma, Integer totalTurmas) {
        totalTurmas = quantigadeTurmas + addTurma;
        System.out.println("Seu total de turmas é: " + addTurma);
    }

    public void reajuste(Double aumentoSalario, Double salarioProfessor, Double aumentoSalarial) {
        aumentoSalarial = ((salarioProfessor * aumentoSalario) + salarioProfessor);
        System.out.println("Seu salário é: " + aumentoSalarial);
    }
}
