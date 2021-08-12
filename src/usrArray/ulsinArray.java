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

    public void insert(int insInt) {
        // this part of the if test allows the array to grow if we insert more than the allocated space.
        // The only reason then to allocate space at all would be to save on CPU to not have to create a new array the first few times you add stuff
        if (counter == intArr.length) {
            int[] tempArr = new int[intArr.length + 1];
            for (int i = 0; i < intArr.length; i++) {
                tempArr[i] = intArr[i];
            }
            tempArr[counter++] = insInt;
            intArr = tempArr;
        } else {
            intArr[counter++] = insInt; // doing counter++ makes the compiler first read and use the current counter value, and then increase it after the operation.
        }
    }

    public void removeAt(int index) {
        int[] tempArr = new int[intArr.length - 1];
        int tempCounter = 0;
        for (int i = 0; i < counter; i++) { // Search for index
            if (i != index) { // Make new array with every element except for the index
                tempArr[tempCounter++] = intArr[i];
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
