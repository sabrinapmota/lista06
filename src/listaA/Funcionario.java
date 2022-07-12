package listaA;

public abstract class Funcionario {
    String nome;
    String cpf;
    String numeroRegistro;
    String OrdemLotacao;
    Double salario;


    public Funcionario(String nome, String cpf, String numeroRegistro, String ordemLotacao, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        OrdemLotacao = ordemLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrdemLotacao() {
        return OrdemLotacao;
    }

    public void setOrdemLotacao(String ordemLotacao) {
        OrdemLotacao = ordemLotacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
