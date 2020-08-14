package com.yunxi.hash.demo.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-08-14 00:17
 * @Description: Alibaba初试题
 */
public class HashDemo {
    public static void main(String[] args) {

//        test1();

//        test2();

//        test3();

        test4();
    }

    /**
     * map测试4
     *
     * HashSet是可以去重的？
     */
    private static void test4() {
        Set<User> userHashSet = new HashSet<>(4);
        User user1 = new User("赵六", 24, "12345678901");
        User user2 = new User("赵六", 24, "12345678901");
        User user3 = new User("赵六", 24, "12345678901");

        userHashSet.add(user1);
        userHashSet.add(user2);
        userHashSet.add(user3);

        System.out.printf("userHashSet的大小等于=%s,内容=%s%n",
                userHashSet.size(), userHashSet);
    }

    /**
     * map测试3
     */
    private static void test3() {
        Map<User, Address> userAddressMap = new HashMap<>(4);
        User user1 = new User("赵六", 24, "12345678901");
        User user2 = new User("赵六", 24, "12345678901");
        User user3 = new User("赵六", 24, "12345678901");


        Address address1 = new Address("200000", "上海", "嘉兴路", "18");
        Address address2 = new Address("100000", "北京", "朝阳门", "19");
        Address address3 = new Address("510000", "广州", "滨江路", "20");

        userAddressMap.put(user1, address1);
        userAddressMap.put(user2, address2);
        userAddressMap.put(user3, address3);

        System.out.printf("userAddressMap的大小等于=%s,内容=%s%n",
                userAddressMap.size(), userAddressMap);
    }

    /**
     * map测试2
     */
    public static void test2() {
        Map<Integer, String> idMap = new HashMap<>(3);
        idMap.put(127, "中国电信");
        idMap.put(128, "中国联通");
        idMap.put(127, "中国移动");
        System.out.printf("idMap的大小等于=%s,内容=%s%n", idMap.size(), idMap);
    }

    /**
     * map测试1
     */
    private static void test1() {
        Map<Integer, String> idMap = new HashMap<>(3);
        idMap.put(1, "张三");
        idMap.put(2, "李四");
        idMap.put(1, "王五");
        System.out.printf("idMap的大小等于=%s,内容=%s%n", idMap.size(), idMap);
    }
}
