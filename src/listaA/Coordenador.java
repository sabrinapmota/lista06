package listaA;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {

    private List<Professor> professorSupervisionados = new ArrayList<>();
    private final Double AUMENTO_SALARIO_COORDENADOR = 0.05;

    public Coordenador() {
    }

    public Coordenador(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
    }

    public void adicionaProfessor(Professor professor) {
        if (professorSupervisionados.size() <= 5) {
            professorSupervisionados.add(professor);
        }
    }

    public void aumentoSalario() {
        salario += salario * AUMENTO_SALARIO_COORDENADOR;
    }

    public List<Professor> getProfessorSupervisionados() {
        return professorSupervisionados;
    }

    public void setProfessorSupervisionados(List<Professor> professorSupervisionados) {
        this.professorSupervisionados = professorSupervisionados;
    }
}