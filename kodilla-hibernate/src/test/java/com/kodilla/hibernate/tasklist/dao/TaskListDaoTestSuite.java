package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;


    private static final String LISTNAME = "What To Do";
    private static final String DESCRIPTION_1 = "first Task";
    private static final String DESCRIPTION_2 = "second Task";

    @Test
    void findByListName() {
        TaskList taskList1 = new TaskList(LISTNAME,DESCRIPTION_1);
        TaskList taskList2 = new TaskList(LISTNAME,DESCRIPTION_2);
        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);
        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        assertEquals(2, readTaskList.size());
        assertEquals(LISTNAME, readTaskList.get(0).getListName());
        assertEquals(LISTNAME, readTaskList.get(1).getListName());

        //CleanUp

      //  taskListDao.deleteById(taskList1.getId());
       // taskListDao.deleteById(taskList2.getId());


    }
}