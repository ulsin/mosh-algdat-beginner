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
        uNode<T> tempNode = new uNode<>();
        tempNode.data = innData;
        tempNode.next = first; // tempnode now points to the adress of the first
        first = tempNode; // first now points to adress of tempnode
    }

    public void print() {
        uNode<T> tempNode = first;
        while (tempNode.next != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next; // tempnode now points to the next node in the chain
        }

    }


}
