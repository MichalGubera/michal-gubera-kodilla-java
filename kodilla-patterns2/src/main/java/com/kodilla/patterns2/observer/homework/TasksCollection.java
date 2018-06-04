package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TasksCollection implements TasksObservable {
    private final List<TasksObserver> observers;
    private final Queue<String> tasks;
    private final String taskName;
    private final Student student;

    public TasksCollection(String taskName, Student student) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.taskName = taskName;
        this.student = student;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TasksObserver tasksObserver) {
        observers.add(tasksObserver);
    }

    @Override
    public void notifyObservers() {
        for (TasksObserver tasksObserver : observers) {
            tasksObserver.update(this);
        }
    }

    @Override
    public void removeTaskObserver(TasksObserver tasksObserver) {
        observers.remove(tasksObserver);
    }

    public List<TasksObserver> getObservers() {
        return observers;
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getTaskName() {
        return taskName;
    }

    public Student getStudent() {
        return student;
    }
}
