class NodeList {
    private Node head;
    private int size;

    public NodeList() {
        this.head = null;
        this.size = 0;
    }


    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) return null;

        if (head.next == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        Node temp = current.next;
        current.next = null;
        size--;
        return temp;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size);

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size);

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size);

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        StringBuilder sb = new StringBuilder();

        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
}