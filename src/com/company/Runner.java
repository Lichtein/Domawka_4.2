
package com.company;

public class Runner extends Thread {
    public Runner runner;

    public Runner(String name, Runner runner) {
        super(name);
        this.runner = runner;
    }

    public Runner(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (runner != null) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            runner.start();
        }
        if (this.getName().equals("Runner5")) {

            System.out.println(this.getName() + " Берет палочку");
            System.out.println(this.getName() + " Бежит к финишу!");
            System.out.println(this.getName() + " Бежит к - " + runner.getName());

        } else {
            System.out.println(this.getName() + " Берет палочку");
            System.out.println(this.getName() + " Бежит к " + runner.getName());
        }
        if (this.getName().equals("Runner 1")) {
            System.out.println(this.getName() + " Берет палочку");
            System.out.println(runner.getName() + " Бежит к финишу!");
        }


    }
}
