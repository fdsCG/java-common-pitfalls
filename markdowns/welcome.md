# Welcome!

This playground lists the most common Java pitfalls. I started this contribution because I saw so many young programmers made the following mistakes I though it can be useful to share it to people learning Java.

The source code is on [GitHub](https://github.com), please feel free to come up with proposals to fill up this list!

# The Java String class is immutable.
@[No, you can't modify a String object]({"stubs": ["src/main/java/com/yourself/Pitfalls.java"], "command": "com.yourself.PitfallsRunner#immutable"})

Actually it's possible to update a String object using introspection but I've never seen a good reason to do that.