package listaA;

public class Coordenador extends Funcionario {

    Integer quantidadeProfessorSupervisionado;
    Integer adicionaProfessor;
    Double salarioCoordenador;
    Double AumentoSalarioCoordenador = 0.05;


    public Coordenador(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario, Integer quantidadeProfessorSupervisionado, Integer adicionaProfessor) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
        this.quantidadeProfessorSupervisionado = quantidadeProfessorSupervisionado;
        this.adicionaProfessor = adicionaProfessor;
    }

    public Integer getQuantidadeProfessorSupervisionado() {
        return quantidadeProfessorSupervisionado;
    }

    public void setQuantidadeProfessorSupervisionado(Integer quantidadeProfessorSupervisionado) {
        this.quantidadeProfessorSupervisionado = quantidadeProfessorSupervisionado;
    }

    public Integer getAdicionaProfessor() {
        return adicionaProfessor;
    }

    public void setAdicionaProfessor(Integer adicionaProfessor) {
        this.adicionaProfessor = adicionaProfessor;
    }

    public void adicionarProfessor(Integer adicionaProfessor, Integer quantidadeProfessorSupervisionado, Integer totalProfessores) {
        totalProfessores = adicionaProfessor + quantidadeProfessorSupervisionado;

        System.out.println("o total de professores supervisionados é: " + quantidadeProfessorSupervisionado);

    }

    public void reajusteSalarioCoordenador(Double salarioCoordenador, Double aumentoSalarioCoordenador, Double totalSalario) {
        totalSalario = ((salario * aumentoSalarioCoordenador) + salarioCoordenador);
    }
}
