package com.bridgelabz.queues;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(90);
        queue.enqueue(70);
        queue.dequeue();
        System.out.println(queue.isEmpty());
        queue.show();
	}

}
