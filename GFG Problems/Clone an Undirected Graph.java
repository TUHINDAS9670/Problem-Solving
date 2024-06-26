
class Solution{
    Node cloneGraph(Node node){
        if (node == null)
            return null;

        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        Node copy = new Node(node.val);
        map.put(node.val, copy);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (Node neigh : curr.neighbors) {
                if (!map.containsKey(neigh.val)) {
                    Node copyNeigh = new Node(neigh.val);
                    map.put(neigh.val, copyNeigh);
                    queue.add(neigh);
                }
                map.get(curr.val).neighbors.add(map.get(neigh.val));
            }
        }

        return copy;
    }
}
