class A { void m (){ System. out. println ("outer" ) ;}}
public class TestInners {
public static void main (String [] arg) {
new TestInners(). go ();
}
void go (){
new A ().m ();
class A { void m (){ System. out.println ("inner" )}}
}
class A { void m (){ System. out.println (" middle " )}}
}