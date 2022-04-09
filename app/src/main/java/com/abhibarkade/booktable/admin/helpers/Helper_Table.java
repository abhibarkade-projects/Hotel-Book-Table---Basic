package com.abhibarkade.booktable.admin.helpers;

import com.abhibarkade.booktable.TableStatus;

public class Helper_Table {
    int no;
    String start_time, end_time, date, user;
    TableStatus tableStatus;

    public Helper_Table() {
    }

    public Helper_Table(int no, String start_time, String end_time, String date, String user, TableStatus tableStatus) {
        this.no = no;
        this.start_time = start_time;
        this.end_time = end_time;
        this.date = date;
        this.user = user;
        this.tableStatus = tableStatus;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }
}
