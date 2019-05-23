package com.wyr.test;

import java.util.HashMap;
import java.util.Map;

public class JavaTest {
    public static void main(String args[]){
        Map map=new HashMap();
        map.put(1,10);
        map.put(2,20);
        map.put(3,130);
      for(int i=1;i<=map.size();i++){
          System.out.println(map.get(i));
      }
        
    }
}
