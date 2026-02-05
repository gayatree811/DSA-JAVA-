/* public class TrappedRainWater {
    public static int raintrap(int height[]){
        int n = height.length;

        // for height of left max
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i = 1 ; i < n ; i++){
            leftmax[i] = Math.max(height[i],leftmax[i - 1]);
        }

        // right max
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n - 1];
        for(int i = n-2 ; i>=0; i--){
            rightmax[i] = Math.max(leftmax[i], rightmax[i]) - height[i];
        }
        // calculate the water
        int TrappedRainWater = 0;
        for (int i = 0 ; i <n; i++){
            TrappedRainWater += Math.min(leftmax[i], rightmax[i]- height[i]);
        }
        return TrappedRainWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(raintrap(height));
        
    }
    
}
 */

public class TrappedRainWater {
    public static int raintrap(int height[]) {
        int n = height.length;

        // left max
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // right max
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // trapped water
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            trappedRainWater += Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return trappedRainWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(raintrap(height));
    }
}
