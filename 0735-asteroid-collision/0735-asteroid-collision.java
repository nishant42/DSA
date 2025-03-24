import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && st.peek() > 0 && asteroid < 0) { // ✅ Correct Collision Check
                if (Math.abs(st.peek()) < Math.abs(asteroid)) { // Top asteroid is smaller, destroy it
                    st.pop();
                    continue; // Check the new top
                } else if (Math.abs(st.peek()) == Math.abs(asteroid)) { // Both are equal, destroy both
                    st.pop();
                    destroyed = true;
                    break;
                } else { // Top asteroid is larger, destroy the incoming asteroid
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) { // Only push if it wasn't destroyed
                st.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
