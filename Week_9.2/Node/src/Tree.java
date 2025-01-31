public class Tree<E> {
    public Node<E> rootNode = new Node<>();
    public int treeSize = 1;

    public Tree(E data) {
        this.rootNode.setData(data);
    }

    public int size() {
        return this.treeSize;
    }

    public void addChild(E parentData, Node<E> child) {
        Node<E> parent = getNode(parentData);
        if (parent != null) {
            parent.addChild(child);
            this.treeSize++;
        }
    }

    public void addChild(E parentData, E dataChild) {
        Node<E> newChild = new Node<>(dataChild);
        Node<E> parent = getNode(parentData);
        if (parent != null) {
            parent.addChild(newChild);
            this.treeSize++;
        }
    }

    public Node<E> getNode(E data) {
        return preOrderGetNode(this.rootNode, data);
    }

    public void draw() {
        this.preOrderDraw(this.rootNode, 0);
    }

    private Node<E> preOrderGetNode(Node<E> node, E data) {
        if (node.getData().equals(data)) {
            return node;
        } else if (!node.isLeaf()) {
            for (Node<E> child : node.getChildren()) {
                Node<E> returnNode = preOrderGetNode(child, data);
                if (returnNode != null) {
                    return returnNode;
                }
            }
        }
        return null;
    }

    private static void preOrderCariBawahan(Node<String> nodeNow) {
        if (nodeNow == null) {
            System.out.println("Tidak ditemukan node yang dicari.");
            return;
        }
        System.out.println(nodeNow.getData());
        for (Node<String> child : nodeNow.getChildren()) {
            preOrderCariBawahan(child);
        }
    }

    public static void CariBawahan(String nama, Tree<String> t) {
        Node<String> awal = t.getNode(nama);
        preOrderCariBawahan(awal);
    }

    private void preOrderDraw(Node<E> node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        System.out.println(" " + node.getData());
        for (Node<E> child : node.getChildren()) {
            preOrderDraw(child, depth + 1);
        }
    }
}