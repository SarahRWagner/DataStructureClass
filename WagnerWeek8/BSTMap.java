/** Sarah Wagner Week Seven Assignments
   Problem 10D Implemenation Class 
   Hi Jason! I added the corrections from your email. I understand now what you mean by calling the BST methods
   directly. I'm not sure if I'm completely using the BST, but I'm getting a better understanding of nesting different
   data structures in each other now. Thank you again for looking over everything and emailing back so fast! **/

import ch08.maps.*;
import ch07.trees.*;
import java.util.*;

public class BSTMap < K, V > implements MapInterface < K, V >
{
	protected BinarySearchTree < MapEntry < K,V >> map;

   // Implement the map as a BST
	public BSTMap()
	{
		map = new BinarySearchTree < MapEntry < K, V >> ();
	}

   //Iterator required to run
	public Iterator < MapEntry < K,V >> iterator()
	{
		return null;
	}

	public V put( K k, V v )
	// If an entry in this map with key k already exists then the value 
	// associated with that entry is replaced by value v and the original
	// value is returned; otherwise, adds the (k, v) pair to the map and
	// returns null.
	{
		if ( k == null ) // Key can't point to null become it wouldn't exist without a value
		{
			throw new IllegalArgumentException( "Maps do not allow null keys." );
		}

		MapEntry < K, V > entry = new MapEntry < K, V > ( k, v ); // Create the entry 

		MapEntry < K, V > temp = map.get( entry ); // Holds the entry you're removing

		if ( temp == null ) // There's there so just add the new entry into the map
		{
			map.add( entry ); // Call the BST method directly
		}
		else
		{
			V oldValue = temp.getValue(); // Save the old value so it can be returned
			temp.setValue( v ); // Set the new value 
			return oldValue; // Return the old value
		}

		return null;
	} // end of put method

	public V get( K k )
	// If an entry in this map with a key k exists then the value associated 
	// with that entry is returned; otherwise null is returned.
	{
		if ( k == null ) 
			throw new IllegalArgumentException( "Maps do not allow null keys." );

		for ( MapEntry < K, V > temp: map ) // Loop through the entires
			if ( temp.getKey().equals( k ) ) // if the key matches another key in the entries
				return temp.getValue(); // return that value

		return null;
	}

	public V remove( K k )
	// If an entry in this map with key k exists then the entry is removed
	// from the map and the value associated with that entry is returned;
	// otherwise null is returned.
	{
		if ( k == null ) 
			throw new IllegalArgumentException( "Maps do not allow null keys." );

		for ( MapEntry < K, V > temp: map ) // Again loop through the entries 
			if ( temp.getKey().equals( k ) ) // See if the key matches another entry
			{
				map.remove( temp ); // If they are equal call the BST remove method
				return temp.getValue(); // Return the value you're removing
			}

		return null;
	}

	public boolean contains( K k )
	// Returns true if an entry in this map with key k exists;
	// Returns false otherwise.
	{
		if ( k == null )
			throw new IllegalArgumentException( "Maps do not allow null keys." );

		for ( MapEntry < K, V > temp: map ) // Loop through the entries
			if ( temp.getKey().equals( k ) ) // If the key matches another key in the entries
				return true; // k found, exits method

		// No entry is associated with k.
		return false;
	}

	public boolean isEmpty()
	// Returns true if this map is empty; otherwise, returns false.
	{
		return ( map.size() == 0 ); // uses ArrayList size
	}

	public boolean isFull()
	// Returns true if this map is full; otherwise, returns false.
	{
		return false; // An ArrayListMap is never full
	}

	public int size()
	// Returns the number of entries in this map.
	{
		return map.size(); // uses ArrayList size
	}

}