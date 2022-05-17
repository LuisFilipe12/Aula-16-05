
public class Funcionario extends Pessoa {

	public double salarioLiquido;
	public double salarioBruto;
	public double inss;
	public double ir;

	public Funcionario() {
		super();

	}

	public Funcionario(String nome, int idade, double dataNascimento, String cpf, double salarioLiquido,
			double salarioBruto, double inss, double ir) {
		super(nome, idade, dataNascimento, cpf);
		this.salarioBruto = salarioBruto;
		this.inss = inss;
		this.ir = ir;

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

	public double CalcularSalario() {
		return salarioLiquido = salarioBruto - ((salarioBruto * ir / 100) + (salarioBruto * inss / 100));
	}

	@Override
	public String toString() {
		return super.toString() + "Salário Bruto: " + salarioBruto + "\nSalário liquido: " + salarioLiquido + "\ninss: "
				+ inss + "Importo de renda: " + ir;

	}
}
