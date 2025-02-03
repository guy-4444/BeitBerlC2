package ticTacToe;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClockLibrary {

    public interface ClockCallBack {
        void tick();
    }

    private ScheduledExecutorService executor;
    private int DELAY = 1000;
    private ClockCallBack clockCallBack;

    public ClockLibrary(ClockCallBack clockCallBack) {
        this.clockCallBack = clockCallBack;
    }

    public ClockLibrary(int DELAY, ClockCallBack clockCallBack) {
        this.DELAY = DELAY;
        this.clockCallBack = clockCallBack;
    }

    public void start() {
        executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> tick(), 0, DELAY, TimeUnit.MILLISECONDS);
    }

    public void stop() {
        executor.shutdown();
    }

    private void tick() {
        clockCallBack.tick();
    }
}
