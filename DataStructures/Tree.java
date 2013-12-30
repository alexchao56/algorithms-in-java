package DataStructures;

/**A tree is a data structure consisting of nodes organized as a hiearachy.
 * It can be recursively defined as a collection of nodes (starting at a root node)
 * together with a list of nodes ("children"). Each node contains a value and cannot be duplicated.
 * A tree can be defined abstractly or as an ordered tree, with a value assigned to each node.
 *
 * @author Alex Chao
 */

public interface Tree<T> {

	/** Adds VALUE to the tree. Trees can have multiple values.
	 * Returns True if tree is successfully added. */
	public boolean add(T value);

	/** Checks if the tree contains VALUE. */
	public boolean contains(T value);

	/** Removes the first occurence of VALUE in the tree. */
	public T remove(T value);

	/** Returns the number of nodes in the tree. */
	public int size();

	/** Validates the tree according to its invariants. */
	public boolean validate();

	/** Get Tree as a Java compatible Collection */
	public java.util.collection<T> toCollection();
}