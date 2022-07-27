package algebraLinear;

public class Main {
	public static void main (String [] args) {
		
		// Criando uma matriz

		Matriz matrizQuadrada = new Matriz(2, 2);
		double[][] auxiliar = { { 1, 2 }, { 3, 4 } };
		matrizQuadrada.setMatriz(auxiliar);
		System.out.println(matrizQuadrada + "\n");
		
		// Criando um Vetor

		Vetor vetor = new Vetor(2);
		double [] auxiliar2 = {  1, 2  };
		vetor.setVetor(auxiliar2);
		System.out.println(vetor + "\n");
		
		// Soma de matrizes
		
		Matriz matriz = new Matriz(2,2);
		matriz.add(matrizQuadrada, matrizQuadrada);
		System.out.println("Soma de matriz:\n" + matriz + "\n");
		
		// Soma de Vetores

		Vetor vetor2 = new Vetor(2);
		vetor2.addVetor(vetor, vetor);
		System.out.println("Soma de vetor:\n" + vetor2 + "\n");
		
		// Multiplicação de matriz por vetor
		
		Vetor multiplicacao = new Vetor (2);
		multiplicacao = matrizQuadrada.mulVetor(vetor);
		System.out.println("Multiplicação de matriz por vetor:\n" + multiplicacao + "\n");
		
		
		
		
	}

}
