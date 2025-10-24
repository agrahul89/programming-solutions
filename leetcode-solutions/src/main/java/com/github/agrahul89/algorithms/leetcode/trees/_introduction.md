# Trees
>This package solves leet-code problems for all Tree related data structures. The high level concepts of tree and it's components is detailed below.

A **Tree** is a *hierarchical data structure* connecting a set of nodes together in such a way there are no loops or cycle created between a set of two or more nodes.

## Node
Node is a fundamental component of a tree data structure, representing an entity that holds a value (or key) and pointers to its zero or more nodes.

### Root
Top(Zero) level node having no parent is **ROOT** node of a tree.

### Leaf
A node that has a parent but no child is called a **LEAF** node.

### Ancestor
A node is an ancestor node if it is reachable by repeated proceeding from child to parent.

### Descendant
A node is a descendant node if it is reachable by repeated proceeding from parent to child. 

## Branch
Each node is connected to it's child by an `edge`, known as **BRANCH**.

## Subtree
Each non-root node of a tree can be treated as a tree on it's own which is a sub-tree of it's parent node.
>Any node can be a regarded as a sub-tree as long as it has at least one child node.

## Properties of a Tree
### Breadth
Total number of leaves in a tree.

### Degree
For a tree, any node having maximum number of children is considered as its degree.

### Depth/Height
In a tree, maximum no. of descendants between a root node and leaf node in an ancestral hierarchy is considered it's Height.
>Each node may have it's height defined following the same principal which shall be considered that node's height.

### Level
In a tree, no. of edges starting from root node to a particular node is it's Level.

### Width
Number of nodes in a level of tree is tree width at that level.

## Array representation of Tree
In a tree, if a node is represented as `i`, then it's left child shall be denoted by array index `(2*i)+1` and right child shall be denoted by array index `2*(i+1)`.

## Tree Traversal
Techniques to travel between nodes of a tree.

### Pre Order
Pre-order traversal of a tree follows the `N(ode)L(eft)R(ight)`rule. It can also be represented as angle **ABC** of a triangle, for ease of recollection.

### In Order
In-order traversal of a tree follows the `L(eft)N(ode)R(ight)`rule. It can also be represented as angle **BAC** of a triangle, for ease of recollection.

### Post Order
Pre-order traversal of a tree follows the `L(eft)R(ight)N(ode)`rule. It can also be represented as angle **BCA** of a triangle, for ease of recollection.

### Level Order
Level order traversal of a tree follows the visiting nodes of a tree level by level. In this traversal, first root node is visited, then both it's left and right child is visited following which left child node's children are visited followed by right child node's children visit and so on.

This can be easily achieved by using a queue.
- a visited node is pushed to queue.
- while queue is not empty
	1. visited node is removed from queue as current node.
	2. current node's left and right children are pushed to queue one by one.
	3. steps 1 and 2 are repeated.

## Views of Tree

### Left View
A left view of tree is when a tree is observed from it's side which is to observer's left.

This can be achieved with [Level order](#level-order) traversal.

While doing level-order-traversal, the first encountered node in a particular level is kept in an array at the same index as the level and any further nodes on that level is ignored. Once all levels are traversed, the final contents of array shall depict the left view of that tree.

### Right View
A right view of tree is when a tree is observed from it's side which is to observer's right.

This can be achieved with [Level order](#level-order) traversal.

While doing level-order-traversal, each encountered node in a particular level is (re)placed in an array at an index same as the current level. Once all levels are traversed, the final contents shall depict the right view of that tree.

### Top View

### Bottom View

## Breadth First Search

## Depth First Search
