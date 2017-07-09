This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Immutability

Immutable means that once an object is created you cannot change the object itself.
@[String is immutable]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

You can change the reference to the object to print the expected result this way: `s = s.toUpperCase();`.

`Number` objects like `BigInteger` or `BigDecimal` are also immutable.
@[BigInteger and BigDecimal are also immutable]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

To avoid many mistakes just remember **all methods of an immutable object never change the object itself**.

# equals(...) vs. ==

equals