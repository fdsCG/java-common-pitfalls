This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Immutability

Immutable means that once an object is created you cannot change the object itself. Java strings are immutable:
@[]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

In this example you can update the reference to the object to get the expected result: `s = s.toUpperCase()`.  
`BigInteger`, `BigDecimal` and all the wrapper classes for the primitive types are also immutable:
@[]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

To avoid many mistakes just remember **all methods of an immutable object never change the object itself**.

# equals(...) vs. ==

You know that the operator `==` compares object references (it returns `true` if the two operands point to the same object, `false` otherwise) while the `equals` method should return `true` if both objects are equivalent.
For example, if you want to compare strings (to see if they contain the same characters), you need to compare the strings using `equals`.

OK, so can you guess what the following code prints?
@[]({"stubs": ["src/main/java/com/yourself/StringEquality.java"], "command": "com.yourself.PitfallsRunner#stringEquality"})

Even though we are testing the strings the wrong way the results are `true`. Why is that? Because any two string literals consisting of the same characters will actually refer the same object: these objects are "interned" and cached into a shared "string pool" when the code is loaded). This is the reason why the `==` tests return `true`.

The Java Language Specification also stipulates that compile-time constants expressions that concatenates several string literals are equivalent to a single literal.