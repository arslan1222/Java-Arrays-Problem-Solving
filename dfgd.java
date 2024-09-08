


import java.util.*;

public class TrappedRainWater{

    public static int TrappedRainWater(int height[]){
        
        // Calculate left max boundary - Array

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate Right max boundary - Array

        int rightMax[] = new int[height.length];
        int end = rightMax.length-1;
        rightMax[end] = height[end];

        for(int i=end-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // Loop
        for(int i=0; i<end; i++){
            // min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }


    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.print(TrappedRainWater(height));
    }
}