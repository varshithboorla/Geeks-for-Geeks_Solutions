/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        List<Integer> list = new ArrayList<>();
        Node d = root;
        while(d!=null){
            Node b = d;
            while(b!=null){
                list.add(b.data);
                b = b.bottom;
            }
            d = d.next;
        }
        Collections.sort(list);
        Node du = new Node(list.get(0));
        Node k = du;
        for(int i=1;i<list.size();i++){
            Node t = new Node(list.get(i));
            k.bottom = t;
            k = k.bottom;
        }
        return du;
    }
}