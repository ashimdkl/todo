/**
 * Represents a to-do item with a description and a completed status.
 */
public class Todo {
    private String description;
    private boolean isCompleted;

    /**
     * Constructs a new Todo item.
     * @param description The description of the to-do item.
     */
    public Todo(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    /**
     * Returns the description of the to-do.
     * @return The description of the to-do.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the to-do.
     * @param description The new description of the to-do.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the completion status of the to-do.
     * @return true if the to-do is completed, false otherwise.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Sets the to-do's completion status.
     * @param completed The completion status to set.
     */
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    /**
     * Returns a string representation of the to-do item.
     * @return A string representation of the to-do.
     */
    @Override
    public String toString() {
        return "Todo: " + description + " [Completed: " + isCompleted + "]";
    }
}
