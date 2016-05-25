// Creating an inner class directly using the .new syntax.

package innerclasses;

public class DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dotNew = new DotNew();
		DotNew.Inner inner = dotNew.new Inner();
		System.out.println(inner.toString());

	}
}
