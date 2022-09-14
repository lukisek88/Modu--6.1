package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String typeOfTask,
                               String taskName,
                               String colorOrWhereOrWhatToBuy,
                               String whatToPaintOrUsingOrQuantity) {
      return  switch (typeOfTask) {
            case SHOPPING ->new ShoppingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        Double.parseDouble(whatToPaintOrUsingOrQuantity));
            case PAINTING -> new PaintingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        whatToPaintOrUsingOrQuantity);
            case DRIVING ->new DrivingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        whatToPaintOrUsingOrQuantity);
            default -> null;
        };
    }
}