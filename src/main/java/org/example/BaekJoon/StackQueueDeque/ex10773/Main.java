package org.example.BaekJoon.StackQueueDeque.ex10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<K ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0 && !stack.empty())
                stack.pop();
            else
                stack.push(num);
        }
        for(int i=0; i<stack.size();i++){
            sum += stack.get(i);
        }
        sb.append(sum).append("\n");
        br.close();
        System.out.println(sb);
    }
}