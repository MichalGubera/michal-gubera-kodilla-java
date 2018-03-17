package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("products for renovation", "wall paint", 1);
            case PAINTING:
                return new PaintingTask("cover old spots", "grey", "bedroom");
            case DRIVING:
                return new DrivingTask("bring renovation stuff", "Castorama", "van");
            default:
                return null;
        }
    }
}
