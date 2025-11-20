package java_mission.Index14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	int num;
	String name;
	int score;
	String group;
	
	public Student(int num, String name, int score, String group) {
		this.num = num;
		this.name = name;
		this.score = score;
		this.group = group;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return num + "\t" + name + "\t" + score + "\t" + group;
	}
	
}

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Student> studentList = new ArrayList<>();
		Student student;
		String text;
		String arr[];
		
		int num, score;
		String name, group;
		
		String filePath = "D:\\Programing\\Github\\JSJ15_Java\\team_project\\src\\java_mission\\Index14\\student.txt";
		
		try (
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		)
		{
			System.out.println("번호\t이름\t성적\t반");
			
			while( ( text = br.readLine() ) != null ) {

				arr = text.split("/");
				
				num = Integer.valueOf(arr[0]);
				name = arr[1];
				score = Integer.valueOf(arr[2]) ;
				group = arr[3] ;
				
				student = new Student(num, name, score, group);
				
				studentList.add(student);
					
			}
			
			// 성적순으로 내림차순
			studentList.stream()
			   		   .sorted( Comparator.comparing( Student::getScore ).reversed()
			   				   			  .thenComparing( Student::getNum))
			   		   .forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
