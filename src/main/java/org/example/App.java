package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demo class
 *
 */
public class App {
    public static void main( String[] args ) {
        TaskProcessor processor = new TaskProcessor();

        List<Task> tasks = Arrays.asList(
                new Task("Buy groceries", false, 1),
                new Task("Walk the dog", true, 2),
                new Task("Read a book", false, 3)
        );

        // Filter tasks using lambda expression
        List<Task> pendingTasks = processor.filterTasks(tasks, task -> !task.isCompleted());
        //        task -> {
        //            // do this
        //            // then do that
        //            return !task.isCompleted();
        //        }


        // Store tasks description using method reference
        List<String> descriptions = processor.mapTasks(pendingTasks,Task::getDescription);
        // task -> task.getDescription()


        // Print all tasks using a stream
       /* descriptions
               // .stream() : this is optional. not bad, not good to use it here
                .forEach(
                      System.out::println
                   // task -> System.out.println("Task -> " +task.getDescription())
                );*/


        // Converting numbers to strings
        List<Integer> nums = List.of(1, 2, 3);
        List<String> asStrings = nums.stream()
                .map(number -> "Number: "+number)
                .collect(Collectors.toList());

        System.out.println(asStrings);
    }
}
