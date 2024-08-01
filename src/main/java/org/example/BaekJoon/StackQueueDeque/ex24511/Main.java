package org.example.BaekJoon.StackQueueDeque.ex24511;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer a = new StringTokenizer(br.readLine());
        StringTokenizer b = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] C = new int[M];
        StringTokenizer c = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ;i++){
            A[i] = Integer.parseInt(a.nextToken());
            B[i] = Integer.parseInt(b.nextToken());
        }
        for(int i=0 ; i<M ; i++){
            C[i]=Integer.parseInt(c.nextToken());
        }
        for(Integer i : queueStack(M,N,A,B,C)){
            sb.append(i).append(" ");
        }
        br.close();
        System.out.println(sb);
    }
    public static int[] queueStack(int M, int N, int[] A, int[] B, int[] C){
        int[] result = new int[M];
        Deque<Integer> Dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                Dq.addLast(B[i]);
            }
        }
        for (int i = 0; i < M; i++) {
            if(Dq.isEmpty()){
                result[i] = C[i];
            } else{
                result[i] = Dq.pollLast();
                Dq.addFirst(C[i]);
            }
        }
        return result;
    }
}