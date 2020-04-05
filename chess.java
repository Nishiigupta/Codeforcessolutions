import java.util.*;
import java.io.*;
public class chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count=0,sum=0;
        String str = br.readLine();
            for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='A')
            count++;
            else if(str.charAt(i)=='D')
            sum++;
        }
        if(count>sum)
        System.out.println("Anton");
        else if(count<sum)
        System.out.println("Danik");
        else
        System.out.println("Friendship");

    }
}