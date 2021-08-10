package usrArray;

public class ulsinArray {
    private int[] intArr;
    private int counter = 0; // keeps track of how many elements that have been inserted.

    public ulsinArray(int length) {
        intArr = new int[length];
    }

    public void print() {
        for (int i = 0; i < counter; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void insert(int ins) {
        if (intArr[counter] == 0) {
            intArr[counter] = ins;
            counter++;
        }
    }
}
