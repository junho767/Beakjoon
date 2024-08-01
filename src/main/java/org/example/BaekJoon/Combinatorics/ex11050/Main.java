package org.example.BaekJoon.Combinatorics.ex11050;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = factorial(N)/(factorial(N-M)*factorial(M));
        sb.append(result);
        br.close();
        System.out.println(sb);
    }
    public static int factorial(int num){
        int result=1;
        for(int i=1; i<=num; i++){
            result *= i;
        }
        return result;
    }
}
