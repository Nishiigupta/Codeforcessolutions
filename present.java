import java.io.*;
import java.util.*;
public class present  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String inp[] = input.split(" ");
        int gifts[] = new int[n+1];
        for(int i = 1; i<=n;i++) {
            gifts[i] = Integer.parseInt(inp[i-1]);
        }
        check(gifts,n);
    }
    public static void check(int gifts[],int n){
        int b[] = new int[gifts.length];
		for(int i=1;i<=n;i++)
		{
            b[gifts[i]]=i;   
		}
		for(int i=1;i<b.length;i++)
			System.out.print(b[i]+" ");
    }
}