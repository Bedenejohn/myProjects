package earlyDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Idk {

	int age = 20;
	List ar = new ArrayList<>();
	static Queue<Integer>g = new LinkedList<>();
	public Idk(int age){
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public int compareTo(Idk j){
		return this.getAge() - j.getAge();
	}
}
////Hw for recursion
//#18.4 - 18.6
//
//#18.8 - 18.11