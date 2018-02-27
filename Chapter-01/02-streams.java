/*
Streams

The other major addition in Java 8, and, perhaps where lambdas shine the brightest, is the new Streams API. The Streams API allows the Java developer to interact with a stream of data elements via a sequence of steps.

Let's say you have a list of grades for a particular class. You would like to know what the average grade is for the girls in the class. Prior to Java 8, you might have written something like this:
*/

double sum = 0.0;
int count = 0;
for (Map.Entry<Student, Integer> g : grades.entrySet()) {
  if ("F".equals(g.getKey().getGender())) {
    count++;
    sum += g.getValue();
  }
}
double avg = sum / count;

// We initialize two variables, one to store the sums and one to count the number of hits. Next, we loop through the grades. If the student's gender is female, we increment our counter and update the sum. When the loop terminates, we then have the information we need to calculate the average. This works, but its verbose.

// The new Streams API can help with that:
double avg = grades.entrySet().stream()
.filter(e -> "F".equals(e.getKey().getGender())) // 1
.mapToInt(e -> e.getValue()) // 2
.average() // 3
.getAsDouble(); // 4

/*
The purpose of this code is much clearer. With streams, we have a clear, declarative means to express application logic. For each entry in the map do the following:
1) Filter out each entry whose gender is not F
2) Map each value to the primitive int
3) Average the grades.
4) Reutrn the value as a double.
*/

// With the stream-based and lambda-based approach, we don't need to declare temporary, intermediate variables (grade count and total), and we don't need to worry about calculating the admittedly simply average. The JDK does all of the heavy-lifting for us.

/*
Java 8 also has included the exciting new date/time API.
java.util.Calendar is awful apparently
So Java 8 incorporated the date time mechanisms of something called Joda Time
*/

// With Java 8, interfaces can now specify a default method on the interface definition, which the compiler will use for the method implementation if the extending class does not provide one. Let's take the following piece of code as an example:

public interface Speaker {
  void saySomething(String message);
}
public class SpeakerImpl implements Speaker {
  public void saySomething(String message) {
    System.out.println(message);
  }
}

// Default methods allow us to extend the interface and avoid the breakage by defining an implementation:
public interface Speaker {
  void saySomething(String message);
  default public void sayHello() {
    System.out.println("Hello");
  }
  default public void sayGoodbye() {
    System.out.println("Good Bye");
  }
}

// Now, when users update their library JARs, they immediately gain these new methods and their behavior, without making any changes. Of course, to use these methods, the users will need to modify their code, but they need not do so until -- and if -- they want to.
