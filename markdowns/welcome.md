This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Immutability

Immutable means that once an object is created you cannot change the object itself. Java strings are immutable:
@[]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

`BigInteger`, `BigDecimal` and all the wrapper classes for the primitive types are also immutable:
@[]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

You must update the reference to the object to get the expected result. To avoid many mistakes just remember **all methods of an immutable object never change the object itself**.

# equals(...) vs. ==

equals