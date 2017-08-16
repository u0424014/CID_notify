package com.cid_notify.cid_notify;



public class Record {
    String phoneNum;
    String number_info;
    String time;
    String date;

    public String getNumber_info() {
        return number_info;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getTime(){
        return time.substring(0,5);
    }
    public String getDate() {
        return date;
    }
}
