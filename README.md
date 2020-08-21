# SudokuTest
this code is the Sudoku Solution Validator and corresponds to a technical challenge has a build in docker with java 8


# Build the image with docker

```bash
$ docker build -f Dockerfile -t demo/oracle-java:8 .
```

# Compile the solution 

```bash
$ docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 javac SudokuValidator.java
```

# Run the Solution 

```bash
$ docker run --rm -v $PWD:/app -w /app demo/oracle-java:8 java SudokuValidator
```
