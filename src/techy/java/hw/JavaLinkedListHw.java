package techy.java.hw;

import java.util.LinkedList;

public class JavaLinkedListHw {


    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Joy");
        al.add("Rafi");
        al.add("Kamal");
        al.add("Jony");

        System.out.println(al.getLast());
        System.out.println(al.remove(2));
        System.out.println(al.add("Tauhid"));

    }
}

