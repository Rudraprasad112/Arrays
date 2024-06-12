public class colorSort {
    public static void main(String[] args) {

      int arr[] = {2,0,2,1,1,0};

      sortcolorArrpoach2(arr);

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
    public static void  sortcolorArrpoach2(int nums[]){

        int count_zero = 0;

        int count_one = 0;
        
        int count_two = 0;

        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] == 0){
                
                count_zero++;

            }else if(nums[i] == 1){

                count_one++;

            }else{

                count_two++;
            }
        }

        int idx = 0;

        for(int j = idx; j < idx+ count_zero;j++){

            nums[j] = 0;

        }
        idx += count_zero;

        for(int j = idx; j < idx+ count_one;j++){

            nums[j] = 1;

        }
        idx += count_one;

        for(int j = idx; j < idx+ count_two;j++){

            nums[j] = 2;

        }
        idx += count_two;
        
    }
}
