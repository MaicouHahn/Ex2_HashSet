package application;

import java.util.HashSet;
import java.util.Set;

import entities.Student;

public class App {

	public static void main(String[] args) {
		
		Set<Student>courseA =new HashSet<>();
		Set<Student>courseB =new HashSet<>();
		Set<Student>courseC =new HashSet<>();
		
		Set<Student>StudentsQtde=new HashSet<>();
		
		courseA.add(new Student(21));
		courseA.add(new Student(35));
		courseA.add(new Student(22));
		
		courseB.add(new Student(21));
		courseB.add(new Student(50));
		
		courseC.add(new Student(42));
		courseC.add(new Student(35));
		courseC.add(new Student(13));
		
		StudentsQtde.addAll(courseA);
		StudentsQtde.addAll(courseB);
		StudentsQtde.addAll(courseC);
		
		System.out.println(StudentsQtde.size());
		
		
	}

}
