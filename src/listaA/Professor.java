package listaA;

public class Professor extends Funcionario {


    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private Integer quantidadeAlunos;
    private Integer quantigadeTurmas21;
    private final Double AUMENTO_SALARIO = 0.10;


    public Professor(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario, String nivelGraduacao, String disciplinaMinistrada, Integer quantidadeAlunos, Integer quantigadeTurmas) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantigadeTurmas = quantigadeTurmas;


    }

    public void aumentoSalario(){
        Double valorAumento = salario * AUMENTO_SALARIO;
        salario += valorAumento;
        System.out.println("O salário reajustado é: " + salario);
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
}
