package org.example;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Processes a list of tasks using functional programming constructs.
 */
public class TaskProcessor {

    /**
     * Filters tasks based on a given predicate.
     */
    public List<Task> filterTasks(List<Task> tasks, Predicate<Task> condition){

        return tasks
                .stream() // Convert the list to a Stream
                .filter(condition)   // Apply the Predicate<Task> condition: condition.test(task), what returns true will remain.
                .collect(Collectors.toList());  // Collect the result into a new List
    }

    /**
     * Transforms tasks using a provided mapping function.
     */
    public List<String> mapTasks(List<Task> tasks, Function<Task, String> mapper) {
            return tasks
                    .stream()
                    .map(mapper)
                    .collect(Collectors.toList());
    }
    /**
     * Applies an action to each task (side-effect operation).
     */
    public void processTasks(List<Task> tasks, Consumer<Task> action){
            tasks.forEach(action);
    }
}
