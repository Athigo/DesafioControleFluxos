import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro número deve ser menor que o segundo número");
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        
		int contagem = parametroDois - parametroUm;
        int diferenca = 1;
        while(contagem>0){
            System.out.println("Imprimindo número "+diferenca);
            diferenca++;
            contagem--;
        }
	}
}