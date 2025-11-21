package example_gpt.Index03;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            String s = Integer.toString(i);
            int count = 0;
            char c;

            // TODO: 문자열 속에서 '3','6','9'가 몇 개 포함되어 있는지 counting
            for (int j = 0; j < s.length(); j++) {
            	 c = s.charAt(j);
            	if( c == '3' || c == '6'|| c == '9' ){
            		count++;
            	}
            	
			}
            
            // TODO: count가 0이면 숫자 출력, 아니면 '*' count개 출력
			if(count == 0) {
				System.out.println(i);
			}
			else {
				for (int j = 0; j < count; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
        }

    }
}

