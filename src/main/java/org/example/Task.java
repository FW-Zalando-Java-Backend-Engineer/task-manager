package org.example;


/**
 * Represents a Task in a task management system.
 */
public class Task {
    // Fields, variables, Properties, the state :
    private final String description;
    private final boolean isCompleted;
    private final int priority;

    public Task(String description, boolean isCompleted, int priority) {
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    // Getters

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", priority=" + priority +
                '}';
    }
}
