import java.util.Scanner;

public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la misura della base: ");
		int base = sc.nextInt();
		System.out.print("Inserisci la misura dell'altezza: ");
		int altezza = sc.nextInt();
		Rettangolo rettangolo = new Rettangolo(base, altezza);

		int area = rettangolo.calcolaArea();
		System.out.println("L'area del rettangolo è: " + area);

	}
}