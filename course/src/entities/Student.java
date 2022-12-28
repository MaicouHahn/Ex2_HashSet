package entities;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private Integer code;

	public Student(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	}

	@Override
	public String toString() {
		return  ""+code ;
	}

	@Override
	public int compareTo(Student others) {
		return code.compareTo(others.getCode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(code, other.code);
	}
	
	
}
