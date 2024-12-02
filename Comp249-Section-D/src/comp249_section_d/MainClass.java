package comp249_section_d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) { // Static context

        ArrayList<A> myList = new ArrayList<>();

        myList.add(new A());
        myList.add(new A());
        myList.add(new A());

        Collections.sort(myList, new ComparatorBasedOnNumber1());

        // Use the list
        Collections.sort(myList, new ComparatorBasedOnNumber2());

    }

}

class A {

    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

}

class ComparatorBasedOnNumber1 implements Comparator<A> {

    public int compare(A a1, A a2) {
        if (a1.getNumber1() < a2.getNumber1()) {
            return -1;
        } else if (a1.getNumber1() == a2.getNumber1()) {
            return 0;
        } else {
            return 1;
        }
    }

}

class ComparatorBasedOnNumber2 implements Comparator<A> {

    public int compare(A a1, A a2) {
        if (a1.getNumber2() < a2.getNumber2()) {
            return -1;
        } else if (a1.getNumber2() == a2.getNumber2()) {
            return 0;
        } else {
            return 1;
        }
    }

}

class ComparatorBasedOnNumberDescending implements Comparator<A> {

    public int compare(A a2, A a1) {
        if (a1.getNumber3() < a2.getNumber3()) {
            return -1;
        } else if (a1.getNumber2() == a2.getNumber2()) {
            return 0;
        } else {
            return 1;
        }
    }

}
