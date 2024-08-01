package org.example.BaekJoon.Combinatorics.ex10872;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int result=1;
        if(N!=0){
            for(int i=1; i<=N; i++){
                result *= i;
            }
            sb.append(result);
        }
        else{
            sb.append(result);
        }
        System.out.println(sb);
    }
}
