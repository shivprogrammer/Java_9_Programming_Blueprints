// Lambdas
// The term lambda simply refers to an anonymous function
// Typically, a function (or method, in more proper Java parlance), is a statistically-named artifact in the Java source:

public int add(int x, int y) {
  return x + y;
}

// This simple method is one named add that takes two int parameters as well as returning an int parameter. With the introduction of lambdas, this can now be written as follows:

(int x, int y) -> x + y

// Or, more simply as this:

(x, y) -> x + y

// This abbreviated syntax indicates that we have a function that takes two parameters and returns their sum. Depending on where this lamdba is used, the types of the parameters can be inferred by the compiler, making the second, even more concise format possible. Most importantly though, note that this method is no longer named. Unless it is assigned to a variable or passed as a parameter (more on this later), it can not be referenced -- or used -- anywhere in the system.
