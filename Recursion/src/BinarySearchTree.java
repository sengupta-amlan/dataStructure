public class BinarySearchTree {
    static int arr[]={10,20,30,40,50,60,70,80,90,100,110};
    public static void main(String[] args) {

        int n=arr.length;
        int res=BinarySearch(0,n-1,arr,100);
        System.out.println(res);
    }

    public static int BinarySearch(int start,int end,int arr[],int searchNumber){

        if(start==end){
            if(arr[start]==searchNumber){
                return start;
            }
            else{
                return -1;
            }
        }
        else{
            int mid=(int)((start+end)/2);
            if(arr[mid]>searchNumber){
                end=mid-1;
                return BinarySearch(start,end,arr,searchNumber);
            }
            else if(arr[mid]<searchNumber){
                start=mid+1;
                return BinarySearch(start,end,arr,searchNumber);
            }
            else {
                return mid;
            }
        }

    }
}
