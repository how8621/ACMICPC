import java.util.Scanner;

public class Problem9012 {
	public static void main(String[] args) {
		int n, top = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		n = Integer.parseInt(s);
		String arr[] = new String[n];
		String result[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == '(') top++;
				else if(arr[i].charAt(j) == ')') top--;
				if(top < 0) break;
			}
			if(top == 0 && arr[i].charAt(arr[i].length()-1) != '(') result[i] = "YES";
			else result[i] = "NO";
			top = 0;
		}
		for(int i=0; i<n; i++) {
			System.out.println(result[i]);
		}
		
	}
}
