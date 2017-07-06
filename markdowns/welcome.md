# Welcome!

This playground lists the most common Java pitfalls. I started this contribution because I saw so many young programmers made these kind of mistakes I though it can be useful to share it.

The source code is on [GitHub](https://github.com), please feel free to come up with proposals to enhance this list!

# You cannot modify a String object
@[The Java String class is immutable.]({"stubs": ["src/main/java/com/yourself/StringMistakes.java"], "command": "com.yourself.StringTests#immutable"})

Actually you can update a String object using introspection but I've never seen a good reason to do that.