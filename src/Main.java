import java.util.Scanner;

public class Main {
	public static void main( String[] args ) {
		//istranzia un nuovo oggetto sc di tipo Scanner
		Scanner sc = new Scanner(System.in);

		//legge i valori di base e altezza in input
		System.out.print("Inserisci la misura della base: ");
		int base = sc.nextInt();
		System.out.print("Inserisci la misura dell'altezza: ");
		int altezza = sc.nextInt();

		//crea due nuovi oggetti dalle classi Rettangolo e Triangolo
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		Triangolo triangolo = new Triangolo(base, altezza);

		//Richiama la funzione calcolaArea e stampa il risultato per tutte e due le classi
		int areaRett = rettangolo.calcolaArea();
		System.out.println("L'area del rettangolo è: " + areaRett);
		int areaTri = triangolo.calcolaArea();
		System.out.println("L'area del rettangolo è: " + areaTri);
	}
}