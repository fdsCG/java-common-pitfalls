# Welcome!

This playground lists the most common mistakes made by unexperienced Java programmers.
The source code of this playground is on [GitHub](https://github.com), please feel free to come up with proposals to enhance this list!

# Immutable String
The Java String class is immutable. This leads to problems like this one:

@[What is displayed?]({"stubs": ["src/main/java/com/yourself/StringMistakes.java"], "command": "com.yourself.StringTest#immutable"})