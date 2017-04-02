package aaaa;

public class GetField {
public static void main(String[] args) {
	Foo foo = new Foo();
boom(55);
	System.out.println(foo.att);
	System.out.println(foo.att);

}
public static int boom(int i){
	return   (i> 5  ?boom(i):i);
}
}

class Foo {
	int att = 5;
	
}