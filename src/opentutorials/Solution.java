package opentutorials;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = (int)(Math.log10(n)+1);
        for(int i = 0; i < length; i++){
        	answer += n%10;
        	n/=10;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
		
    	Solution sol = new Solution();
    	sol.solution(123);
	}
}