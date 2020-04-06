import java.io.*;
import java.util.*;
class solution{
	public static void main(String str[]) {
        
		System.out.println(solve(str[0]));
	}
	
	static String solve(String str) {
		int startIndex = 0, endIndex = 0;
		for(int i = 0; i < str.length(); i++) {
			int len1 = checkPalin(i, i, str);
			int len2 = checkPalin(i, i+1, str);
			int len = Math.max(len1, len2);
			
			if(len > endIndex - startIndex) {
				startIndex = i - (len-1)/2;
				endIndex = i + len/2;
}
		}
		return str.substring(startIndex, endIndex+1);
	}

	static int checkPalin(int pointer1, int pointer2, String str) {
		while(pointer1 >=0 && pointer2 < str.length() && str.charAt(pointer1) == str.charAt(pointer2)) {
		pointer1--;
		pointer2++;
		}
		return pointer2 - pointer1 -1;
	}
}

