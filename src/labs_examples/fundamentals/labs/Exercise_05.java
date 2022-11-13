package labs_examples.fundamentals.labs;


public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int len = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equals(str2);
        // please concatenate str & str2 and set the result to a new String variable below
        String newStr = str + str2;
        System.out.println(newStr);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String replaceResult = str.replace('o', 'a');
        System.out.println(replaceResult);

        String subStringResult = str2.substring(0,3);
        System.out.println(subStringResult);

        boolean containResult = str2.contains("a");
        System.out.println(containResult);

        int indexResult = str.indexOf("o");
        System.out.println(indexResult);

    }


}