import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			int a= entrada.nextInt();
			
			Extrator E = new Extrator("https://www.urionlinejudge.com.br/judge/pt/profile/"+a);
			System.out.println(E);
			    }
			
