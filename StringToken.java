import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		
		int count = 0;
		StringBuffer str = new StringBuffer();
		
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
		for(int i=0; i<s.length(); i++){
		
			char ch = s.charAt(i);
			
			if(ch == ',' && ch == ' '){
		
				count++;
				System.out.println();
				
			}
			else if(ch == ' ' || ch == ','|| ch == '\'' || ch == '?')
			{
				
				count++;	 
				System.out.println();
			
			}
			else{
			
				str.append(ch); 
				System.out.print(str);
				
			}
		
			
		}
		System.out.println(count);
		
    }

}