import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Funcionario();
		Funcionario funcionario = (Funcionario) pessoa;
		
		System.out.print("Entre com o seu nome: ");
		funcionario.setNome(sc.nextLine());
		System.out.print("Sua idade: ");
		funcionario.setIdade(sc.nextInt());
		System.out.println("Entre com a sua data de nascimento: ");
		sc.nextLine();
		funcionario.setDataNascimento(sc.nextDouble());
		System.out.println("Seu cpf: ");
		pessoa.cpf = sc.nextLine();
				
		System.out.println("\n-------------***********---------\n");
		
		System.out.print("Entre com o salario bruto: ");
		funcionario.setSalarioBruto(sc.nextDouble());
		System.out.print("Entre com a porcentagem o inss: ");
		funcionario.setInss(sc.nextDouble());
		System.out.print("Entre com a porcentagem do Imposto de renda: ");
		funcionario.setIr(sc.nextDouble());
		
		System.out.println("\n-------------***********---------\n");
		
		System.out.println(funcionario);
		
		
		
		sc.close();
	}

}
