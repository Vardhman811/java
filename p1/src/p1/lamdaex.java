package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Lamdaa{
	public void demo();
}

class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
}

public class lamdaex {

	public static void main(String[] args) {
		
		Lamdaa lam=()->{
			System.out.println("hello lamda");
			System.out.println("hello Java");
		};
		lam.demo();
		
		List<Data> list = new ArrayList<>();
		list.add(new Data("jj"));
		list.add(new Data("ee"));
		list.add(new Data("rr"));
		list.add(new Data("yy"));
		list.add(new Data("hh"));
		
//		
		
		//Collections.sort(list,(Data o1,Data o2)-> o1.getName().compareTo(o2.getName()));
		Collections.sort(list,(Data o1,Data o2)-> 
		{
		return o1.getName().compareTo(o2.getName());
				}
		);
		
		for(Data data:list) {
			System.out.println(data);
		}
	}

}
