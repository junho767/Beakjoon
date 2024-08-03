package org.example.Recursion.ex10870;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=N;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        sb.append(arr[N]);
        br.close();
        System.out.println(sb);
    }

}
