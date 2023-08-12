package tempoOperacao;

public class operacao {
	public static void main(String[] args) {
		System.out.println("Tempo de operacao com vetor de 1000 em nanosegundos-->"+vetor1000());
		System.out.println("Tempo de operacao com vetor de 10000 em nanosegundos-->"+vetor10000());
		System.out.println("Tempo de operacao com vetor de 100000 em nanosegundos-->"+vetor100000());
	}
	public static double vetor1000() {
		int i;
		int []num=new int[1000];
		double tempoInicial=System.nanoTime();		
		for(i=0;i<num.length;i++) {
			num[i]=0;
		}
		double tempoFinal=System.nanoTime();
		return (tempoFinal-tempoInicial);
		
	}
	
	public static double vetor10000() {
		int i;
		int []num=new int[10000];
		double tempoInicial=System.nanoTime();		
		for(i=0;i<num.length;i++) {
			num[i]=0;
		}
		double tempoFinal=System.nanoTime();
		return (tempoFinal-tempoInicial);
	}
	
	public static double vetor100000() {
		int i;
		int []num=new int[100000];
		double tempoInicial=System.nanoTime();		
		for(i=0;i<num.length;i++) {
			num[i]=0;
		}
		double tempoFinal=System.nanoTime();
		return (tempoFinal-tempoInicial);
	}
}
