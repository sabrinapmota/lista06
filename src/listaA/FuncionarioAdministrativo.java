package listaA;

public class FuncionarioAdministrativo extends Funcionario {
    String funcaoAdministrativa;
    String senhoridade;
    Double salarioFuncionario;
    Double aumentoSalarioFuncionario = 0.10;


    public FuncionarioAdministrativo(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario, String funcaoAdministrativa, String senhoridade) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senhoridade = senhoridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
    public void aumentoFuncionario(Double salarioFuncionario, Double aumentoSalarioFuncionario, Double totalSalarioFuncionario){
        totalSalarioFuncionario = ((salarioFuncionario *aumentoSalarioFuncionario ) + salarioFuncionario);
        System.out.println(" Seu salário é: "  + salarioFuncionario);
    }
}
