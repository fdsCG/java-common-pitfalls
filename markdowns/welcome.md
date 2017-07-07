# Welcome!

This playground lists the most common Java pitfalls. I started this contribution because I saw many young programmers doing the same mistakes every time I though it can be useful to share it.

This playgroundis on [GitHub](https://github.com), please feel free to come up with proposals to fill up this list!

# The Java String object is immutable.
Once a String object is created you cannot change the object itself, but you can change the reference to the object.

@[No, you can't modify a String object]({"stubs": ["src/main/java/com/yourself/Pitfalls.java"], "command": "com.yourself.PitfallsRunner#immutable"})

To print the expected string you have to update the reference to the new String object returned by the method `toUpperCase`

`s = s.toUpperCase();`.

Actually, it's possible to update a String object using introspection but I've never seen a good reason to do that.