package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(01,"Jan",'M', LocalDate.of(1983,2,24),10));
        userList.add(new ForumUser(02,"Zbyszek",'M', LocalDate.of(2001,5,15),40));
        userList.add(new ForumUser(03,"Zosia",'F', LocalDate.of(1965,4,8),80));
        userList.add(new ForumUser(04,"Kuba",'M', LocalDate.of(1999,12,10),100));
        userList.add(new ForumUser(05,"Andzej",'M', LocalDate.of(2001,7,30),8));
        userList.add(new ForumUser(06,"Magda",'F', LocalDate.of(2006,5,25),800));
        userList.add(new ForumUser(07,"Wiktor",'M', LocalDate.of(2004,10,14),0));

    }
    public List<ForumUser>getUserList(){
        return new ArrayList<>(userList);
    }
}
