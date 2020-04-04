import java.io.*;
public class elephantnew {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
            if(n>=5){
                count+=n/5;
                n = n%5;
            }
            if(n>=4){
                count += n/4;
                n = n%4;
            }
            if(n>=3){
                count+=n/3;
                n = n%3;
            }
            if(n>=2){
                count+=n/2;
                n = n%2;
            }
            if(n>=1){
                count++;
            }
            System.out.println(count);
            
        }
     
        
    }
