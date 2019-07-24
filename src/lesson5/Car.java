package lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier carcb;
    private static AtomicInteger ai = new AtomicInteger(0);

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public Car (Race race, int speed, CyclicBarrier cyclicBarrier){
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник №" + CARS_COUNT;
        this.carcb = cyclicBarrier;

    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random()*800));
            System.out.println(this.name + " готов");
            carcb.await();
            carcb.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            if (ai.incrementAndGet() == 1){
                System.out.println("ПОБЕДИТЕЛЬ - " + name);
            }
            carcb.await();
            }catch (InterruptedException e){
            e.printStackTrace();
            }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
