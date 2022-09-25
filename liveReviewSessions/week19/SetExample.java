package week19;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {


        String str = "uuuuuoooeeeeJJJJJJJJaaallll";
        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        Set<String> setHash = new HashSet<>();
        setHash.addAll(list);
        System.out.println("list = " + list);
        System.out.println("setHash = " + setHash);
        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.addAll(list);
        System.out.println("setLinked = " + setLinked);
        Set<String> setTree =new TreeSet<>();
        setTree.addAll(list);
        System.out.println("setTree = " + setTree);

        List<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList("abc","cbd","java","js","typescript","html","abc","java",null,null,null));
        Set<String> set = new HashSet<>();
        set.addAll(strList);
        set.remove(null);
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.addAll(set);
        System.out.println("sortedSet = " + sortedSet);


    }
}
