package eksamenTraining.prøveeksamen1;

import java.util.Comparator;

public class SortByLastName implements Comparator <HogwartsStudent> {

    public int compare(HogwartsStudent d1, HogwartsStudent d2){
        return d1.getLastName().compareTo(d2.getLastName());
    }


}
