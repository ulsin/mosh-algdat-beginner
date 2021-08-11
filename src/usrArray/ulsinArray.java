package usrArray;

public class ulsinArray {
    private int[] intArr; // i used the array to make the array
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

    public void removeAt(int index) {
        // Search for index
        // Make new array with every element except for the index
        int[] tempArr = new int[intArr.length - 1];
        int tempCounter = 0;
        for (int i = 0; i < counter; i++) {
            if (i != index) {
                tempArr[tempCounter] = intArr[i];
                tempCounter++;
            }
        }
        intArr = tempArr;
        counter = counter - 1;
    }

    public int indexOf(int number) {
        int indexCounter = 0;
        for (int i = 0; i < counter; i++) {
            if (number == intArr[i]) {
                return indexCounter;
            }
            indexCounter++;
        }
        return -1; // returns -1 if the number is never found.
    }
}
