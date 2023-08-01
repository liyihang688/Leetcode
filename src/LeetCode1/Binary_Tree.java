package LeetCode1;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val,TreeNode right,TreeNode left){
        this.val=val;
        this.left=left;
        this.right=right;
    }

    public List<Integer> Get_res(TreeNode root){
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> res=new ArrayList<Integer>();
        dfs(root,res,0);
        return res;


        //wudi ceshi
        //xiugai

    }
    public void dfs(TreeNode root,List<Integer> res, int CurrentHeight){
        if(CurrentHeight== res.size()){
            res.add(root.val);
        }else{
            res.set(CurrentHeight,Math.max(res.get(CurrentHeight),root.val ));
        }
        if(root.left!=null){
            dfs(root.left,res,CurrentHeight+1);
        }
        if(root.right!=null){
            dfs(root.right,res,CurrentHeight+1);
        }

    }
}
public class Binary_Tree {
}
