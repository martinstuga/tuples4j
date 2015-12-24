# tuples4j

This library aims to allow developers use tuples without 2 dimension matrix or create a specific bean to represent each tuple.

It's quite simple to use tuples4j!

Imagine that you need a pair of User and Profile:

<pre>
Pair<User, Profile> myTuple = new Pair<>(userObject, profileObject);
(...)
User user = myTuple.getFirst();
Profile profile = myTuple.getSecond();
</pre>

If you need this pair as a list:
`List<Object> lst = myTuple.asList();`


There is also another helper method that allows you to know if any of the elements are null:

`boolean allElementsFilled = isFullFilled(); //Returns true if all elements of that tuple are not null`

The available classes are:

* Single
* Pair
* Triple
* Quadruple

To lead with tuples with more than 4 columns, probably the best idea is to create a specific bean to represent this tuple.