package java_mission.Index14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\JSJ_15\\Programing\\Github\\JSJ15_Java\\team_project\\src\\java_mission\\Index14\\student.txt";
		String arr[] = new String[4];
		
		try (
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		)
		{
			String text;
			while( ( text = br.readLine() ) != null ) {
				for (int i = 0; i < arr.length; i++) {
						arr[i] = text.split("/")[i];
						System.out.print(arr[i] + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
