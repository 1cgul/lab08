/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singlelinkedlist;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SinglyLinkedListDemoApp {
   public static void main(String[] args) {
      /*LinkedList numList = new LinkedList();
      Node nodeA = new Node(66);
      Node nodeB = new Node(99);
      Node nodeC = new Node(44);
      Node nodeD = new Node(95);
      Node nodeE = new Node(42);
      Node nodeF = new Node(17);

      numList.append(nodeB);   // Add 99
      numList.append(nodeC);   // Add 44, make the tail
      numList.append(nodeE);   // Add 42, make the tail

      numList.prepend(nodeA);  // Add 66, make the head

      numList.insertAfter(nodeC, nodeD);  // Insert 95 after 44
      numList.insertAfter(nodeE, nodeF);  // Insert 17 after tail (42)

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
      numList.removeAfter(nodeE);
      numList.removeAfter(null);

      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();*/

      /* HW Assignment: Write a program that uses a SinglyLinkedList that gets
      populated by prime numbers from 0 to n. Then move the prime numbers that
      has the digit '3' into another linked list. After that find the sum of
      numbers in the second list.  (n should be less than 1,000,000).
       For example, the sum of the prime numbers (with 3 digit) between 0 and n=100 is
       (3+ 13+  23+ 31+ 37+ 43+  53+73+83 )= 359.*/
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter number under 1 million");
      int num = scnr.nextInt();

      while(num >= 1000000){
         System.out.println("Enter number under 1 million");
         num = scnr.nextInt();
      }

      LinkedList primes = new LinkedList();
      LinkedList primesWithThree = new LinkedList();

      for(int i = 0; i <= num; i++){
         if(isPrimeNum(i)){
            primes.append(new Node(i));
            if(String.valueOf(i).contains("3")){
               primesWithThree.append(new Node(i));
            }
         }

      }
      System.out.println(primesWithThree.sum());


   }
   public static boolean isPrimeNum(int num){
      if(num <= 1){ //1 is not prime
         return false;
      }
      for(int i = 2; i <= Math.sqrt(num); i++){
         if(num % i ==0){ //if 'i' goes into 'num', 'num' isn't prime
            return false;
         }
      }
      return true;
   }
}
