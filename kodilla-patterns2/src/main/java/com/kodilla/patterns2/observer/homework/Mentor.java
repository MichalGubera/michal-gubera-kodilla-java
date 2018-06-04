package com.kodilla.patterns2.observer.homework;


public class Mentor implements TasksObserver {
    private final String mentorName;
    private final String mentorLastname;
    private int updateCount;

    public Mentor(String mentorName, String mentorLastname) {
        this.mentorName = mentorName;
        this.mentorLastname = mentorLastname;
    }

    @Override
    public String toString() {
        return mentorName + " " + mentorLastname;
    }

    @Override
    public void update(TasksCollection tasksCollection) {
        System.out.println(toString() + ": New task in " + tasksCollection.getTaskName() +
                ", from: " + tasksCollection.getStudent() +
                " (total: " + tasksCollection.getTasks().size() + " task(s) awaiting);");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
