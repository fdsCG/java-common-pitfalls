This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Strings immutability

@[Once a String object is created you cannot change the object itself.]({"stubs": ["src/main/java/com/yourself/Pitfalls.java"], "command": "com.yourself.PitfallsRunner#immutable"})

You can change the reference to the object to print the expected result this way: `s = s.toUpperCase();`.
To avoid many mistakes just remember all String methods never change the current String object.

# Java String objects are immutable.