package hayes_19_Ex2;  //Exercise 2

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();  //Arraylist of objects

		list.add(new Rectangle(10.0, 5.0));
		list.add(new Circle(5.0));
		list.add(new String("This is my age: "));
		list.add(new Integer(50));
		ViewArrayList(list);
	}

	public static <E> void ViewArrayList(ArrayList<Object> list) {  //Void method process the list with loop
		for (Object e: list){

			System.out.println(e);
		}

	}
}
