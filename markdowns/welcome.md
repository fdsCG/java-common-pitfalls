This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Immutability Pitfalls

Immutable means that once an object is created you cannot change the object itself.

@[String example]({"stubs": ["src/main/java/com/yourself/StringImmutable.java"], "command": "com.yourself.PitfallsRunner#stringImmutable"})

You can change the reference to the object to print the expected result this way: `s = s.toUpperCase();`.
To avoid many mistakes just remember all String methods never change the current String object.

Number objects like BigInteger are also immutable.
@[BigInteger example]({"stubs": ["src/main/java/com/yourself/BigIntegerImmutable.java"], "command": "com.yourself.PitfallsRunner#bigIntegerImmutable"})

# Java String objects are immutable.