package co.simplon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("bonjour." + "\n" + "Ce programme comporte trois choix :" + "\n");
		int calcRetries = 0;
		boolean endOfProg = false;
		String answer = "";

		do {
			if (calcRetries > 0) {
				System.out.println("Voulez vous réessayer ?");
			}
			System.out.println("Voici les choix possibles :" + "\n" + "0) Sortir du programme." + "\n"
					+ "1) Un quizz de plusieur questions." + "\n"
					+ "2) Dessiner une ligne avec un caractère de votre choix.");

			answer = in.nextLine();

			switch (answer)

			{

			case "1":
				playingQuizz();
				break;

			case "2":

				break;

			case "0":
				System.out.println("Bonne journée");
				endOfProg = true;
				break;

			default:
				System.out.println("Donnez une réponse correcte");

			}

		} while (!endOfProg);

		in.close();

	}

	// Ecrire un mini quizz où le joueur doit répondre à 3 questions questions en
	// mode console. A chaque question le joueur peut gagner 1 point s'il répond
	// correctement. S'il répond faux, donner lui la bonne réponse pour qu'il ne se
	// trompe pas la prochaine fois !
	
	public static void playingQuizz() {
		int score = 0;
		Quizz question1 = new Quizz("Quelle est la couleur du ciel ?", "Bleu", 1);
		Quizz question2 = new Quizz("Quel est le prénom d'Einstein?", "Albert", 1);
		Quizz question3 = new Quizz("Quelle est la vitesse du son en m/s ?", "340", 1);

		List<Quizz> questions = new ArrayList<Quizz>();
		questions.add(question1);
		questions.add(question2);
		questions.add(question3);

		boolean correctAnswer1 = false;
		boolean correctAnswer2 = false;
		boolean correctAnswer3 = false;
		do {
		while (!correctAnswer1) {
			System.out.println("Voici la première question");
			System.out.println(question1.getQuestion());
			String answer1 = in.nextLine();
			if (answer1.equalsIgnoreCase(question1.getAnswer())) {
				score += question1.getPoints();
				correctAnswer1 = true;
				System.out.println("Bravo, vous marquez 1 point");
				System.out.println("Votre score est de " + score);
			} else {
				System.out.println("Mauvaise réponse. Il fallait répondre : " + question1.getAnswer());
				System.out.println("Vous pourrez retenter votre chance à la fin du quizz.");
			}
		
		while (!correctAnswer2) {
			System.out.println("Voici la deuxième question");
			System.out.println(question2.getQuestion());
			String answer2 = in.nextLine();
			if (answer2.equalsIgnoreCase(question2.getAnswer())) {
				score += question2.getPoints();
				correctAnswer2 = true;
				System.out.println("Bravo, vous marquez 1 point");
				System.out.println("Votre score est de " + score);
			} else {
				System.out.println("Mauvaise réponse. Il fallait répondre : " + question2.getAnswer());
				System.out.println("Vous pourrez retenter votre chance à la fin du quizz.");
			}
		
		while(!correctAnswer3) {
			System.out.println("Voici la troisième question");
			System.out.println(question3.getQuestion());
			String answer3 = in.nextLine();
			if (answer3.equalsIgnoreCase(question3.getAnswer())) {
				score += question3.getPoints();
				correctAnswer3 = true;
				System.out.println("Bravo, vous marquez 1 point");
				System.out.println("Votre score est de " + score); 
			}
			else {
				System.out.println("Mauvaise réponse. Il fallait répondre : " + question3.getAnswer());
				System.out.println("Vous pourrez retenter votre chance à la fin du quizz.");
			}
			}
		}
		}
		}
		while(score<3);

		System.out.println("vous avez gagné !");

	}



	// Ecrire un algorithme qui demande à l'utilisateur de rentrer un entier qui
	// définira la longueur d'une chaîne de caractères que vous construirez ensuite
	// à base de "#" et que vous afficherez ensuite dans la console. Exemple : si
	// l'utilisateur rentre '6' vous aurez en sortie "######".

}
