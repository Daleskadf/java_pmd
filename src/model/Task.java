package model;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Método setter para el título
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + title;
    }
}
