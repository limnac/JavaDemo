public class ArrayQueue {
    private int[] arr;
    private int a;
    private int b;
    public ArrayQueue(){
        arr = new int[10];
        a = 0;
        b = 0;
    }
    public void push(int x){
        if((b+1)%arr.length!=a){
            b = (b+1)%arr.length;
            arr[b] = x;
        }
    }
    public int poll(){
        int tmp = b;
        b = (b-1)%arr.length;
        return arr[tmp];
    }
    public int peek(){
        return arr[b];
    }
    public boolean isEmpty(){
        return a==b;
    }
}
