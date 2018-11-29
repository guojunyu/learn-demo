package niodemo.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkMapTest {
    public static void main(String[] agrs){

        Map<String,String> linkMap = new HashMap<String,String>();

        linkMap.put("1","a");
        linkMap.put("2","b");
        linkMap.get("2");
        linkMap.put("3","c");

        Iterator<Map.Entry<String,String>> iterator = linkMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        linkMap = new LinkedHashMap<String, String>(10, 0.75f, false);
        linkMap.put("1", "a");
        linkMap.put("2", "b");
        linkMap.put("3", "c");
        linkMap.put("4", "d");
        linkMap.get("2");//2移动到了内部的链表末尾
        linkMap.get("4");//4调整至末尾
        //linkMap.put("3", "e");//3调整至末尾
        linkMap.put(null, null);//插入两个新的节点 null
        linkMap.put("5", null);//5
        iterator = linkMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
