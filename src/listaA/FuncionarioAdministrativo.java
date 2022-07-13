package listaA;

public class FuncionarioAdministrativo extends Funcionario {
    private String funcaoAdministrativa;
    private String senhoridade;
    private  final  Double AUMENTO_SALARIO = 0.10;


    public FuncionarioAdministrativo(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario, String funcaoAdministrativa, String senhoridade) {
        super(nome, cpf, numeroRegistro, ordemLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senhoridade = senhoridade;
    }
    public void aumentoSalario() {
        Double valorAumento = salario * AUMENTO_SALARIO;
        salario += valorAumento;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenhoridade() {
        return senhoridade;
    }

    public void setSenhoridade(String senhoridade) {
        this.senhoridade = senhoridade;
    }
}
