package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

        ArrayList<MediaEstoque> lista = new ArrayList<>();
		
		Scanner teclado = new Scanner(System.in);
		boolean loop = true;
		
		while(loop == true) {
		MediaEstoque novoProduto = new MediaEstoque();

		System.out.println("\n------------\n     MENU\n------------");
		System.out.println("1 - Cadastar Produtos");
		System.out.println("2 - Exibir produtos");
		System.out.println("3 - Limpar lista");
		System.out.println("4 - Sair");
		System.out.println("------------\nEscolha uma opcao: ");
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			
		System.out.println("Informe o nome do produto:");
		String nome = teclado.next();
		novoProduto.setNome(nome);
		
		System.out.println("Digite a quantidade máxima do estoque: ");
		int maxima = teclado.nextInt();
		if(maxima > 0) {
			novoProduto.setQuantiMaxima(maxima);
		}
		else {
			System.out.println("Numero invalido!, Tente novamente!");
			return;
		}
		System.out.println("Digite a quantidaede minima do estoque: ");
		int minima = teclado.nextInt();
		if(minima > 0) {
			novoProduto.setQuantiMinima(minima);
		}
		else {
			System.out.println("Numero invalido!, Tente novamente!");
			return;
		}
		lista.add(novoProduto);
		novoProduto.calculaEstoque();
		novoProduto.info();
		break;
		case 2:
			System.out.println("\n--------------------");
			
			if(lista.isEmpty()) {
				System.out.println("    LISTA VAZIA   ");
			}

			else{
				for(MediaEstoque produto : lista ) {
				produto.exibirProdutos();
				System.out.println(" ");
			}
			}
			System.out.println("--------------------");
		break;
		
		case 3:
			lista.clear();     
			break;
		case 4:
			System.out.println("Saindo...");
			loop = false;
			return;
		}
		
		}
		
		
	}

}
