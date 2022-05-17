
public class Pessoa {

	public String nome;
	public double dataNascimento;
	public String cpf;
	public int idade;

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, double dataNascimento, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(double dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + "\nidade: " + "\ndata nascimento: " + "cpf: " + cpf;
	}

}
