import java.util.*;

public class TrappedRainWater{

    public static int TrappedRainWater(int height[]){  // T.C => O(n)
        int n = height.length;
        
        // Calculate left max boundary - Array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate Right max boundary - Array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // Loop
        for(int i=0; i<n; i++){
            // min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterlevel - height[i]
            trappedWater = trappedWater + waterLevel - height[i];
        }
        return trappedWater;
    }


    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.print(TrappedRainWater(height));
    }
}