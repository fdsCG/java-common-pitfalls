This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Immutability

Immutable means that once an object is created you cannot change the object itself. Java strings are immutable:
@[]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

In this example you can update the reference to the object to get the expected result: `s = s.toUpperCase()`.  
`BigInteger`, `BigDecimal` and all the wrapper classes for the primitive types are also immutable:
@[]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

To avoid many mistakes just remember **all methods of an immutable object never change the object itself**.

# equals(...) vs. ==

You know that the operator `==` compares object references (it returns true if the two operands point to the same object, `false` otherwise) while the `equals` method should return `true` if both objects are equivalent.
For example, if you want to compare strings (to see if they contain the same characters), you need to compare the strings using `equals`.