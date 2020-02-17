package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {
public static <E> void main(String[] args) {
	int a[] = new int[3];  //static array ---siz is fixed
	
	
	//dynamic array --- ArrayList
	//1. can create duplicate values and elements
	//2. Maintains insertion order
	//3. Synchronized
	//4. allows random access o fetch the elements because it stores the values on the basis of ndex
	
	
	ArrayList ar = new ArrayList();
	ar.add(11);
	ar.add(22);
	ar.add(33);
	
	System.out.println(ar.size());
	
	ar.add(44);
	ar.add(55);
	ar.add(66);
	ar.add("Test");
	ar.add(a);
	ar.add(12.34);
	System.out.println(ar.size());//size of the array
	
	System.out.println(ar.get(4));//to get the value from the index
	
	//to print all the values from arraylist
	//1.for loop
	//2.using iterator
	
	for(int i=0;i<ar.size();i++){
		System.out.println(i);
	}
	 // non generic vs generic
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(99);
	//ar1.add("Sandy");
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("test");
	ar2.add("Selenium");
	
	ArrayList<E> ar3 = new ArrayList<E>();
	
	//Employee class object
	Employee e1 =new Employee("Sandy",27,"QA");
	Employee e2 =new Employee("Tarun",28,"Dev");
	Employee e3 =new Employee("Teja",29,"Admin");
	
	//create arraylist
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	//iterator to traversthe value
	Iterator <Employee> it =ar4.iterator();
	while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
}
}
