package usrArray;

public class ulsinArray {
    private int[] intArr;

    public ulsinArray(int length) {
        intArr = new int[length];
    }

    public void printArr() {
        for (int i : intArr) {
            System.out.println(i);
        }
    }

}
