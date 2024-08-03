package org.example.BaekJoon.Advanced2.ex26069;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws Exception{
      StringBuffer sb = new StringBuffer();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int count = 0;
      int index = 0;
      Map<String,Boolean> map = new HashMap<>();
      for(int i=0 ; i<N ; i++){
         StringTokenizer st = new StringTokenizer(br.readLine());
         String str1 = st.nextToken();
         String str2 = st.nextToken();
         sb.append("str1: ").append(str1).append("\n");
         sb.append("str2: ").append(str2).append("\n");
         if(str1.equals("ChongChong") || str2.equals("ChongChong")){
            index = N-(i+1);
            count+=2;
            map.put(str1,true);
            map.put(str2,true);
            break;
         }
      }
      for(int i=0 ; i<index ;i++){
         StringTokenizer st = new StringTokenizer(br.readLine());
         String str1 = st.nextToken();
         String str2 = st.nextToken();
         if(!map.containsKey(str1)){
            map.put(str1,true);
            count++;
         }
         if(!map.containsKey(str2)){
            map.put(str2,true);
            count++;
         }
      }
      sb.append(count);
      br.close();
      System.out.println(sb);
   }
}
// retry