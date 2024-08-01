package org.example.BaekJoon.StackQueueDeque.ex28278;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for(int i =0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch (num){
                case 1:
                    int add_num = Integer.parseInt(st.nextToken());
                    stack.push(add_num);
                    break;
                case 2:
                    if(stack.empty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.empty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case 5:
                    if(!stack.empty())
                        sb.append(stack.peek()).append("\n");
                    else
                        sb.append(-1).append("\n");
                    break;
                default:
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}