package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {

//    a) Udskriv alle tallene i dette set
//    b) Tilføj 23 til dette set.
//    c) Udskriv alle tallene igen
//    d) Fjern 67 fra dette set og udskriv.
//    e) Controller hvorvidt dette set indeholder 23
//    f) Udskriv antallet af elementer i dette set.


    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));
        System.out.println("Size = " + mySet.size());
        System.out.println(mySet);

        mySet.add(23);
        System.out.println();
        System.out.println(mySet);

        mySet.remove(67);
        System.out.println(mySet);
        System.out.println("Size = " + mySet.size());
    }
}
