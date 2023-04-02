class Solution {
    public int solution(int[] nums) {
        
        int[] poketmon = new int[200001];
        
        for(int i = 0 ; i < nums.length;i++)
        {
            poketmon[nums[i]]++; 
        }
        
        int count = 0;
        for(int i = 0 ; i <= 200000;i++)
        {
            if(poketmon[i] > 0)
            {
                count++;
            }
        }
        int answer = nums.length/2;
        
        if(answer > count)
            answer = count;
        
        // 
        return answer;
    }
}