package actividadenclase.busqueda;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PseudoImpl {
    public Node BREADTH_FIRST_SEARCH(Laberinto problem) {
        Node node = new Node(problem.INITIAL);
        if (problem.IS_GOAL(node)) {
            return node;
        }
        Queue<Node> frontier = new LinkedList<>();
        frontier.add(node);
        Set<Object> reached = new HashSet<>();
        reached.add(problem.INITIAL);
        while (!frontier.isEmpty()) {
            node = frontier.remove();
            for (Node child : EXPAND(problem, node)) {
                Object s = child.STATE;
                if (problem.IS_GOAL(s)) {
                    return child;
                }
                if (!reached.contains(s)) {
                    reached.add(s);
                    frontier.add(child);
                }
            }
        }
        return null; // failure
    }

    private Node[] EXPAND(Laberinto problem, Node node) {
        return new Node[0];
    }
}
