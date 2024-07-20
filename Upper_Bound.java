import java.util.*;
public class Upper_Bound{
    static int answer(int[] arr,int target){
        int low=0,high=arr.length-1;
        int idx=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
                idx=mid;
            }
            else
                low=mid+1;
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
            int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("\nEnter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        Arrays.sort(arr);
        System.out.print("\nEnter the element whose upper bound to be searched: ");
            int target=Sc.nextInt();
        System.out.println("\nEntered Array in sorted order is: ");
        for(int ele:arr)
            System.out.print(ele+" ");
        System.out.println();
        System.out.println("\nThe upper bound of "+target+" is "+answer(arr,target));
    }
}
