package Ex03;

public class Manager {

	public static void main(String[] args) {
		Student.getTxtToList(Student.getStudentList());
		
		for (Student student : Student.getStudentList()) {
			System.out.println(student);
		}
	}

}
