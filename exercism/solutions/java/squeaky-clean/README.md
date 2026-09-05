# Squeaky Clean

Welcome to Squeaky Clean on Exercism's Java Track.
If you need help running the tests or submitting your code, check out `HELP.md`.
If you get stuck on the exercise, check out `HINTS.md`, but try and solve it without using those first :)

## Introduction

## Chars

### chars

The Java `char` primitive type is a 16 bit representation of a single character.
Multiple `char`s can comprise a string, such as `"word"`, or `char`s can be processed independently.
A `char` literal is surrounded by single quotes (e.g. `'A'`).

```java
char lowerA = 'a';
char upperB = 'B';
```

### Getting the `char`s of a `String`

The `String.toCharArray` method returns a String's chars as an array.
As mentioned in arrays, you can use a `for` loop to iterate over the array.

```java
String text = "Hello";
char[] asArray = text.toCharArray();

for (char ch: asArray) {
    System.out.println(ch);
}

// Outputs:
// H
// e
// l
// l
// o
```

### The Character class

There are many builtin library methods to inspect and manipulate `char`s.
These can be found as static methods of the `java.lang.Character` class.
Here are some examples:

```java
Character.isWhitespace(' ');    // true
Character.isWhitespace('#');    // false

Character.isLetter('a');        // true
Character.isLetter('3');        // false

Character.isDigit('6');         // true
Character.isDigit('?');         // false
```

### Adding a `char` to a `String`

The `+` operator can be used to add a `char` to a `String`.

```java
'a' + " banana"     // => "a banana"
"banana " + 'a'     // => "banana a"
```

~~~~exercism/caution
Becareful _not_ to use `+` to join two `char`s together to form a `String`!
Adding two `char`s this way gives an `int`, _not_ a `String`!
For example:

```java
'b' + 'c';
// => 197 (not the String "bc")
```

This is because Java promotes the `char` to an `int` (see [4.2 Primitive Types and Values ][jls-primitives] of the [Java Language Specification][jls-main]).

[jls-main]: https://docs.oracle.com/javase/specs/jls/se21/html/
[jls-primitives]: https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.2
~~~~

However, when there are many characters to be added, it can be more efficient to use a `StringBuilder` instead:

```java
StringBuilder builder = new StringBuilder();
builder.append('a');
builder.append('b');
builder.append('c');

String builtString = builder.toString();
// => abc
```

## Instructions

In this exercise you will implement a partial set of utility routines to help a developer
clean up SqueakyClean names.

In the 4 tasks you will gradually build up the `clean` method.
A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the `clean` method should treat an empty string as valid.

## 1. Replace any spaces encountered with underscores

Implement the (_static_) `SqueakyClean.clean()` method to replace any spaces with underscores. This also applies to leading and trailing spaces.

```java
SqueakyClean.clean("my   Id");
// => "my___Id"
```

## 2. Convert kebab-case to camelCase

Modify the (_static_) `SqueakyClean.clean()` method to convert kebab-case to camelCase.

```java
SqueakyClean.clean("a-bc");
// => "aBc"
```

## 3. Convert leetspeak to normal text

Modify the (_static_) `SqueakyClean.clean()` method to convert [leetspeak][leet-speak] to normal text.

For simplicity we will only be replacing `4`, `3`, `0`, `1` and `7` with `a`, `e`, `o`, `l`, and `t`, respectively.

```java
SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"
SqueakyClean.clean("4 73s7");
// => "a_test"
```

## 4. Omit characters that are not letters

Modify the (_static_) `SqueakyClean.clean()` method to omit any characters that are not letters.

```java
SqueakyClean.clean("a$#.b");
// => "ab"
```

[leet-speak]: https://en.wikipedia.org/wiki/Leet

## Source

### Created by

- @ystromm

### Contributed to by

- @jagdish-15
- @kahgoh
- @manumafe98
- @mrDonoghue
- @sanderploegsma