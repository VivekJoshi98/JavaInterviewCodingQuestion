import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add(new Student("Anuj", 2));
//        studentSet.add(new Student("Ramesh", 4));
//        studentSet.add(new Student("Shivam", 3));
//
//        studentSet.add(new Student("Rohit", 2));
//
//        Student s1 = new Student("Anuj", 2);
//        Student s2 = new Student("Rohit", 2);
//
//        System.out.println(s1.equals(s2));
//        System.out.println(studentSet);
    	HashSet<Integer> set = new HashSet<>();
 //       LinkedHashSet<Integer> set = new LinkedHashSet<>();
 //       TreeSet<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);
        
        Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println("Iterator :: "+next);
		}

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }
}
