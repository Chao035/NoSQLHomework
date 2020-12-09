import java.util.ArrayList;

public class PreOrder {
    private static ArrayList<Integer> result = new ArrayList<Integer> ();

    public static ArrayList<Integer> preorder(TreeNode root){
        helper(root);
        return result;
    }

    private static void helper(TreeNode root){
        if(root==null){
            return;
        }
        result.add(root.getVal());
        helper(root.getLeft());
        helper(root.getRight());
    }

}
