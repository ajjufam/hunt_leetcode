import java.util.Arrays;
class Ans{
    double medianSortedArrays(int[] nums1,int[] nums2){
        int[] mergedArr=new int[nums1.length+nums2.length];
        int index=0;

        for(int i=0;i<nums1.length;i++){
            mergedArr[index++]=nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            mergedArr[index++]=nums2[i];
        }

        Arrays.sort(mergedArr);
        double median=0;

        if(mergedArr.length%2==0){
        // consider len is even = 10 [(10/2)-1])+[10/2]) / 2
        return (mergedArr[(mergedArr.length/2) - 1]+mergedArr[mergedArr.length/2])/2.0;
        }else{
        // consider len is odd = 9 ( [((9+1)/2)-1] ) = ans
        return (mergedArr[mergedArr.length / 2]);
        }
    }

    public static void main(String[] args){
    Ans obj=new Ans();

        int[] nums1={1,3};
        int[] nums2={2,4};
        double median=obj.medianSortedArrays(nums1,nums2);
        System.out.println(median);
    }
}