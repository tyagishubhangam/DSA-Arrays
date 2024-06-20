class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;}
            for(int j = i+1;j<nums.length;j++){
                if(j!=(i+1) && nums[j] == nums[j-1]){continue;}
                int k = j+1;
                int l = nums.length-1;
                while(k<l){  
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);
                        res.add(li);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1] ){k++;}
                        while(k<l && nums[l] == nums[l+1]){l--;}
                    }else if(sum < target){ k++;}
                    else{
                        l--;
                    }


                }
            }
        }
        return res;
    }
}