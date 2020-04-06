import java.util.*;
import java.io.*;
public class fence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_frnd = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String input[] = str.split(" ");
        int a[] = new int[num_frnd];
        for(int i = 0 ;i<num_frnd;i++){
            a[i] = Integer.parseInt(input[i]);
        }
      int res=solution(a, num_frnd, height);
      System.out.println(res);
     
    }
    public static int solution(int a[],int num_frnd,int height){
        int count =0;
        for(int i =0;i<a.length;i++){
            if(a[i]<height){
                count=count+1;
            }
            else if(a[i]>height){
               count+=2;
        }
    }
    return count;
}
}