package Trees_CheckAgain;



/*Given Inorder Traversal of a Special Binary Tree in which key of 
 * every node is greater than keys in left and right children,
 *  construct the Binary Tree and return root.

 Examples:

 Input: inorder[] = {5, 10, 40, 30, 28}
 Output: root of following tree
 40
 /   \
 10     30
 /         \
 5          28 
 The idea used in Construction of Tree from given Inorder and Preorder traversals can be used here. Let the given array is {1, 5, 10, 40, 30, 15, 28, 20}. The maximum element in given array must be root. The elements on left side of the maximum element are in left subtree and elements on right side are in right subtree.

 40
 /       \  
 {1,5,10}   {30,15,28,20}
 We recursively follow above step for left and right subtrees, and finally get the following tree. 

 40
 /   \
 10     30
 /         \
 5          28
 /          /  \
 1         15    20
 Algorithm: buildTree()
 1) Find index of the maximum element in array. The maximum element must be root of Binary Tree.
 2) Create a new tree node �root� with the data as the maximum value found in step 1.
 3) Call buildTree for elements before the maximum element and make the built tree as left subtree of �root�.
 5) Call buildTree for elements after the maximum element and make the built tree as right subtree of �root�.
 6) return �root�.


 */

//do it
public class ConstructSpecialTreeFRomInorderTra {

	

}
