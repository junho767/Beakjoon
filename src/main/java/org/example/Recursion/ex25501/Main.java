package org.example.Recursion.ex25501;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int count;
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0 ; i<T ;i++){
            String str = br.readLine();
            count=0;
            sb.append(isPalindrome(str)).append(" ").append(count).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    public static int recursion(String str, int l ,int r){
        count++;
        if(l >= r) return 1;
        else if(str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l+1, r-1);
    }
    public static int isPalindrome(String str){
        return recursion(str, 0, str.length()-1);
    }
    public static int cnt(int count){
        return count++;
    }
}
