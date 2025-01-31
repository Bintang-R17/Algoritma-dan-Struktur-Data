public class Main {

    public static void main(String[] args) {

        Tree<String> pohonKu = new Tree<String>("Agung");


        pohonKu.addChild("Agung", "Budi");
        pohonKu.addChild("Agung", "Beni");
        pohonKu.addChild("Agung", "Basuki");

        pohonKu.addChild("Budi", "Cholis");
        pohonKu.addChild("Budi", "Cholil");

        Node<String> damarNode = new Node<String>("Damar");
        pohonKu.addChild("Cholil", damarNode);

        pohonKu.addChild("Basuki", "Candra");

        pohonKu.draw();

        System.out.println();
        System.out.println("Anak-anak dari Budi:");
        Node<String> budiNode = pohonKu.getNode("Budi");
        if (budiNode != null) {
            for (int i = 0; i < budiNode.getNumChild(); i++) {
                Node<String> child = (Node<String>) budiNode.getChildren().get(i);
                System.out.println(child.getData());
            }
        } else {
            System.out.println("Node Budi tidak ditemukan.");
        }
    }
}
