package com.abhibarkade.booktable.admin.helpers;

import java.util.List;

public class Helper_Hotel {
    String hotelName, opening_time, closing_time;
    List<Helper_Table> tableList;

    public Helper_Hotel() {
    }

    public Helper_Hotel(String hotelName, String opening_time, String closing_time, List<Helper_Table> tableList) {
        this.hotelName = hotelName;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
        this.tableList = tableList;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getOpening_time() {
        return opening_time;
    }

    public void setOpening_time(String opening_time) {
        this.opening_time = opening_time;
    }

    public String getClosing_time() {
        return closing_time;
    }

    public void setClosing_time(String closing_time) {
        this.closing_time = closing_time;
    }

    public List<Helper_Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Helper_Table> tableList) {
        this.tableList = tableList;
    }
}
