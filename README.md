# Library Management System (Java)

A menu-driven console application for managing a small library catalog, built in Java as a team project for an Information Systems course at UNLV.

## Features

- Add and remove books by ISBN
- Search by title, author, or ISBN
- Display every book with its availability status
- Check out and return books
- Load a book list from a comma-separated text file

## How to run

Requires Java 8 or later.

```bash
javac -d out src/*.java
java -cp out Main
```

Choose option **7** and enter `books.txt` to load the sample catalog.

## Project structure

| File | Purpose |
|------|---------|
| `src/Book.java` | Book model: title, author, ISBN, publication year, availability |
| `src/Library.java` | Stores books in an `ArrayList` and handles add, remove, search, display, checkout, return, and file loading |
| `src/Main.java` | Menu-driven program that reads user input with `Scanner` and calls the `Library` methods |
| `books.txt` | Sample data in `title,author,ISBN,year` format |

## Concepts used

Object-oriented design and encapsulation, `ArrayList` collections, file I/O with `BufferedReader`, input handling with `Scanner`, and exception handling.

## My contributions

I wrote the `Book` class, the `addBook` and `removeBook` methods in `Library`, and the main menu program in `Main.java`. Teammates' sections are marked with comments in the code.
