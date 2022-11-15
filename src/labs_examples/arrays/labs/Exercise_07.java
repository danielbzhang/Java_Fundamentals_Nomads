package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(5);
        myArr.add(11);
        myArr.add(46);

        int size = myArr.size();
        int index = myArr.indexOf(11);
        int num = myArr.get(0);
        myArr.set(0, 15);
        myArr.remove(0);
        System.out.println(myArr);
    }
}
