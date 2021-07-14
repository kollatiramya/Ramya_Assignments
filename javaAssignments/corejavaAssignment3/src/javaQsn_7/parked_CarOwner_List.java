package javaQsn_7;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class parked_CarOwner_List
{
    List<parked_CarOwner_Details> list;
    List<Integer> Tokens;
    static int tokenNo;
    
    static {
        parked_CarOwner_List.tokenNo = 0;
    }
    
    public parked_CarOwner_List() {
        this.list = new ArrayList<parked_CarOwner_Details>();
        this.Tokens = new ArrayList<Integer>();
    }
    
    public void add_new_car(final parked_CarOwner_Details obj) {
        this.list.add(obj);
        ++parked_CarOwner_List.tokenNo;
        this.Tokens.add(parked_CarOwner_List.tokenNo);
        System.out.println(this.Tokens);
        System.out.println("Car Added Sucessfully");
        System.out.println("Your Token Number is " + parked_CarOwner_List.tokenNo);
    }
    
    public void remove(final int regno, final int token) {
        int flag = 0;
        for (final parked_CarOwner_Details p : this.list) {
            if (p.getCarNo() == regno) {
                flag = 1;
                this.list.remove(p);
                System.out.println(p);
                System.out.println("Car Removed Sucessfully");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("no cars found");
        }
    }
    
    public void get_parked_car_location(final int token) {
        int flag = 0;
        for (final Integer i : this.Tokens) {
            if (i == token) {
                flag = 1;
                int n = token % 20;
                if (n == 0) {
                    n = 20;
                }
                if (token <= 80) {
                    System.out.println("First Floor");
                    if (token <= 20) {
                        System.out.println("Segment First and slot " + n);
                    }
                    if (token > 20 && token <= 40) {
                        System.out.println("Segment Second and slot " + n);
                    }
                    if (token > 40 && token <= 60) {
                        System.out.println("Segment Third and slot " + n);
                    }
                    if (token > 60 && token <= 80) {
                        System.out.println("Segment Fourth and slot " + n);
                    }
                }
                if (token > 80 && token <= 160) {
                    System.out.println("Second Floor");
                    if (token > 80 && token <= 100) {
                        System.out.println("Segment First and slot " + n);
                    }
                    if (token > 100 && token <= 120) {
                        System.out.println("Segment Second and slot " + n);
                    }
                    if (token > 120 && token <= 140) {
                        System.out.println("Segment Third and slot " + n);
                    }
                    if (token > 140 && token <= 160) {
                        System.out.println("Segment Fourth and slot " + n);
                    }
                }
                if (token <= 160) {
                    continue;
                }
                System.out.println("Third Floor");
                if (token > 160 && token <= 180) {
                    System.out.println("Segment First and slot " + n);
                }
                if (token > 180 && token <= 200) {
                    System.out.println("Segment Second and slot " + n);
                }
                if (token > 200 && token <= 220) {
                    System.out.println("Segment Third and slot " + n);
                }
                if (token <= 220) {
                    continue;
                }
                System.out.println("Segment Fourth and slot " + n);
            }
        }
        if (flag == 0) {
            System.out.println("No Cars Found");
        }
    }
}