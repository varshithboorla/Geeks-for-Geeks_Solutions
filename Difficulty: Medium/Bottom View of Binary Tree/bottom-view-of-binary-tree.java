/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Pair {
	Node node;
	int hd;
	Pair(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}
class Solution {
	public ArrayList<Integer> bottomView(Node root) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		while (!q.isEmpty()) {
			Pair re = q.poll();
			map.put(re.hd, re.node.data);
			if (re.node.left != null)
				q.add(new Pair(re.node.left, re.hd - 1));
			if (re.node.right != null)
				q.add(new Pair(re.node.right, re.hd + 1));
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			list.add(e.getValue());
		}
		return list;
	}
}
