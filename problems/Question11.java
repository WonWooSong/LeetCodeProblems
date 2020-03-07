class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int front = 0;
        int back = height.length-1;
        while(front < back){
            int length = back - front;
            int width = Math.min(height[front], height[back]);
            int area = length * width;
            
            if(height[front] <= height[back]){
                front++;
            }
            else{
                back--;
            }
            
            if(max < area){
                max = area;
            }
            
        }
        return max;
    }
}