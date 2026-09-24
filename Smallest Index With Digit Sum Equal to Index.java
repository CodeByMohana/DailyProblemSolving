// 3550. Smallest Index With Digit Sum Equal to Index.java
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(sumOfDigits(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    public int sumOfDigits(int number){
        if(number < 10) return number;
        int sum = 0;
        int temp = 0;
        while(number != 0){
            temp = number % 10;
            sum += temp;
            number = number / 10; 
        }
        return sum;
    }
}
