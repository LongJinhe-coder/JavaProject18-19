package text2;

public class Score {
double chinese;
double math;
double english;
public double getChinese() {
	return chinese;
}
public void setChinese(double chinese) {
	this.chinese = chinese;
}
public double getMath() {
	return math;
}
public void setMath(double math) {
	this.math = math;
}
public double getEnglish() {
	return english;
}
public void setEnglish(double english) {
	this.english = english;
}
public static void main(String[] args) {
	Score score=new Score();
	score.setChinese(90);
	score.setMath(90);
	score.setEnglish(90);
	System.out.println(score.getChinese());
	System.out.println(score.getMath());
	System.out.println(score.getEnglish());
}
}
