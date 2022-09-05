package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String taskToDo = "tasktodo";
        String taskInProgress = "taskinprogress";
        String taskDone = "taskdone";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);
        //Then
        assertEquals("tasktodo",board.getToDoList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));

        assertEquals("taskinprogress",board.getInProgressList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));

        assertEquals("taskdone",board.getDoneList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
}
}