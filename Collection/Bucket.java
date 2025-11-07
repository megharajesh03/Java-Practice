// Collection2: Stack
package com.demo;

import java.util.Stack;

class Bucket {
    Stack<String> balls = new Stack<>();
    
    public void addBall(String color) {
        balls.push(color);
    }

    public void removeBall() {
        if (!balls.isEmpty()) {
            System.out.println("Removed: " + balls.pop());
        } else {
            System.out.println("No balls to remove.");
        }
    }

    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("The bucket is empty.");
        } else {
            System.out.println("Balls in the bucket: " + balls);
        }
    }
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        bucket.addBall("Red");
        bucket.addBall("Blue");
        bucket.addBall("Green");

        bucket.displayBalls();

        bucket.removeBall();

        bucket.displayBalls();
    }
}

