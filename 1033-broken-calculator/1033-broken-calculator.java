class Solution {
    public int brokenCalc(int startValue, int target) {
      //change target to  start Value and start value to target 
      int op=0;
      int target1=startValue;
      int startValue1=target;
      while(target1<startValue1){
        if(startValue1%2==0){
            op++;
            startValue1= startValue1/2;
        }
        else{
            startValue1++;
            op++;
        }
      }
      op+= target1-startValue1;
      return op;
    }
}