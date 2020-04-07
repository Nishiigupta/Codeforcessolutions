import java.util.*;
public class holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for(int i =0;i<num;i++){
            a[i] = sc.nextInt();
        }
        int count =0,max =a[0];
        for(int i =0;i<num;i++){
            if(a[i]>=max)
            max = a[i];
        }
        for(int i =0;i<num;i++){
            if(a[i]<max)
            count += Math.abs(a[i]-max);
        }
        System.out.println(count);
    }
}