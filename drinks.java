import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class drinks {
    public static void main(String argv[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String inp[] = str.split(" ");
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = Integer.parseInt(inp[i]);
        }   
        double sum=0.0;
        for(int i =0;i<n;i++){
            sum+=a[i];
        }
        sum= sum/n;
        System.out.format("%.12f",sum);
    }
}