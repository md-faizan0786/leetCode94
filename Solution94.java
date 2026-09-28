public class Solution94 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode start;
        TreeNode end;

        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode start, TreeNode end) {
            this.val = val;
            this.start = start;
            this.end = end;
        }

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        if(start>end) {
            return null;
        }

        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, start, mid-1);
        root.right = helper(nums, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
        Solution94 solution = new Solution94();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);
        System.out.println("Root value: " + root.val);
    }
    
}
