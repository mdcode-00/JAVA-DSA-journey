package Stack_Queue;

public class CustomQueue {
    protected int[] data;
    private  static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public  CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }


    public boolean insert(int item) {
        if(isFull()){
            return  false;
        }
        data[end++] = item;
        return  true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int remove = data[0];

        // shift the data from the left one by one ;;
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }

    public int front()  throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-");
        }
        System.out.println("end");
    }

}
