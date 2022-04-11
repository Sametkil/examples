package homework.eight.two;

public class Student extends Person{
	private int midTermGrade1;
	private int midTermGrade2;
	private int finalGrade;
	public int getMidTermGrade1() {
		return midTermGrade1;
	}
	public void setMidTermGrade1(int midTermGrade1) {
		this.midTermGrade1 = midTermGrade1;
	}
	public int getMidTermGrade2() {
		return midTermGrade2;
	}
	public void setMidTermGrade2(int midTermGrade2) {
		this.midTermGrade2 = midTermGrade2;
	}
	public int getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}
	@Override
	public String toString() {
		return "Student [midTermGrade1=" + midTermGrade1 + ", midTermGrade2=" + midTermGrade2 + ", finalGrade="
				+ finalGrade + ", name=" + getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge()
				+ "]";
	}
	
	
}
