public class BinarySearch {
    static int[]lits={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public int binarySearch(int[] list, int key){
        int head=0;
        int tail= list.length-1;
        while (head<=tail){
            int mid = (head+tail)/2;
            if(list[mid]==key){
                return mid;
            } else if (list[mid]>key) tail=mid-1;
            else head=mid+1;
        }
        return -1;
    }
}
