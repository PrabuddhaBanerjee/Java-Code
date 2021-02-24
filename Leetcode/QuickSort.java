class QuickSort{
  public static void quicksort(int[] arr){
    quicksort(arr, 0, arr.length-1);
  }
  public static void quicksort(int[] arr, int i, int j){
    if(j>i){
      int pivot = partition(arr,  i, j);
      quicksort(arr, i, pivot-1);
      quicksort(arr, pivot+1, j);
    }
  }
  // [2,3,2,1,-2]
  // p = 0 "2"; l = 1; h = 5
  // [2,-2,2,1,3]
  public static int partition(int[] arr, int i, int j){
    int pivot = arr[i];
    int low = i+1;
    int high = j;
    while(high>low){
      while(low<=high && arr[low]<=pivot){
        low++;
      }
      while(low<=high && arr[high]>pivot){
        high--;
      }
      if(high>low){
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low] = temp;
      }
      while(high>i && arr[high]>=pivot){
        high--;
      }
      if(pivot>arr[high]){
        arr[i] = arr[high];
        arr[high] = pivot;
        return high;
      }
      else return i;
    }
    return i;
  }
  public static void main(String[] args){
    int[] arr = new int[]{2,3,2,1,-2};
    quicksort(arr);
    for(int i :arr){
     System.out.print(i+" ");
    }
  }
}
