import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) {
            return result; // Return an empty list for invalid numRows
        }

        // First row
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(i - 1);

            // First element of each row is always 1
            row.add(1);

            for (int j = 1; j < i; j++) {
                // Each element (except the first and last) is the sum of the elements above-left and above-right
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            row.add(1);

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        Solution solution = new Solution();
        List<List<Integer>> pascalTriangle = solution.generate(numRows);

        // Print the generated Pascal's triangle
        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
