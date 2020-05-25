package com.umx.eureka_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;

@SpringBootTest
class EurekaServerApplicationTests {

    @Test
    void contextLoads() {
    }


    public static void main(String[] args) {
//        List list1 = new ArrayList();
//        list1.add("加油站");
//        list1.add("城中加油站");
//        List list2 = new ArrayList();
//        Map<String, Integer> strMap = new HashMap<>();
//        strMap.put("2019-11-1", 22);
//        strMap.put("2019-6-1", 20);
//        strMap.put("2019-7-1", 25);
//        strMap.put("2019-8-1", 30);
//        strMap.put("2019-9-1", 10);
//        strMap.put("2019-10-1", 12);
//        list2.add(strMap);
//        sortListStringDateMap(list2,"yyyy-mm-dd",true);
//
//
//        list1.add(list2);
//
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

    }

    /**
     * 对map中含有String类型的日期key值的list进行排序
     * <p>
     * 2017年9月29日 17:19:09
     * xj
     *
     * @param list   List<Map<String,Object>>,String为日期
     * @param format 日期格式
     * @param isDesc TRUE：从大到小  FALSE：从小到大
     */
    public static void sortListStringDateMap(List list, final String format, final boolean isDesc) {
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println("111");
                Map<String, Object> o1Map = (Map<String, Object>) o1;
                Map<String, Object> o2Map = (Map<String, Object>) o2;
                String o1Key = "";
                for (String key : o1Map.keySet()) {
                    o1Key = key;
                }
                String o2Key = "";
                for (String key : o2Map.keySet()) {
                    o2Key = key;
                }
                SimpleDateFormat format2 = new SimpleDateFormat(format);

                Integer o1K = Integer.valueOf(format2.format(o1Key));
                Integer o2K = Integer.valueOf(format2.format(o2Key));
                int flag = 1;
                if (isDesc) {
                    if (o2K - o1K < 0) {
                        flag = -1;
                    }
                } else {
                    if (o2K - o1K > 0) {
                        flag = -1;
                    }
                }
                return flag;
            }
        });
    }

}
