package test;

public class ExceptionTest {

	public void go(){
		System.out.println("A");
	
	try {
		stop();
	}catch(ArithmeticException ad){
		System.out.println("B");
	}finally{
		System.out.println("C");
	}
	System.out.println("D");
	}
	public void stop(){
		System.out.println("E");
		Object x =null;
		x.toString();// here it is NPE 
		System.out.println("F");
	}
	public static void main(String[] args) {
		new ExceptionTest().go();
		
		
	}
	/*OUTPUT:
	 * A Exception in thread "main" 
       E
       C
       java.lang.NullPointerException
	           at test.ExceptionTest.stop(ExceptionTest.java:20)
	           at test.ExceptionTest.go(ExceptionTest.java:9)
	           at test.ExceptionTest.main(ExceptionTest.java:24)
	 * */

}
