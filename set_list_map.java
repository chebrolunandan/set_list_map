import java.util.*;

public class CollectionExample 
{
    public static void main(String[] args) 
	{
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple ");
        stringSet.add("Banana ");
        stringSet.add("Orange ");
        stringSet.add("Pear ");

        System.out.println("Set of Strings:");
        for (String fruit : stringSet) 
	{
            System.out.println(fruit);
        }
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        System.out.println("\nList of Integers:");
        for (int number : integerList) 
	{
            System.out.println(number);
        }
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
        stringIntegerMap.put("Three", 3);
        stringIntegerMap.put("Four", 4);

        System.out.println("\nMap of String keys and Integer values:");
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) 
	{
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
