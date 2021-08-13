package usrLinkedList;

public class ulsinLinkedList<T> {
    //TODO get it done
    private uNode<T> first;
    private uNode<T> last;

    public ulsinLinkedList() {
        first = new uNode<>();
        last = new uNode<>();
        first.next = last;
    }

    public void addFirst(T innData) {
        if (first.data == null) {
            first.data = innData;
        } else {
            uNode<T> newFirst = new uNode<>();
            newFirst.data = innData;
            newFirst.next = first;
            first = newFirst;
        }
    }

    public void addLast(T innData) {
        if (first.data == null) {
            first.data = innData;
        } else {
            last.data = innData;
            last.next = new uNode<>();
            last = last.next;
        }
    }

    public void print() {
        uNode<T> tempNode = first;
        do {
            System.out.println(tempNode.data);
            tempNode = tempNode.next; // tempnode now points to the next node in the chain
        } while (tempNode.next != null);

    }


}
