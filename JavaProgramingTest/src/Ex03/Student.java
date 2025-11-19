package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	
	private static LinkedList<Student> studentList = new LinkedList<>();
	
	int no;
	String name;
	int score;
	String className;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student(int no, String name, int score, String className) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	@Override
	public String toString() {
		return no + " " + name + " " + score + " " + className;
	}

	public static LinkedList<Student> getStudentList() {
		return studentList;
	}

	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		try {
		File file = new File("C:\\JSJ_15\\Programing\\Github\\JSJ15_Java\\JavaProgramingTest\\src\\Ex03\\student.txt");
		Scanner sc = new Scanner(file);
		Student std;
		while(sc.hasNextLine()) {
		String stn = sc.nextLine();
		String[] data = stn.split("/");
		int no = Integer.parseInt( data[0] );
		String name = data[1];
		int score = Integer.parseInt( data[2] );
		String className = data[3];
		std = new Student(no, name, score, className);
		list.offer(std);
		}
		sc.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		return list;
		}
}