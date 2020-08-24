/*
 * This is the second part of the assignment which is a client program of MyGraph.
 * Tests MyGraph by reading in all edges and vertexs, and find the shortest path and print it out
 */

import java.util.*;
import java.io.*;

/*
 * Driver program that reads in a graph and prompts user for shortests paths in the graph.
 * (Intentionally without comments.  Read through the code to understand what it does.)
 */

public class FindPaths 
{
	public static void main(String[] args) 
   {
		if(args.length != 2) 
      {
			System.err.println("USAGE: java Paths <vertex_file> <edge_file>");
			System.exit(1);
		}

		MyGraph g = readGraph(args[0],args[1]);

		Scanner console = new Scanner(System.in);
		Collection<Vertex> v = g.vertices();
      Collection<Edge> e = g.edges();
		System.out.println("Vertices are " + v);
		System.out.println("Edges are " + e);
		while(true) 
      {
			System.out.print("Start vertex? ");
			Vertex start = new Vertex(console.nextLine());
			if(!v.contains(start)) 
         {
				System.out.println("no such vertex");
				System.exit(0);
			}
         
         // Breadth-First Search
         System.out.println("\nBreadth-First Search");
         g.BreadthFirstSearch(start);
         System.out.println(" ");
         
         // Depth-First Search
         System.out.println("\nDepth-First Search");
         g.DepthFirstSearch(start);
         System.out.println("\n");
         
		}
	}

	// it reads the two files and creates new MyGraph
	public static MyGraph readGraph(String f1, String f2) 
   {
		Scanner s = null;
		try {
			s = new Scanner(new File(f1));
		} catch(FileNotFoundException e1) {
			System.err.println("FILE NOT FOUND: "+f1);
			System.exit(2);
		}

		Collection<Vertex> v = new ArrayList<Vertex>();
		while(s.hasNext())
			v.add(new Vertex(s.next()));

		try {
			s = new Scanner(new File(f2));
		} catch(FileNotFoundException e1) {
			System.err.println("FILE NOT FOUND: "+f2);
			System.exit(2);
		}

		Collection<Edge> e = new ArrayList<Edge>();
		while(s.hasNext()) 
      {
			try {
				Vertex a = new Vertex(s.next());
				Vertex b = new Vertex(s.next());
				e.add(new Edge(a,b));
			} catch (NoSuchElementException e2) {
				System.err.println("EDGE FILE FORMAT INCORRECT");
				System.exit(3);
			}
		}

		return new MyGraph(v,e);
	}
}
