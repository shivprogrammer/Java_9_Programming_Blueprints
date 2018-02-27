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

// A better example of this might be in one of the many APIs where the method's parameter is an implementation of what is known as a Single Abstract Method (SAM) interface, which is, at least until Java 8, an interface with a single method. One of the canonical examples of a SAM is Runnable. Here is an example of the pre-lambda Runnable usage:

Runnable r = new Runnable() {
  public void run() {
    System.out.println("Do some work");
  }
};
Thread t = new Thread(r);
t.start();

// With Java 8 lambdas, this code can be vastly simplified to this:

Thread t = new Thread(() ->
  System.out.println("Do some work"));
t.start();
