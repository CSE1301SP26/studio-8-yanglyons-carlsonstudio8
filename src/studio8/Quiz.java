package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	
	/**
	 * Constructor
	 * @param questions
	 */
	private Question[] questions;
	public Quiz(Question[] questions) {
		this.questions = questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		return questions.length;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		int totalScore = 0;
		for(int i = 0; i<questions.length; i++){
			Question q = questions[i];
			q.displayPrompt();
			String answer = getUserAnswer(in);
			int points = q.checkAnswer(answer);
			System.out.println("You earned" + points + "points");
			totalScore += points;
		}
	}
	
	
	public static void main(String[] args) {
		MultipleChoiceQuestion("prompt2", "answer2", 15 , ("a","b","c"));
		SelectAllQuestion("prompt3", "answer4", ("a", "b", "c"));
		

	}
}
