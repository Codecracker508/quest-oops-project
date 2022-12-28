package classes;

public class Student {

	private String name;
	private int rollNo;
	private int marks[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getTotalMarks() {

		int sum = 0;

		for (int mark : this.marks)
			sum += mark;
		
		return sum;

	}

}
