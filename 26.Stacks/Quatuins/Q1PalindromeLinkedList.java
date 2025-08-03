/* 
Quation: --
 Palindrome Linked List
 We have a singly linked list of characters, write a function that returns true if the given list is a
 palindrome, else false.
 Input : A->B->C->B->A
 Output : Yes It is Palindrome
*/

package Quatuins;

import java.util.LinkedList;
import java.util.Stack;

public class Q1PalindromeLinkedList {
    public static void main(String [] ar){
        LinkedList<Character> list=new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');
        Stack<Character> s=new Stack<>();

        boolean listEven=false;
        if((list.size()%2)==0) listEven=true;
        int mid=-1;
        if(!listEven){
            mid=list.size()/2;
        }

        for(int i=0;i<list.size();i++){
            if(!listEven && i==mid){
                continue;
            }
            if(!s.isEmpty() && s.peek()==list.get(i)){
                s.pop();
            }else{
                s.push(list.get(i));
            }
        }
        if(s.isEmpty()){
            System.out.println("Yes It is Palindrome");
        }else{
            System.out.println("NO Its NOT Palindrome");
        }
    }
}
