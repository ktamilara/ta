import java.util.*;
public class CountWord {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=0;
        int count=1;
     
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
