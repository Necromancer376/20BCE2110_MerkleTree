import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        // int n;
        // ArrayList<String> values = new ArrayList<>();
        // Scanner input = new Scanner(System.in);
        // n = input.nextInt();

        // for(int i=0; i<=n; i++) {
        //     values.add(input.nextLine());
        // }
        // System.out.println("\n");

        ArrayList<String> values = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        Node root = buildTree(values);
        System.out.println("Merkle Tree:\n");
        printTree(root);
    }

    public static String Hash(String[] values) {

        long result = 0;

        for (String v: values) {
            result = result * 31 + v.hashCode();
        }

        return Long.toString(result);
    }


    public static Node buildTree(ArrayList<String> values) {
        
        ArrayList<Node> leafNodes = new ArrayList<>();
        ArrayList<Node> branches = new ArrayList<>();
        
        for(String val: values) {
            leafNodes.add(new Node(null, null, Hash(new String[]{val})));
        }

        while(leafNodes.size() != 1) {

            int index = 0;
            int len = leafNodes.size();
            
            while(index < len) {

                Node leftChild = leafNodes.get(index);
                Node rightChild = null;

                if(index + 1 < len) {
                    rightChild = leafNodes.get(index + 1);
                }
                else {
                    rightChild = new Node(null, null, leftChild.getValue());
                }

                String newHash = Hash(new String[] {leftChild.getValue(), rightChild.getValue()});
                branches.add(new Node(leftChild, rightChild, newHash));
                index += 2;
            }
            leafNodes = branches;
            branches = new ArrayList<Node>();
        }

        return leafNodes.get(0);
    }

    public static void printTree(Node root) {

        if(root == null) {
            return;
        }

        if(root.getRight() == null && root.getLeft() == null) {
            System.out.println(root.getValue());
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()) {

            Node temp_node =  q.poll();

            if(temp_node != null) {
                System.out.println(temp_node.getValue());
            }
            else {
                System.out.println();
                if(!q.isEmpty()) {
                    q.add(null);
                }
            }

            if(temp_node != null && temp_node.getLeft() != null) {
                q.add(temp_node.getLeft());
            }
            if(temp_node != null && temp_node.getRight() != null) {
                q.add(temp_node.getRight());
            }
        }
    }
}
