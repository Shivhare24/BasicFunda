/*
 * Java Program to create a Binary Expression Tree and also evaluating it's expression.
 */
package com.datastructure.pkg;

import java.util.Stack;

class Node1 {
	String value;
	Node1 left;
	Node1 right;

	Node1(String value) {
		this.value = value;
		right = null;
		left = null;
	}
}

public class BinaryExpressionTree {

	static Stack<Node1> stack = new Stack<Node1>();

	public static void main(String[] args) {
		String[] s = {"5", "4", "*", "20", "100", "-", "+"};
		Node1 output = createBinaryExpressionTree(s);
		int n = evaluateBinaryExpressionTree(output);
		System.out.println(n);
		inOrder(output);
	}

	public static void inOrder(Node1 node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.value);
			inOrder(node.right);

		}
	}

	public static boolean isOperator(String s) {
		if ((s.equalsIgnoreCase("+")) || (s.equalsIgnoreCase("-"))
				|| (s.equalsIgnoreCase("*")) || (s.equalsIgnoreCase("/"))
				|| (s.equalsIgnoreCase("^")))
			return true;
		return false;
	}

	private static Node1 createBinaryExpressionTree(String[] s) {
		Node1 node;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				if (!isOperator(s[i])) {
					node = new Node1(s[i]);
					stack.push(node);
				} else {

					node = new Node1(s[i]);
					node.left = (Node1) stack.pop();
					node.right = (Node1) stack.pop();
					stack.push(node);
				}
			} ;
		}
		return stack.peek();
	}

	public static int evaluateBinaryExpressionTree(Node1 node) {
		if (node == null) {
			return 0;
		}

		if ((node.left == null) && (node.right == null)) {
			return Integer.parseInt(node.value);
		}

		int left = evaluateBinaryExpressionTree(node.left);
		int right = evaluateBinaryExpressionTree(node.right);

		if (node.value == "+") {
			return left + right;
		}

		if (node.value == "-") {
			return left - right;
		}

		if (node.value == "*") {
			return left * right;
		}

		if (node.value == "/") {
			return left / right;
		}
		return 0;
	}
}
