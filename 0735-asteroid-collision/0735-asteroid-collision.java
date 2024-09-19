class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // -ve -> towards left, +ve -> towards right
        // for collision -> left is +ve and right is -ve
        // if left is smaller, left is destroyed
        // if right is smaller, right is destroyed
        // if both are equal, both are destroyed

        Stack<Integer> s = new Stack<>();
        for (int ast : asteroids) {
            while(!s.isEmpty() && ast < 0 && s.peek() > 0) {
                int sum = ast + s.peek();
                if (sum < 0) { // sum < 0 -> left is destroyed
                    s.pop();
                } else if (sum > 0) { // sum > 0 -> right is destroyed
                    ast = 0;
                } else { // sum = 0 -> both are destroyed
                    s.pop();
                    ast = 0;
                }
            }
            if (ast != 0) s.push(ast); // if ast is not destroyed
        }

        int[] ans = new int[s.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }
}