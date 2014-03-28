public class AbcTest {
public static void main(String[] args) {
Integer i = 10;
Integer j = 11;
///Integer k = ++i; // INCR

Integer k = new Integer(11);

System.out.println("k == j is " + (k == j));
System.out.println("k.equals(j) is " + k.equals(j));
}
}