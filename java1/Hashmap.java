import java.util.*;
public class Hashmap{
    public static void main(String[] args) {
        Map<Integer,String> m=new LinkedHashMap<>();

        //adding of items
        m.put(501,"ajay");
        m.put(502,"yaswanth");
        m.put(503,"trieveni");
        m.put(504,"devi");
        m.put(512,"venkat");

        System.out.println(m);

        //retraival of items by key
Set<Integer> key=m.keySet();

for (Integer integer : key) {
    System.out.println(integer);


}



//retraival values
Collection<String>  cc=m.values();
for (String string : cc) {
    System.out.println(string);

}
//retraival values from key bot can print
for(Integer keys:key){
    System.out.println(keys+">>>>>>>"+m.get(keys));

}

//delete items

m.remove(503);

//verification

System.out.println(m.containsKey(501));

System.out.println(m.containsValue(512));



}

    }
