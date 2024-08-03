package org.example.BaekJoon.Advanced2.ex2108;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        for(int i=0 ; i<N ;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        sb.append(first(numArr, N)).append("\n");
        Arrays.sort(numArr);
        sb.append(second(numArr, N)).append("\n");
//        sb.append(third(numArr, N)).append("\n");
        sb.append(four(numArr,N)).append("\n");

        br.close();
        System.out.println(sb);
    }
    public static int first(int[] arr,int N){
        int sum=0;
        for(Integer i : arr){ sum+=i; }
        return Math.round((float) sum /N);
    }
    public static int second(int[] arr,int N){
        return arr[(N-1)/2];
    }
//    public static int third(int[] arr,int N){
//    }
    public static int four(int[] arr,int N){
        return arr[N-1]-arr[0];
    }
}
