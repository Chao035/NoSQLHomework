public class MinSubNum {
    private TreeNode root;
    private TreeNode ret;
    private int min;

    public MinSubNum(TreeNode root){
        this.root=root;
        min=Integer.MAX_VALUE;
    }

    public TreeNode getMinSubNode(){
        getSum(root);
        return ret;
    }

    private int getSum(TreeNode node){
        if(node==null){
            return 0;
        }

        int sum=getSum(node.getLeft())+getSum(node.getRight())+node.getVal();
        if(sum<min){
            min=sum;
            ret=node;
        }
        return sum;
    }

}
