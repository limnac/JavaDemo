public class ArrayStack {
    private int[] arr;
    private int index;
    public ArrayStack(){
        arr = new int[10];
        index = 0;
    }
    public void add(int x){
        if(index<arr.length){
            arr[index++] = x;
        }else{
            int[] tmp = new int[arr.length*2];
            for(int i=0;i<index;i++){
                tmp[i] = arr[i];
            }
            arr = tmp;
            arr[index++] = x;
        }
    }
    public int pop(){
        if(index>0){
            return arr[--index];
        }else{
            return -1;
        }
    }
    public int peek(){
        if(index>0){
            return arr[index-1];
        }else{
            return -1;
        }
    }
    public boolean isEmpty(){
        return index==0;
    }
}
