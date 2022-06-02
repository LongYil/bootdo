package com.bootdo.testDemo;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liyinlong
 * @since 2022/5/17 9:10 上午
 */
public class Demo1 {

    public static void main(String[] args) throws Exception {
        List<HcUser> users = new ArrayList<>();
        users.add(new HcUser(null, "ff"));
        users.add(new HcUser( 11, "a"));
        users.add(new HcUser( 3,"b"));
        users.add(new HcUser(null, "c"));
        users.add(new HcUser(9, "3"));

        List<HcUser> res = users.stream().sorted(
                Comparator.comparing(HcUser::getAge, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());

        Map<Integer, String> map1 = users.stream().collect(Collectors.toMap(HcUser::getAge, HcUser::getUsername));
        Map<String, HcUser> map2 = users.stream().collect(Collectors.toMap(HcUser::getUsername, HcUser -> HcUser));
        Map<String, HcUser> map3 = users.stream().collect(Collectors.toMap(HcUser::getUsername, Function.identity()));
        Map<Integer, List<HcUser>> map4 = users.stream().collect(Collectors.groupingBy(HcUser::getAge));


    }

    @Test
    public void test2(){
        Map<String,Integer>  map = new HashMap<>();
        map.put("li", 12);

        List<HcUser> userList = map.entrySet().stream().map(e -> new HcUser(e.getValue(), e.getKey())).collect(Collectors.toList());
        List<Map.Entry<String, Integer>> entryList = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.nullsLast(Comparator.naturalOrder()))).collect(Collectors.toList());


    }

    @Test
    public void testListSort() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(null, "水浒传"));
        bookList.add(new Book(9, "钢铁怎样炼成的"));
        bookList.add(new Book(null, "百年孤独"));
        bookList.add(new Book(3, "三国演义"));
        bookList.add(new Book(18, "史记"));
        System.out.println("bookList = " + bookList);

    /*
      整理升序，price为null的排在最后
     */
        List<Book> bookList1 = bookList.stream().sorted(
                Comparator.comparing(Book::getPrice, Comparator.nullsLast(Comparator.naturalOrder()))).collect(Collectors.toList());
        System.out.println("整理升序，price为null的排在最后:");
        System.out.println("bookList1 = " + bookList1);

    /*
      整体升序，price为null的排在最前
     */
        List<Book> bookList2 = bookList.stream().sorted(
                Comparator.comparing(Book::getPrice, Comparator.nullsFirst(Comparator.naturalOrder()))).collect(Collectors.toList());
        System.out.println("整体升序，price为null的排在最前:");
        System.out.println("bookList2 = " + bookList2);

    /*
      整体降序，price为null的排在最后
     */
        List<Book> bookList3 = bookList.stream().sorted(
                Comparator.comparing(Book::getPrice, Comparator.nullsLast(Comparator.reverseOrder()))).collect(Collectors.toList());
        System.out.println("整体降序，price为null的排在最后:");
        System.out.println("bookList3 = " + bookList3);

    /*
      整体降序，price为null的排在最前
     */
        List<Book> bookList4 = bookList.stream().sorted(
                Comparator.comparing(Book::getPrice, Comparator.nullsFirst(Comparator.reverseOrder()))).collect(Collectors.toList());
        System.out.println("整体降序，price为null的排在最前");
        System.out.println("bookList4 = " + bookList4);
    }

}
