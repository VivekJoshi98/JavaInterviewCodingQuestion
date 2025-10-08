import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList {

	public static void main(String[] args) {

//        List<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        list.add(4);  // This will add 4 at the end of the List.
//        System.out.println(list);
//
//        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
//        newList.add(150);
//        newList.add(160);
//
//        list.addAll(newList); // This will add all the elements present in newList to list.
//        System.out.println(list);
//
//        System.out.println(list.get(1));
//        System.out.println(list.get(0));

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(70);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		System.out.println(list);

		List<Integer> listTemp = new ArrayList<Integer>();

		listTemp.add(30);
		listTemp.add(40);
		listTemp.add(50);

		System.out.println("list.containsAll(listTemp)) :: " + list.containsAll(listTemp));
		System.out.println("list.hashCode() : " + list.hashCode());
		System.out.println("list.size() : " + list.size());
		System.out.println("list.equals(listTemp) :: " + list.equals(listTemp));
		// The equals() method of List interface compares the specified object with this
		// collection for equality.
		// It returns a Boolean value true if both the lists have same elements and are
		// of the same size.

		System.out.println("list.indexOf(30) : " + list.indexOf(30));

		System.out.println("list.isEmpty() :: "+list.isEmpty());
		
		System.out.println("list.lastIndexOf(70) :: "+list.lastIndexOf(70));
		
		System.out.println("list.remove(0) + \" \" + list "+list.remove(0) + " " + list);
		
	//	System.out.println(list.retainAll(list));
		list.set(2,30);
		System.out.println("Update the element by using set function :: "+list);
		
		System.out.println("list.subList(2, 5) :: "+list.subList(2, 5));
		
		list.sort(Comparator.naturalOrder());//it will sort the element in acending order
		System.out.println("list.sort(Comparator.naturalOrder() " +list);
		list.sort(Comparator.reverseOrder());//it will sort the element in decending order
		System.out.println("list.sort(Comparator.reverseOrder() " +list);
		
		Collections.sort(list);
		System.out.println("Collections.sort(list) :: "+list);
		
		Object[] array = list.toArray();
		
		for(Object arr: array)
		{
			System.out.println("Object[] array = list.toArray() ::: "+ arr);//Returns array representation of the list
		}
		
       //   Traversing method		
///////////////////////////////////////////////////////////////////////////////////////////		
		
		for (int i = 0; i < list.size(); i++) {       //  forLoop   
			System.out.println("the element is " + list.get(i));
		}

		for (Integer element : list) {					// forEach
			System.out.println("foreach element is " + element);
		}
		
		
		 list.forEach(element ->System.out.println(element));// forEach Method using lambda expression.
		 
		 list.stream().forEach(element->System.out.println(element));//forEach using stream api
		
		Iterator<Integer> it = list.iterator();          // iterator()
		while (it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
		
		ListIterator<Integer> listIterator = list.listIterator();// ListIterator bidirectional 
		while (listIterator.hasNext()) {           // it work with only list
			Integer next = listIterator.next();
			System.out.println("listIterator :: "+next);
		}
		
		

		list.set(2, 1000);// it will update the second index
		list.add(3, 2000);

		System.out.println(list);

		System.out.println("list.contains(500) : " + list.contains(500));

		list.remove(1); // This will remove the element at index 1 i.e 20.
		System.out.println(list);

		list.remove(Integer.valueOf(30)); // This will remove 30 from the list
		System.out.println(list);
		list.clear(); // This will remove all the elements from the list.
		System.out.println(list);
		
//		List<Integer> ar=List.of(1,2,3,4,5);
//		System.out.println(ar);

	}
}
