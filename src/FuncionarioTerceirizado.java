
public class FuncionarioTerceirizado extends Pessoa {

	public double salarioLiquido;
	public double salarioBruto;
	public double inss;
	public double ir;
	public double bonificacao;
	
	public FuncionarioTerceirizado() {
		super();

	}

	public FuncionarioTerceirizado(String nome, int idade, double dataNascimento, String cpf, double salarioLiquido,
			double salarioBruto, double inss, double ir, double bonificacao) {
		super(nome, idade, dataNascimento, cpf);
		this.salarioBruto = salarioBruto;
		this.inss = inss;
		this.ir = ir;
		this.bonificacao = bonificacao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getIr() {
		return ir;
	}

	public void setIr(double ir) {
		this.ir = ir;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public double getBonificacao() {
		return bonificacao;
	}
	
	public double CalcularSalario() {
		return salarioLiquido = salarioBruto - ((salarioBruto * bonificacao / 100) + (salarioBruto * ir / 100) + (salarioBruto * inss / 100));
	}

	@Override
	public String toString() {
		return "Salário Bruto: " + salarioBruto + "\nSalário liquido: " + salarioLiquido + "\ninss: "
				+ inss + "Importo de renda: " + ir + "Bonus: " + bonificacao;
	}
}
