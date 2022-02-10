package linkedlist;

public class LinkedList {

    Node head;
    private int size = 0;

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node insert(int num) {
        Node p = head;
        if (p == null) {
            head = new Node(num);
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = new Node(num);
        }
        return head;
    }

    //Practice
//    public Node add(int num){
//        if(head == null) return head = new Node(num);
//        for(Node p = head; p!= null; p = p.next){
//            if(p.next == null){
//                p.next = new Node(num);
//                return head;
//            }
//        }
//        return head;
//    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int size() {
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void deleteLast() {
        Node last = head;
        if (last == null) {
            return;
        }
        if (last.next == null) {
            head = null;
            return;
        }
        while (last.next.next != null) {
            last = last.next;
        }
        last.next = null;
    }

    public Node delete(int target) {
        if (head == null || head.data == target) {
            return head = head.next;
        }
        Node p = head;
        while (p.next != null) {
            if (p.next.data == target) {
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }

    public int search(int value) {
        int index = 0;
        if (head == null) {
            return -1;
        }
        if (head.data == value) {
            return index;
        }
        for (Node p = head.next; p != null; p = p.next) {
            index++;
            if (p.data == value) {
                return index;
            }
        }
        return -1;
    }

    public int sum() {
        int sum = 0;
        Node p = head;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return sum;
    }

    public LinkedList copy() {
        LinkedList list2 = new LinkedList();
        for (Node p = head; p != null; p = p.next) {
            list2.insert(p.data);
        }
        return list2;
    }

    public LinkedList subList(int a, int b) {
        LinkedList list2 = new LinkedList();
        int index = 0;
        for (Node p = head; p != null; p = p.next) {
            if (index >= a && index <= b) {
                list2.insert(p.data);
            }
            index++;
        }
        return list2;
    }

    public void append(LinkedList list2) {
        Node p;
        for (p = head; p.next != null; p = p.next) {
        };
        for (Node q = list2.head; q != null; q = q.next) {
            p.next = q;
            p = p.next;
        }
    }

    public LinkedList merge(LinkedList list) {
        LinkedList list2 = new LinkedList();
        Node p;
        for (p = head; p.next != null; p = p.next){};
        for (Node q = list.head; q != null; q = q.next) {
            p.next = q;
            p = p.next;
        }
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }

        for (Node q = head; q != null; q = q.next) {
            list2.insert(q.data);
        }
        return list2;
    }

    public int lowestNumber() {
        int low = head.data;
        for (Node p = head.next; p != null; p = p.next) {
            if (p.data < low) {
                low = p.data;
            }
        }
        return low;
    }

    public int highestNumber() {
        int high = head.data;
        for (Node p = head.next; p != null; p = p.next) {
            if (p.data > high) {
                high = p.data;
            }
        }
        return high;
    }

}
