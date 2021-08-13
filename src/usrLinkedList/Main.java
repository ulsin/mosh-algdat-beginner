package usrLinkedList;

public class Main {
    public static void main(String[] args) {
        ulsinLinkedList<Integer> uLiList = new ulsinLinkedList<>();
        uLiList.addFirst(10);
        uLiList.addFirst(20);
        uLiList.addFirst(30);
        // this makes a list { 30, 20, 10 }

        uLiList.addLast(50);
        uLiList.addLast(60);
        uLiList.print();

        //TODO
        // - addLast
        // - deleteFirst
        // - deleteLast
        // - countains
        // - indexOf

    }
}
