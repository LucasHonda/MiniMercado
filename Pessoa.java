import java.util.List;

public class Pessoa {
	private int id;
	private String nome, dataNascimento, cpf, rg;
	private char sexo;
	private List<String> Emails;
	private List<String> Telefones;
	private List<Endereco> Enderecos;
	
	public Pessoa(int id, String nome, String dataNascimento, String cpf, String rg) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public boolean setDataNascimento(String dataNascimento) {
		
		if (!Utilidades.validarData(dataNascimento))
			return false;
		
		this.dataNascimento = dataNascimento;
		return true;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		
		if (!Utilidades.validarCPF(cpf))
			return false;
		
		this.cpf = cpf;
		return true;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public List<String> getEmails() {
		return Emails;
	}

	public boolean adicionarEmail(String email) {
		
		if (this.Emails.contains(email))
			return false;
		
		this.Emails.add(email);
		return true;
	}
	
	public boolean removerEmail(String email) {
		
		if (!this.Emails.contains(email))
			return false;
		
		this.Emails.remove(email);
		return true;
	}

	public List<String> getTelefones() {
		return Telefones;
	}

	public boolean adicionarTelefone(String telefone) {
		
		if (this.Telefones.contains(telefone))
			return false;
		
		this.Telefones.add(telefone);
		return true;
	}
	
	public boolean removerTelefone(String telefone) {
		
		if (!this.Telefones.contains(telefone))
			return false;
		
		this.Telefones.remove(telefone);
		return true;
	}

	public List<Endereco> getEnderecos() {
		return Enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		Enderecos = enderecos;
	}
	
	
}
