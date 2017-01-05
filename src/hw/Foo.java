package hw;

class Foo {
	public boolean eval(int y) {
		if(Math.random()*5<y) {
			int[] vals = new int[1];
			vals[y]=10;
			return false;
		}
		else
			return true;
	}
}