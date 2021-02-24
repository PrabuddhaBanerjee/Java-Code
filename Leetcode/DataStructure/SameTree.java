//Same Tree: Not yet solved
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean check = true;
        boolean same = false;
        if((p == null) && (q == null))
            return check = true;
        else {
          TreeNode parent = p;
          TreeNode current = q;
          while(same!=true){
             if(current.val != parent.val)
               return same = false;
             else{
                if((current.left!=null)&&(parent.left!=null)){
                  current = current.left;
                  parent = parent.left;
                }
                else if((current.left==null)&&(parent.left==null)){
                  if((current.right!=null)&&(parent.right!=null)){
                    current = current.right;
                    parent = parent.right;
                  }
                }
                else if((current.left==null)||(parent.left==null)){
                return same = false;
              }
             }
           if((p == null) && (q == null))
             break;
          }
          //   if((p != null) && (q != null)){
          //       if(p.val != q.val) {
          //         return check = false;
          //       }
          //       else check = true;
          //
          //       if((p.left != null) && (q.left != null)){
          //           if(p.left.val != q.left.val){
          //               return check = false;
          //           }
          //       }
          //       else if((p.left == null) && (q.left == null)){
          //            check = true ;
          //       }
          //       else return check = false;
          //   if((p.right != null) && (q.right != null)){
          //           if(p.right.val != q.right.val){
          //               return check = false;
          //           }
          //       }
          //   else if((p.right == null) && (q.right == null)){
          //       check = true ;
          //   }
          //   else return check =  false;
          //   }
          //   if(((p == null) && (q != null))||((p != null) && (q == null)))
          //       return false;
          // return true;
        }
    }
}
