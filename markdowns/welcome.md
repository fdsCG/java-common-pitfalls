![Pitfalls](pitfall.gif "Pitfalls")

This article outlines some of the common mistakes made by Java programmers. Feel free to fill up the list on [GitHub](https://github.com) with other pitfalls.

# Immutability

Immutable means that once an object is created you cannot change the object itself. Java strings are immutable.
@[What does it print?]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

In this example you can update the reference to the object to get the expected result: `s = s.toUpperCase()`.  
`BigInteger`, `BigDecimal` and all the wrapper classes for the primitive types are also immutable.
@[What does it print?]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

To avoid many mistakes just remember **all methods of an immutable object never change the object itself**.

# equals() vs. ==

*Quick reminder*
- The operator `==` returns `true` if both object references point to the same object, `false` otherwise.
- The `equals` method should always return `true` if both objects are equivalent (two objects can be equivalent but do not point to the same object).

For example, if we want to compare strings (to see if they contain the same characters), we need to compare the strings using `equals`.

Saying that, can you guess what the following code prints?
@[What does it print?]({"stubs": ["src/main/java/com/yourself/StringEquality.java"], "command": "com.yourself.PitfallsRunner#stringEquality"})


Isn't it a bit weird?

Even though we are testing the strings the wrong way the results are always `true`. Why? Because any two string literals consisting of the same characters will actually refer the same object (this object is [interned](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#intern()) when the program is loaded). The Java Language Specification also stipulates that string-valued constant expressions that concatenates several string literals are interned as a single literal.

These are the reasons why these tests return `true`.

Some primitive wrapper classes cache some values, example:
@[What does it print?]({"stubs": ["src/main/java/com/yourself/IntegerEquality.java"], "command": "com.yourself.PitfallsRunner#integerEquality"})