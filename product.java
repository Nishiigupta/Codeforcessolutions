import java.util.*;
import java.io.*;
public class product {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String input[] = str.split(" ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = Integer.parseInt(input[i]);
        }
        int b[]=solution(a);
        for(int i =0;i<b.length;i++)
        System.out.print(b[i]+" ");

    }
    public static int[] solution(int a[]){
        int b[] = new int[a.length];
        int pro = 1;
        for(int i =0;i<a.length; i++){
             pro = pro*a[i];
        }
        for(int i =0;i<a.length; i++){
           a[i] = pro/a[i];
       }
       return a;
    }
}