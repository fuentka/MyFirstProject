public class FooBarBaz {
  public static void main(String[] args) {
    for ( int count = 1; count <= 50; count++ ) 
	{
      if ( (count % 3) == 0 ) {
	System.out.println("foo");
      }
      if ( (count % 5) == 0 ) {
	System.out.println("bar");
      }
      if ( (count % 7) == 0 ) {
		System.out.println("baz");
      }
	  System.out.println(count);
    }
  }
}
