import java.util.Scanner;

public class Jaiminho {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Integer QT = Integer.parseInt(scanner.nextLine());
		//loop sobre a quantidade de entradas
		String respostas[] = new String[QT];
		for (int i = 0;i < QT; i++){
			Integer N = Integer.parseInt(scanner.nextLine());
			PontoDiario1[] pontos = new PontoDiario1[N];
			//loop sobre a quantidade de pontos diarios sobre cada entrada
			for(int j = 0; j < N; j++) {
				String ponto = scanner.nextLine();
				String[] entradas = ponto.split(" ");
				
				PontoDiario1 pontoDiario = new PontoDiario1();
				pontoDiario.entradaPrimeiro = entradas[0];
				pontoDiario.saidaPrimeiro = entradas[1];
				pontoDiario.entradaSegundo = entradas[3];
				pontoDiario.saidaSegundo = entradas[4];
				pontos[j] = pontoDiario;
			}
			//calculando o saldo de horas sobre cada entrada
			Integer saldoHoras = 0;
			for (int j = 0; j < pontos.length; j++) {
				saldoHoras += pontos[j].calculaSaldoHoras();
				
			}
			
			respostas[i] = PontoDiario1.converteMinutoHora(saldoHoras);
			
			//System.out.println(PontoDiario.converteMinutoHora(saldoHoras));
		}
		
		for(String resposta: respostas){
			System.out.println(resposta);
		}
	}
}
