# Time Complexity
## put 
We're inserting to a stack and into an hashtable- both operations is O(1).
## get
We're checking if the key is in the hashtable- O(1), then we'll push it to stack as the 'warmest' and return it's value using get from hash table- both O(1) operations. Overall O(1).
## remove
We're checking if the key is in the hashtable- O(1), if so we're also checking if the value is the the 'warmest' using get from hashtable and peak from stack- both O(1). In that case we'll remove from stack as well as from the hashtable. Overall O(1).
## getWarmest
Checks that data structure isn't empty and returns value from stack using peek- both O(1) operations. Overall O(1).
