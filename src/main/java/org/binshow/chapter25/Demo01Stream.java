package org.binshow.chapter25;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 *
 * Stream 流的演示
 */
public class Demo01Stream {

    public static void main(String[] args) {



        //test01();

        test02();

    }

    /**
     * lambda 表达式简化流式写法
     */
    private static void test01() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张大彪");
        list.add("吕不韦");
        list.add("张三");
        list.add("赵姬");
        list.add("张翠山");
        list.add("嫪毐");


        // 1. 将list转换成 stream 对象
        Stream<String> stream = list.stream();

        // 2. 进行流式筛选
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张"); // 筛选出姓张的
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3; // 筛选出名字是3个字的
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s); //打印出s
            }
        });

        System.out.println("========================");


        /**
         *  用 lambda 表达式简化写法
         */
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);


    }


    /**
     * 获取流
     */
    private static void test02() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // 集合可以直接获取流
        System.out.println(list.stream());

        // 数组可以用 Stream.of
        Stream<String> s1 = Stream.of("金莲", "三上", "松下","柳岩","张无忌");

        // 获取流的个数
        System.out.println(list.stream().count());


        // 流变成list
        List<String> collect = s1.collect(Collectors.toList());
        System.out.println(collect);
    }




}


