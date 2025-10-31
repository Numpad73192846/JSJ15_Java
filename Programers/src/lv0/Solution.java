package lv0;

import java.util.Stack;

public class Solution {
	public String solution(String my_string) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>(); // Stack Character 타입 stack
		char[] chList = my_string.toCharArray();		 // char인 배열 chList를 생성 
		for (char ch : chList) {
			stack.push(ch);
		}
		while ( !stack.isEmpty() ) {
			answer += stack.pop();
		}
		return answer;
	}
}
