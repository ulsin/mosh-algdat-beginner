package usrArray;

public class Main {
    public static void main(String[] args) {
        ulsinArray uArr = new ulsinArray(5);
        uArr.insert(3);
        uArr.insert(5);
        uArr.insert(0);
        uArr.insert(7);
        uArr.print();

        System.out.println(uArr.indexOf(7));
        System.out.println(uArr.indexOf(3));
    }
}
