public class MyArrayList<T>{
    private Object[] arr;
    private int index;
    public MyArrayList(){
        this.arr = new Object[10];
        this.index = 0;
    }
    public MyArrayList(int n){
        this.arr = new Object[n];
        this.index = 0;
    }
    public void add(T x){
        if(this.index<this.arr.length){
            this.arr[index] = x;
            this.index++;
        }else{
            Object[] tmp = new Object[index*2];
            for(int i=0;i<index;i++){
                tmp[i] = this.arr[i];
            }
            this.arr = tmp;
            this.arr[index] = x;
            this.index++;
        }

    }
    public Boolean del(int index){
        if(index<this.index){
            for(int i=index;i<this.index-1;i++){
                this.arr[i] = this.arr[i-1];
            }
            return true;
        }else{
            return false;
        }
    }
    public T get(int index){
        return (T) this.arr[index];
    }
    public void change(int index, T x){
        this.arr[index] = x;
    }
}
