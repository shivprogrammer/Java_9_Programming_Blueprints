/*
REPL
Java 9 sports the addition of a REPL (Read-Eval-Print-Loop), a fancy term for a language shell. In fact, the command for this new tool is: jshell. This tool allows us to type or past in Java code and get immediate feedback.
*/

// For example, if we wanted to experiment with the Streams API discussed in the preceding section, we could do something like this:

// THIS IS IN THE COMMAND LINE

jshell
// | Welcome to JShell -- Version 9-ea
// | For an introduction type: /help intro

jshell> /* what the command cursor will look like */
List<String> names = Array.asList(new String[]{"Tom", "Bill", "Xavier", "Sarah", "Adam"});
// names ==> [Tom, Bill, Xavier, Sarah, Adam]

jshell> names.stream().sorted().forEach(Sytem.out::println);
// Adam
// Bill
// Sarah
// Tom
// Xavier
