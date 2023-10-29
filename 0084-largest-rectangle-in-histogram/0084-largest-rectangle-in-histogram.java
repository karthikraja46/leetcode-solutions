class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        Stack<Integer> s = new Stack<>();
        
        // Finding the next smaller to right
        for(int i = n-1; i >= 0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            
            if(s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            
            s.push(i);
        }
        
        // Clearing the stack for next loop
        s.clear();
        
        // Finding the next smaller to left
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            
            s.push(i);
        }
        
        // Calculating the maximum area
        for(int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        
        return maxArea;
    }
}
