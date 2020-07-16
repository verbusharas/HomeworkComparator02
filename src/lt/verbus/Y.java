package lt.verbus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Y {
    private List<X> listOfX;

    public Y() {
        listOfX = new ArrayList<>();
    }

    public void addToList(X x) {
        listOfX.add(x);
    }

    public void sort(Order order){
        switch (order) {
            case ASCENDING: Collections.sort(listOfX,Collections.reverseOrder()); break;
            case DESCENDING: Collections.sort(listOfX); break;
        }
    }

    @Override
    public String toString() {
        String stringToPrint = "";
        for (X x : listOfX) {
            stringToPrint += x + "\n";
        }
        return stringToPrint;
    }
}
