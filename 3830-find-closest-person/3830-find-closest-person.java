class Solution {
    public int findClosest(int x, int y, int z) {
        int ansx = Math.abs(z-x);
        int ansy=Math.abs(z-y);
        if(ansx>ansy){
            return 2;
        }
        else if(ansy>ansx){
            return 1;
        }
        else{
            return 0;
        }
    }
}