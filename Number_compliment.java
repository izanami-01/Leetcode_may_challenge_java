class Solution {
    public int findComplement(int num) {
        int bits = (int)(Math.floor(Math.log(num)/Math.log(2))) +1;
        return (((1<<bits)-1)^num);
    }
}