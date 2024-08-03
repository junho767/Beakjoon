package org.example.BaekJoon.Advanced2.ex20920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0 ; i<N ; i++){
            String input = br.readLine();
            if(input.length() >= M){
                if(map.containsKey(input)){
                    map.put(input, map.get(input)+1);
                } else {
                    map.put(input, 1);
                }
            }
        }
        List<Map.Entry<String,Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int cmp = o2.getValue().compareTo(o1.getValue());
                if(cmp == 0){
                    int lengthCmp = Integer.compare(o2.getKey().length(), o1.getKey().length());
                    return lengthCmp == 0 ? o1.getKey().compareTo(o2.getKey()) : lengthCmp;
                }
                return cmp;
            }
        });
        for(Map.Entry<String, Integer> entry : entryList){
            sb.append(entry.getKey()).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
