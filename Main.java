package com.company;

import com.company.linkedList.LinkedList;
import com.company.set.Set;
import com.company.set.SetImpl;

public class Main {

    public static void main(String[] args) {
        /*LinkedList<Integer> listInt = new LinkedList<>();
        listInt.addAtTail(3);
        listInt.addAtTail(1);
        listInt.addAtTail(8);
        listInt.addAtTail(14);

        while(listInt.iterator().hasNext()){
            System.out.println(listInt.iterator().next());
        }*/

        SetImpl<Integer> intSet = new SetImpl<>();
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(7);
        intSet.add(7);
        intSet.add(10);
        intSet.add(14);
        intSet.add(44);
        intSet.add(54);
        intSet.add(64);
        intSet.add(74);
        intSet.add(84);
        intSet.add(94);
        intSet.add(35);
        intSet.add(36);
        intSet.add(33);
        intSet.add(32);
        intSet.add(31);
        intSet.add(37);
        intSet.add(38);
        intSet.add(39);
        intSet.add(341);
        intSet.add(342);
        intSet.add(343);
        intSet.add(344);
        intSet.add(345);
        intSet.add(346);
        intSet.add(347);
        intSet.add(348);
        intSet.add(349);
        intSet.add(3499);
        intSet.add(3412);
        intSet.add(3433);
        intSet.add(3421);
        intSet.add(3411);
        intSet.add(134);
        intSet.add(234);
        intSet.add(334);
        intSet.add(434);
        intSet.add(534);
        intSet.add(634);
        intSet.add(734);
        intSet.add(834);
        intSet.add(9834);
        intSet.add(2134);
        intSet.add(3234);
        intSet.add(344343);
        intSet.add(3884);
        intSet.add(34555);
        intSet.add(3488);
        intSet.add(34454);
        intSet.add(3465);
        intSet.add(3324);
        intSet.add(23234);
        intSet.print();

    }
}
