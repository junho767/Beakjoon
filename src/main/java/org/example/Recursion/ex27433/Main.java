package org.example.Recursion.ex27433;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum=1;
        if(N==0){
            sb.append(1);
        }else{
            for(int i=1 ; i<=N ; i++){ sum *= i; }
            sb.append(sum);
        }
        br.close();
        System.out.println(sb);
    }

}