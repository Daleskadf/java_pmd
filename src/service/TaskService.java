package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public boolean completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(!task.isCompleted());  // Toggle completion status
            return true;
        }
        return false;
    }

    public boolean deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        }
        return false;
    }

    public boolean editTask(int index, String newTitle) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setTitle(newTitle);
            return true;
        }
        return false;
    }
}
