public class colorSort {
    public static void main(String[] args) {

      int arr[] = {2,0,2,1,1,0};

      sortColors(arr);

      for(int i = 0; i < arr.length;i++){

        System.out.println(arr[i]);
      }
    }

    public static void sortColors(int[] nums) {

        int n = nums.length;
        
        int count[] =new int [3];
    
        for(int i = 0 ; i < n; i++){

            count[nums[i]]++;

        }

        int idx = 0; 

        for(int i = 0 ; i < 3 ; i++){

            int val = count[i];

            
            
            for(int j = idx; j < val+ idx; j++){

                nums[j] = i;

            }
            idx+=val;
           
        }

    }
}
