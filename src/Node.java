public class Node {
    
    private String value;
    private Node left;
    private Node right;

    Node(Node l, Node r, String val) {
        this.setValue(val);
        setRight(r);
        setLeft(l);
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
