
public class Endereco {
	private int id;
	private String cep, rua, bairro, cidade, uf, pais, numero, complemento;
	
	public Endereco(int id, String cep, String rua, String bairro, String cidade, String uf, String pais, String numero, String complemento) {
            this.id = id;
            this.cep = cep;
            this.cep = rua;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.pais = pais;
            this.numero = numero;
            this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

        public String getNumero() {
            return this.numero;
        }
        
        public void setNUmero(String numero) {
            this.numero = numero;
        }
}
