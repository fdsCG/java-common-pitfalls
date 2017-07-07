# Welcome!

This playground lists the most common Java pitfalls. I started this contribution because I saw many young programmers doing the same mistakes every time I though it can be useful to share it.

This playground is on [GitHub](https://github.com), please feel free to come up with proposals to fill up the list.

# Java String objects are immutable.
Once a String object is created you cannot change the object itself, but you can change the reference to the object.

@[You can't modify a String object]({"stubs": ["src/main/java/com/yourself/Pitfalls.java"], "command": "com.yourself.PitfallsRunner#immutable"})

To print the expected string you have to update the reference to the new String object returned by the method `toUpperCase` this way: `s = s.toUpperCase();`.
If you remember all String methods never change the current String, then you can avoid many beginner's mistakes.

# Java String objects are immutable.