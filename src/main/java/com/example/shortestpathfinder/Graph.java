package com.example.shortestpathfinder;

import java.util.List;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph() {}

    public Graph(List<Node> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }



    // Add getters and setters for the nodes and edges
}
