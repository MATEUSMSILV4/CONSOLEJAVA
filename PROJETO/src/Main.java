import java.util.Scanner;


public class Main {

	

	public static void main(String[] args) {
		
		System.out.println("Sistemas venda console");
		
		System.out.println("----------------------------");
		
	     Scanner sc = new Scanner(System.in);

	        String produtoNome;
	        double preco;
	        int unidade;

	        System.out.print("Digite o nome do produto: ");
	        produtoNome = sc.nextLine();

	        System.out.print("Digite o preço do produto: ");
	        preco = sc.nextDouble();

	        System.out.print("Digite a quantidade de unidades compradas: ");
	        unidade = sc.nextInt();

	        
	      

	double totalCompra = preco * unidade;

	System.out.println("-------------------------------");
	
	        System.out.println("Produto comprado: " + produtoNome);
	        System.out.printf("Valor total da compra: %.2f%n", totalCompra);
	        System.out.println();
	

	        sc.close();
	}

}
