package usrArray;

public class Main {
    public static void main(String[] args) {
        //TODO test with mosh's sollution
        ulsinArray uArr = new ulsinArray(3);
        uArr.insert(3);
        uArr.insert(5);
        uArr.insert(0);
        uArr.insert(7);

        System.out.println("Printing the array after inserting 3 5 0 7");
        uArr.print();

        System.out.println("Index of 7, then 3");
        System.out.println(uArr.indexOf(7));
        System.out.println(uArr.indexOf(3));

        System.out.println("Print after removing the 4th entry, at the index of 3");
        uArr.removeAt(3);
        uArr.print();
//        System.out.println(uArr.indexOf(5));
    }
}
