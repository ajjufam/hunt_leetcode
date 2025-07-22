import java.util.Arrays;
class Ans{

//     <access_modifier> <return_type> <method_name>(<parameter_list>) {
//     // method body
//      }

    int[] twoSum(int[] nums,int target){   // return type must 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null; // must needed
    }

    public static void main(String args[]){
    Ans obj=new Ans();

        int[] nums={2,7,11,15};
        int target=9;
        int[] result=obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}