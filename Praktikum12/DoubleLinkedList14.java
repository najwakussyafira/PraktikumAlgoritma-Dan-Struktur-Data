package Praktikum12;

public class DoubleLinkedList14 {
    Node14 head;
    Node14 tail;

    public DoubleLinkedList14() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(int index, Mahasiswa14 data) {
    if (index < 0 || index > size()) {
        System.out.println("Index tidak valid.");
        return;
    }

    Node14 newNode = new Node14(data);

    if (index == 0) {
        addFirst(data); 
        return;
    }

    if (index == size()) {
        addLast(data); 
        return;
    }

    Node14 current = head;
    for (int i = 0; i < index - 1; i++) {
        current = current.next;
    }

    newNode.next = current.next;
    newNode.prev = current;
    current.next.prev = newNode;
    current.next = newNode;
}

public Mahasiswa14 getFirst() {
    if (isEmpty()) {
        System.out.println("List kosong.");
        return null;
    }
    return head.data;
}

public Mahasiswa14 getLast() {
    if (isEmpty()) {
        System.out.println("List kosong.");
        return null;
    }
    return tail.data;
}

public Mahasiswa14 getIndex(int index) {
    if (index < 0 || index >= size()) {
        System.out.println("Index tidak valid.");
        return null;
    }

    Node14 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    return current.data;
}

    public void insertAfter(String keyNim, Mahasiswa14 data) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node14 newNode = new Node14(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

   public void print() {
        if (isEmpty()) {
            System.out.println("Warning: Linked list masih kosong.");
            return;  
        }
        
        Node14 current = head;
        while (current != null) {
            current.data.tampil();  
            current = current.next;  
        }
    }
   public void removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        head.data.tampil(); 

    if (head == tail) {
        head = tail = null;  
    } else {
        head = head.next;
        head.prev = null;
    }
}

   public void removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        tail.data.tampil(); 

    if (head == tail) {
        head = tail = null; 
    } else {
        tail = tail.prev;
        tail.next = null;
    }
}

public void remove(int index) {
    if (index < 0 || index >= size()) {
        System.out.println("Index tidak valid.");
        return;
    }

    if (index == 0) {
        removeFirst();
        return;
    }

    if (index == size() - 1) {
        removeLast();
        return;
    }

    Node14 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    current.prev.next = current.next;
    if (current.next != null) {
        current.next.prev = current.prev;
    }
}

public void removeAfter(String key) {
    Node14 current = head;
    
    while (current != null && !current.data.nim.equals(key)) {
        current = current.next;
    }

    if (current == null || current.next == null) {
        System.out.println("Node setelah NIM " + key + " tidak ditemukan.");
        return;
    }

    current.next = current.next.next;
    if (current.next != null) {
        current.next.prev = current;
    }
}

public int size() {
    int size = 0;
    Node14 current = head;
    while (current != null) {
        size++;
        current = current.next;
    }
    return size;
}

    public Node14 search(String nim) {
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
