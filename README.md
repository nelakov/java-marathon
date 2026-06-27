# Java Fundamentals 2021

> A 19-day, hands-on Java learning marathon, one package per day, working from
> language basics through object-oriented design, collections, file I/O and recursion,
> and finishing with a console **diploma project**. Each day is a self-contained set of
> exercises focused on one core topic.

![Java](https://img.shields.io/badge/Java-25-orange)
![Build](https://img.shields.io/badge/build-Maven-blue)
![Tests](https://img.shields.io/badge/tests-JUnit%206-green)

---

## Overview

The project is a structured curriculum: each `dayN` package solves a focused set of tasks
that build on the previous day. There is **no shared application and no single entry point**.
Every exercise is an independent program with its own `main()` (~52 of ~92 source files).
This makes each solution easy to run and reason about in isolation.

It moves from console I/O and loops through conditionals, arrays, classes and
encapsulation, inheritance and interfaces, collections, domain modeling, file I/O,
2D arrays, and recursion, ending with a maps-based spatial-query application.

## Tech stack

| Area | Choice |
|------|--------|
| Language | Java 25 |
| Build | Maven 3.9+ |
| Testing | JUnit Jupiter 6.1.0, Mockito 5.23.0 *(test scope)* |

## Getting started

**Prerequisites:** JDK 25, Maven 3.9+.

```bash
# Compile every exercise
mvn clean compile

# Run a specific exercise by its fully-qualified class
java -cp target/classes day1.Task4
java -cp target/classes day11.task2.Task2
java -cp target/classes day19.task2.Task2   # diploma project
```

> **Run from the repository root.** Several file-I/O exercises use working-directory-relative
> paths (e.g. `files/shoes.csv`, `src/main/resources/taxi_cars.txt`).

## Repository structure

```
src/main/java/day{0..19}/   exercises, one package per day (multi-part days use sub-packages)
src/main/resources/         runtime input data (dushi.txt, numbers19.txt, taxi_cars.txt)
files/                       sample/working data outside the classpath (shoes.csv, chessBoard.png, result.txt)
day19/task2/                diploma: console taxi-distance program
```

## Curriculum

| Day | Topic | Key concepts |
|-----|-------|--------------|
| [0](#day-0-project-setup) | Project setup | class skeleton |
| [1](#day-1-loops--console-output) | Loops & console output | `while`/`for`, `Scanner`, validation, constants |
| [2](#day-2-conditionals--validation) | Conditionals & validation | `if`/`else`, modulo, `Math.pow` |
| [3](#day-3-control-flow) | Control flow | `switch`, `break`/`continue`, divide-by-zero |
| [4](#day-4-arrays) | Arrays | 1D/2D arrays, `Random`, traversal & aggregation |
| [5](#day-5-classes--objects) | Classes & objects | encapsulation, getters/setters, constructors |
| [6](#day-6-object-interaction) | Object interaction | private fields, object collaboration |
| [7](#day-7-static-members--state) | Static members & state | `static` fields/methods, shared state |
| [8](#day-8-strings--performance) | Strings & performance | `StringBuilder` vs `String`, timing, `toString` |
| [9](#day-9-inheritance-abstraction--interfaces) | Inheritance & abstraction | `super`, abstract classes, polymorphism, functional interface |
| [11](#day-11-interfaces--composition) | Interfaces & composition | `Worker`/combat interfaces, polymorphism |
| [12](#day-12-collections) | Collections | `ArrayList`/`List`, generics, filtering |
| [13](#day-13-domain-modeling-messaging) | Domain modeling: messaging | composition, `ArrayList`, `Date` |
| [14](#day-14-file-input--parsing) | File input & parsing | `Scanner`, try-with-resources, exceptions |
| [15](#day-15-csv-processing) | CSV processing | `Scanner`/`PrintWriter`, DTO |
| [16](#day-16-file-io--statistics) | File I/O & statistics | method chaining, batch processing |
| [17](#day-17-2d-arrays--chess) | 2D arrays & chess | enums, 2D arrays, board rendering |
| [18](#day-18-recursion--trees) | Recursion & trees | recursion, binary search tree |
| [19](#day-19-maps--text-processing) | Maps & text processing | `HashMap`, `Comparator`, file parsing |

> *(There is no `day10`.)*

---

### Day 0: Project setup
Empty entry point establishing the package/class skeleton for the marathon.
**Run:** `day0.Task1`

### Day 1: Loops & console output
First contact with iteration and user input.
- **Task1 / Task2 / Task3:** print `JAVA` ten times using a `while` loop, a `for` loop, and on separate lines.
- **Task4 / Task5:** validate an Olympic year (1980–2020) and list subsequent Olympic years in 4-year steps (`while` and `for` variants).
- **Task6:** print the multiplication table for a number entered by the user.
- **Concepts:** `while`/`for` loops, `Scanner` input, range validation, named constants, `printf`.
**Run:** `day1.Task1` … `day1.Task6`

### Day 2: Conditionals & validation
- **Task1:** classify a building by floor count (low-rise / medium-rise / multistory).
- **Task2 / Task3:** print numbers divisible by 5 but not 10 within a range (`for` and `while`).
- **Task4:** evaluate a piecewise mathematical function of the input.
- **Concepts:** `if`/`else` chains, modulo, `Math.pow`, input guards.
**Run:** `day2.Task1` … `day2.Task4`

### Day 3: Control flow
- **Task1:** map a city name to its country with a `switch`.
- **Task2:** repeatedly divide two inputs, stopping (`break`) when the divisor is zero.
- **Task3:** perform five divisions, skipping (`continue`) a zero divisor.
- **Concepts:** `switch`, `break`/`continue`, divide-by-zero handling.
**Run:** `day3.Task1` … `day3.Task3`

### Day 4: Arrays
- **Task1:** count elements `> 8`, `== 1`, and even values in a random 10-element array.
- **Task2:** find min/max in a 100-element array; count multiples of 10 and their sum.
- **Task3:** find the row with the maximum sum in a 12×8 matrix.
- **Task4:** find the start index of the three consecutive elements with the largest sum.
- **Concepts:** 1D/2D arrays, `Random`, enhanced `for`, aggregation.
**Run:** `day4.Task1` … `day4.Task4`

### Day 5: Classes & objects
- **Task1:** build a `Car` via setters and print its details.
- **Task2:** build a `Motorbike` via its constructor and read its properties.
- **Concepts:** encapsulation, getters/setters, constructors, object instantiation.
**Run:** `day5.Task1`, `day5.Task2`

### Day 6: Object interaction
- **Task2:** create a `Plane`, mutate its state, refuel, and print its information.
- **Task3:** a `Teacher` evaluates a `Student`, assigning a random grade.
- **Concepts:** private fields, constructors, collaborating objects, `Random`.
**Run:** `day6.Task2`, `day6.Task3`

### Day 7: Static members & state
- **Player:** a football-roster simulation: players take seats up to a limit and lose stamina, tracked through a shared `static` counter.
- **Plane:** a `static` method comparing two aircraft by length.
- **Concepts:** `static` fields/methods, instance vs. shared state, control flow.
**Run:** `day7.Player`

### Day 8: Strings & performance
- **Task1:** append 20,000 integers using `StringBuilder` vs. `String` concatenation and time both, demonstrating why immutability matters.
- **Task2:** produce formatted `Plane` output via `StringBuilder` and an overridden `toString()`.
- **Concepts:** `StringBuilder`, string immutability, performance timing, `toString`.
**Run:** `day8.Task1`, `day8.Task2`

### Day 9: Inheritance, abstraction & interfaces
- **task1:** `Human` superclass with `Student`/`Teacher` subclasses overriding `printInfo()` and reusing the parent via `super`.
- **task2:** an abstract `Figure` hierarchy (`Circle`, `Rectangle`, `Triangle`) computing area and perimeter; red-coloured shapes are filtered and summed via a `ToDoubleFunction` functional interface.
- **Concepts:** inheritance, `super`, abstract classes & methods, polymorphism, functional interfaces.
**Run:** `day9.task1.Task1`, `day9.task2.TestFigures`

### Day 11: Interfaces & composition
- **task1:** a warehouse model where `Picker` and `Courier` implement a `Worker` interface and earn a bonus once an order threshold is reached.
- **task2:** an RPG combat system: a `Hero` base class with `MagicAttack`, `PhysAttack`, and `Healer` interfaces driving attacks and healing between heroes.
- **Concepts:** interfaces, inheritance, polymorphism, shared constants, state management.
**Run:** `day11.task1.Task1`, `day11.task2.Task2`

### Day 12: Collections
- **task1:** basic `ArrayList` operations (add, remove, insert).
- **task2:** collect even numbers from ranges into a `List`.
- **task3:** filter `MusicBand`s by founding year.
- **task4 / task5:** transfer members between bands' lists, including a generic `MusicArtist` model.
- **Concepts:** `ArrayList`/`List`, generics, iteration, filtering, static helpers.
**Run:** `day12.task1.Task1` … `day12.task5.Task5`

### Day 13: Domain modeling: messaging
A small social-messaging model: `User`s exchange `Message`s stored in a `MessageDatabase`,
with the ability to print the dialog history between two users and track subscriptions.
- **Concepts:** object composition, `ArrayList`, `Date`, a static in-memory store, filtering.
**Run:** `day13.Task1`

### Day 14: File input & parsing
- **ReadingFromFile:** read space-separated integers from a file into an array.
- **task1:** read and sum integers from a file, with validation.
- **task2 / task3:** parse and validate person records from a file into objects.
- **Concepts:** `Scanner` file I/O, try-with-resources, `IOException`/`FileNotFoundException`, parsing & validation.
**Run:** `day14.ReadingFromFile`, `day14.task1.Task1`, `day14.task2.Task2`, `day14.task3.Person`

### Day 15: CSV processing
**Task1** parses `files/shoes.csv` (name, size, count) and writes the out-of-stock items
(`count == 0`) to `files/result.txt`.
- **Concepts:** `Scanner`/`PrintWriter` with try-with-resources, a `Shoes` DTO, exception handling.
**Run:** `day15.Task1`

### Day 16: File I/O & statistics
- **Task1:** read space-separated numbers and print the arithmetic mean to three decimals.
- **Task2:** write 1,000 random numbers, compute batch means (groups of 20), then sum and print the results, using a fluent method-chaining API.
- **Concepts:** file I/O, method chaining, batch processing, `Random`.
**Run:** `day16.Task1`, `day16.Task2`

### Day 17: 2D arrays & chess
- **Task1:** print fixed sequences of chess pieces from enum representations.
- **Task2:** render a full 8×8 chess board from a 2D array, with labeled rows and columns.
- **Concepts:** enums, 2D arrays, `StringBuilder`, board visualization.
**Run:** `day17.Task1`, `day17.Task2`

### Day 18: Recursion & trees
- **Task1:** recursively sum an array's elements.
- **Task2:** recursively count occurrences of the digit 7 in an integer.
- **Task3:** build a binary search tree from an unsorted array and print it in order.
- **Concepts:** recursion (base case + accumulation), binary search trees, in-order traversal.
**Run:** `day18.Task1`, `day18.Task2`, `day18.Task3`

### Day 19: Maps & text processing
- **Task1:** read a text file, count word frequencies in a `HashMap`, sort by frequency (descending) with a `Comparator`, and print the ranked list.
- **task2:** the **diploma project** (see below).
- **Concepts:** `HashMap`, `Comparator`, delimited parsing, try-with-resources.
**Run:** `day19.Task1`, `day19.task2.Task2`

---

## Diploma project: Taxi spatial query

`day19/task2` is the capstone console application.

- **Input:** `src/main/resources/taxi_cars.txt`, one taxi per line as `id x y`, loaded into a `HashMap<Integer, Point>`.
- **Interaction:** prompts for the two opposite corners of a rectangular search zone.
- **Computation:** normalizes the corners into an axis-aligned bounding box (handling either input order) and tests each taxi's coordinates against it.
- **Output:** the IDs of all taxis inside the zone, plus the total vehicle count.

It ties together file parsing, `HashMap` storage and iteration, a small `Point` value type,
and coordinate-geometry logic, the kind of point-in-region test behind location features.

**Run:** `java -cp target/classes day19.task2.Task2`

## Conventions & notes

- **One package per day:** same-named classes across days (`Car`, `Plane`, `MusicBand`) are
  independent copies, not shared code.
- **Tests are not committed:** `.gitignore` excludes `/src/test`, so `mvn test` finds nothing
  here despite JUnit/Mockito on the classpath. Tests live locally only.
- **Working-directory-sensitive I/O:** run file-reading exercises from the repository root.
