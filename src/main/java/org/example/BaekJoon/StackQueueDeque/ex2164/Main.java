package org.example.BaekJoon.StackQueueDeque.ex2164;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N ; i++){
            queue.addLast(i);
        }
        sb.append(card(queue,N)).append("\n");
        br.close();
        System.out.println(sb);
    }
    public static int card(Deque<Integer> queue, int N){
        while(queue.size() != 1){
            queue.removeFirst();
            int nexNum = queue.removeFirst();
            queue.addLast(nexNum);
        }
        return queue.peek();
    }
}