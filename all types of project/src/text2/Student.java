package text2;

public class Student {
String name;
int age;
 static int classes;
 double score;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static int getClasses() {
	return classes;
}
public static void setClasses(int classes) {
	Student.classes = classes;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
 public void speak(){
	 System.out.println("ËµÖÐÎÄ");
 }
 public Student(){
	 System.out.println("hillo");
 }
 public Student(String name,int age,int classes,
		 double score){
	 this.name=name;
	 this.age=age;
	 this.classes=classes;
	 this.score=score;

 }
 public static void main(String[] args) {
	Student student=new Student("Jake",18,1902,100);
	System.out.println(student.getName());
	System.out.println(student.getAge());
	System.out.println(student.getClasses());
	System.out.println(student.getScore());
	student.speak();
	
	
	
	
 }

}
