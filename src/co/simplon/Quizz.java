package co.simplon;

public class Quizz {
	String question;
	String answer;
	int points;

	public Quizz(String question, String answer, int points) {
		this.question = question;
		this.answer = answer;
		this.points = points;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Quizz [question=" + question + ", answer=" + answer + ", points=" + points + "]";
	}
}
