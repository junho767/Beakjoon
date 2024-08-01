package org.example.BaekJoon.StackQueueDeque.ex2346;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        int index=0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            queue.addLast(i+1);
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sb.append(queue.removeFirst()).append(" ");
        while(!queue.isEmpty()){
            if(arr[index] > 0){
                for(int i=0; i<arr[index]-1 ; i++){
                    queue.addLast(queue.removeFirst());
                }
            } else {
                for(int i=0 ; i<-arr[index] ; i++){
                    queue.addFirst(queue.removeLast());
                }
            }
            index = queue.peekFirst()-1;
            sb.append(queue.removeFirst()).append(" ");
        }
        br.close();
        System.out.println(sb);
    }
}