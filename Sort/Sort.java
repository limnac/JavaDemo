package com.company;

public class Sort {
    // 冒泡排序
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    //选择排序
    public void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    //插入排序
    public void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j = i;
            while(j>0){
                if(tmp<arr[j-1]){
                    arr[j] = arr[j-1];
                    j--;
                }else{
                    break;
                }
            }
            arr[j] = tmp;
        }
    }
    //快速排序
    public void quickSort(int[] arr){
        qs(arr,0,arr.length-1);
    }
    private void qs(int[] arr,int start,int end){
        if(start>end) return;
        int tmp = arr[start];
        int a = start;
        int b = end;
        while(a<b){
            while(arr[b]>= tmp&&a<b) b--;
            while(arr[a]<=tmp&&a<b) a++;
            if(a<b){
                arr[a] += arr[b];
                arr[b] = arr[a] - arr[b];
                arr[a] -= arr[b];
            }
        }
        arr[start] = arr[a];
        arr[a] = tmp;

        qs(arr,start,a-1);
        qs(arr,a+1,end);
    }
    //归并排序
    public void mergeSort(int[] arr){
        mSort(arr,0,arr.length-1);
    }
    private void mSort(int[] arr,int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mSort(arr,low,mid);
            mSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    private void merge(int[] arr, int low, int mid, int high){
        int[] tmp = new int[high-low+1];
        int index = 0;
        int a = low;
        int b = mid+1;
        while(a<=mid&&b<=high){
            if(arr[a]<arr[b]){
                tmp[index++] = arr[a++];
            }else{
                tmp[index++] = arr[b++];
            }
        }
        while(a<=mid){
            tmp[index++] = arr[a++];
        }
        while (b<=high){
            tmp[index++] = arr[b++];
        }
        for(int i=0;i<tmp.length;i++){
            arr[low+i] = tmp[i];
        }

    }
    //堆排序
    public  void heapSort(int[] arr){
        for(int i=arr.length/2;i>=0;i--){
            adjust(arr,i,arr.length-1);
        }
        for(int i=arr.length-1;i>0;i--){
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            adjust(arr,0,i-1);
        }
    }
    private void adjust(int[] arr,int parent,int end){
        int child = 2*parent+1;
        int tmp = arr[parent];
        while(child<=end){
            if(arr[child]<arr[child+1]&&child+1<=end){
                child++;
            }
            if(tmp<arr[child]){
                arr[parent] = arr[child];
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
        arr[parent] = tmp;
    }

}
