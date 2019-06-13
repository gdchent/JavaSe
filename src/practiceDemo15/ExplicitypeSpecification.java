package practiceDemo15;

import java.util.List;
import java.util.Map;

public class ExplicitypeSpecification {

    static void f(Map<Person, List<Pet>> petPeople){

    }

    public static void main(String ...args){
        f(New.<Person,List<Pet>>map());
    }
}
