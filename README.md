# Requirements 
Implement the following data structure in the most efficient way:
The items in the data structure are a key-value pairs, the warmest item in the data structure is the last item that was asked for or the recent that was added. Implement in most efficient way
# void put (K key, V value)
Adds an item to the structure
# V get (K k)
Returns the value by key
# V remove (K k)
Removes by key
# V getWarmest()
Returns the warmest item value

#

# Time complexity of the solution
## put 
We're inserting to a stack and into an hashtable- both operations is O(1).
## get
We're checking if the key is in the hashtable- O(1), then we'll push it to stack as the 'warmest' and return it's value using get from hash table- both O(1) operations. Overall O(1).
## remove
We're checking if the key is in the hashtable- O(1), if so we're also checking if the value is the the 'warmest' using get from hashtable and peak from stack- both O(1). In that case we'll remove from stack as well as from the hashtable. Overall O(1).
## getWarmest
Checks that data structure isn't empty and returns value from stack using peek- both O(1) operations. Overall O(1).
