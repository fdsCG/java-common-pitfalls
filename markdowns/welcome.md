This playground outlines some of the common mistakes made by beginners in Java. Feel free to contribute on [GitHub](https://github.com) to fill up the list.

# Java String objects are immutable
Once a String object is created you cannot change the object itself, but you can change the reference to the object.

@[You can't modify a String object]({"stubs": ["src/main/java/com/yourself/Pitfalls.java"], "command": "com.yourself.PitfallsRunner#immutable"})

To print the expected string you have to update the reference this way: `s = s.toUpperCase();`.
To avoid many mistakes just remember all String methods never change the current String.

# Java String objects are immutable.