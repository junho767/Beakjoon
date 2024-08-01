package org.example.BaekJoon.StackQueueDeque.ex28279;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++){
            String str = br.readLine();
            String[] str1 = str.split(" ");
            int first = Integer.parseInt(str1[0]);
            int second = str1.length >= 2 ? Integer.parseInt(str1[1]) : 0;
            if(second > 0){
                switch (first){
                    case 1:
                        queue.addFirst(second);
                        break;
                    case 2:
                        queue.addLast(second);
                        break;
                    default:
                        break;
                }
            }
            else{
                switch (first){
                    case 3:
                        if(!queue.isEmpty()) sb.append(queue.removeFirst()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    case 4:
                        if(!queue.isEmpty()) sb.append(queue.removeLast()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    case 5:
                        sb.append(queue.size()).append("\n");
                        break;
                    case 6:
                        if(!queue.isEmpty()) sb.append(0).append("\n");
                        else sb.append(1).append("\n");
                        break;
                    case 7:
                        if(!queue.isEmpty()) sb.append(queue.peekFirst()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    case 8:
                        if(!queue.isEmpty()) sb.append(queue.peekLast()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    default:
                        break;
                }
            }
        }
        br.close();
        System.out.println(sb);
    }
}