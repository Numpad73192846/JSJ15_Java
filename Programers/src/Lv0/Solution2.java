package Lv0;

public class Solution2 {
	public String solution(String my_string) {
		String answer = "";
		int size = my_string.length();
		for (int i = size - 1; i >= 0 ; i--) {
			char ch = my_string.charAt(i);
			answer += ch;
		}
		return answer;
	}
}
