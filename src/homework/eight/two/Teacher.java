package homework.eight.two;

public class Teacher extends Person{
 private String lessonName;

public String getLessonName() {
	return lessonName;
}

public void setLessonName(String lessonName) {
	this.lessonName = lessonName;
}

@Override
public String toString() {
	return "Teacher [lessonName=" + lessonName + ", getName()=" + getName() + ", getSurname()=" + getSurname()
			+ ", getAge()=" + getAge() + "]";
}
 

 
}
