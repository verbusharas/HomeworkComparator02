package lt.verbus;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class X implements Comparable<X>{
    private List<Integer> listOfNumbers;

    public X() {
        listOfNumbers = Arrays.asList(new Random().nextInt(1000), new Random().nextInt(1000), new Random().nextInt(1000));
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public Integer getSum() {
        Integer sum = 0;
        for(Integer i : listOfNumbers) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int compareTo(X o) {
        return this.getSum()-o.getSum();
    }

    @Override
    public String toString() {
        String stringToPrint = "";
        for (Integer number : listOfNumbers) {
            stringToPrint += number + ", ";
        }
        stringToPrint += "sum = " + this.getSum();
        return stringToPrint;
    }
}
