
package com.company;

public class Runner extends Thread {
    private Runner runner;

    public Runner(String name, Runner runner) {
        super(name);
        this.runner = runner;
    }

    public Runner(String name) {
        super(name);
    }

    @Override
    public  void run() {
        try {
            System.out.println(this.getName() + " берет палочку");
            if (this.getName().equals("Runner 5")){
                System.out.println(this.getName() + " бежит к финишу");
                System.out.println(this.getName() + " бежит к " + runner.getName());
                sleep(1000);
            } else {
                System.out.println(this.getName() + " бежит к " + runner.getName());
                sleep(1000);
                runner.start();
                runner.join();
            }

            System.out.println(this.getName() + " берет палочку");
            if (!this.getName().equals("Runner 1")) {
                System.out.println(this.getName() + " бежит к " + runner.getName());
                sleep(1000);
            } else {
                System.out.println(this.getName() + " бежит к финишу");
            }

        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }

    }
}
