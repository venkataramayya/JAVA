public class Str {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
System.out.println(s1==s2);
String s3=s1.intern();
String s4=s2.intern();
System.out.println(s3==s4);
    }
    
}
