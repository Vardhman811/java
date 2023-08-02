package p1;

import java.util.function.IntPredicate;

interface lamda{
	int x=9;
	abstract public void demo(int a,int b);
}

interface lam2{
	int x=9;
	abstract public int demo();
}

public class LAMDA2 {
	public static void main(String[] args) {
		int x=10;
		lamda lm=  (int a,int b)->System.out.println("hello " +x+a+b);
		lm.demo(9,0);
		
		lam2 l2= ()->99+106*881;
		System.out.println(l2.demo());
		
		IntPredicate lt18 = (i)->i<18;
		IntPredicate lt10 = (i)->i<10;
		System.out.println(lt18.and(lt10).test(12));
		new LAMDA2().dem();
	}
	public void dem(){
		System.out.println("hei");
	}
}
