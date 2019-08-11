package GoogleKickstart;
import java.io.*;
import java.util.*;

public class PracticeRoundMural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(br.readLine().trim());
			
			for (int i = 1; i <= T; i++) {
				int length = Integer.parseInt(br.readLine().trim());
				String str = br.readLine().trim();
				int maxSum=0;
				//Do something
				maxSum = calMaxSum(str,length);
				System.out.println("Case #"+i+": "+maxSum);
			}
		}
		catch(Exception e){
			
		}
	
	}
	
	public static int calMaxSum(String str , int length){
		int maxSum = 0;
		int[] digitArr = new int[length];
		
		for (int i = 0; i < digitArr.length; i++) {
			digitArr[i] = str.charAt(i) - '0';
		}
		
		int d = length - length/2;
		
		int[] dp = new int[length];
        int max = 0;

        for (int i = 0; i < d; i++){
        	dp[0] += digitArr[i];
        }
        for (int i = 1; i + d - 1 < length; i++){
        	dp[i] = dp[i-1] - digitArr[i-1] + digitArr[i+d-1];
        }
        for (int i = 0; i < length; i++){
        	max = Math.max(max, dp[i]);
        }
		return max;
	}

}
//Input
//
//4
//4
//1332
//4
//9583
//3
//616
//10
//1029384756
