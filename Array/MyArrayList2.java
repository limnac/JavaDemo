public class MyArrayList2 {
    private int[] arr;
    private int index;
    public MyArrayList2(int n){
        arr = new int[n];
        index = 0;
    }
    public void add(int x){
        if(this.index<this.arr.length-1){
            if(this.index==0){
                this.arr[this.index++] = x;
            }else{
                int tmp = this.index;
                while(tmp>0&&this.arr[tmp-1]>x){
                    this.arr[tmp] = this.arr[tmp-1];
                    tmp--;
                }
                this.arr[tmp] = x;
                this.index++;
            }
        }
    }
    public void del(int i){
        if(i<this.index){
            for(int j=i;j<this.index;j++){
                this.arr[j-1] = this.arr[j];
            }
            this.index--;
        }
    }
    public void get(){
        for(int i=0;i<this.index;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
}
