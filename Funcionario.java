
public class Funcionario extends Pessoa {
	private String cargo, dataAdmissao, dataDemissao;
	private float salario;
	
	public Funcionario(int id, String nome, String dataNascimento, String cpf, String rg, String cargo, String dataAdmissao, String dataDemissao) {
		super(id, nome, dataNascimento, cpf, rg);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public boolean setDataAdmissao(String dataAdmissao) {
		if (!Utilidades.validarData(dataAdmissao))
			return false;
		
		this.dataAdmissao = dataAdmissao;
		return true;
	}

	public String getDataDemissao() {
		return dataDemissao;
	}

	public boolean setDataDemissao(String dataDemissao) {
		if (!Utilidades.validarData(dataDemissao))
			return false;
		
		this.dataDemissao = dataDemissao;
		return true;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
