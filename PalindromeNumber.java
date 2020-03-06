class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int front = 0;
        int back = str.length()-1;
        boolean output = false;
        while(front <= back){
            if(str.charAt(front) == str.charAt(back)){
                front++;
                back--;
                output = true;
            }
            else{
                return false;
            }
        }
        return output;
    }
}