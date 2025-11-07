//Encapsulation3
package com.demo;
class Student {
 private int marks;

 public void setMarks(int marks) {
     if (marks >= 0 && marks <= 100) {
         this.marks = marks;
     } else {
         System.out.println("Error: Marks must be between 0 and 100.");
     }
 }

 public int getMarks() {
     return marks;
 }
 public static void main(String[] args) {
     Student student = new Student();

     student.setMarks(88);
     System.out.println("Student's Marks: " + student.getMarks());

     student.setMarks(120); // Invalid input
     System.out.println("Student's Marks: " + student.getMarks());  
 }
}



