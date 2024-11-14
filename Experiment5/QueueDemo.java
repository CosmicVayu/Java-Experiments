


interface QueueImpl {
    void insert(int element) throws QueueOverflowException;
    int delete() throws QueueUnderflowException;
    void display();
}

class QueueOverflowException extends Exception {
    public QueueOverflowException(String message) {
        super(message);
    }
}

class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super(message);
    }
}

class QueueDemo implements QueueImpl {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int MAX_SIZE = 10;

    // Constructor
    public QueueDemo() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void insert(int element) throws QueueOverflowException {
        if (size == MAX_SIZE) {
            throw new QueueOverflowException("Queue is full. Cannot insert element: " + element);
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        size++;
        System.out.println("Inserted: " + element);
    }

    @Override
    public int delete() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException("Queue is empty. Cannot delete element.");
        }
        int element = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        System.out.println("Deleted: " + element);
        return element;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % MAX_SIZE] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();

        try {
            for (int i = 1; i <= 10; i++) {
                queue.insert(i);
            }
            queue.display();

            queue.insert(11);
        } catch (QueueOverflowException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Delete elements from the queue
            queue.delete();
            queue.delete();
            queue.display();

            while (true) {
                queue.delete();
            }
        } catch (QueueUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
