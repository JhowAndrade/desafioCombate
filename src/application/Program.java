package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite os dados do primeiro campeão: ");
	    System.out.print("Nome: ");
	    String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion championA = new Champion(name, life, attack, armor);
		
		System.out.println();
		
		System.out.println("Digite os dados do primeiro campeão: ");
	    System.out.print("Nome: ");
	    name = sc.next();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion championB = new Champion(name, life, attack, armor);
		
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		
		System.out.println();
		
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Resultado do turno " + i + ":");
			
			championA.takeDamage(championB);
			championB.takeDamage(championA);
			System.out.println(championA.status());
			System.out.println(championB.status());
			System.out.println();

			if (championA.getLife() == 0 || championB.getLife() == 0) {

				break;
			}
		}
		
		System.out.println("FIM DE COMBATE");
		
		sc.close();
		

	}

}
