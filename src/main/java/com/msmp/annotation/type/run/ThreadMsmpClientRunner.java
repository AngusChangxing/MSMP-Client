package com.msmp.annotation.type.run;

import com.msmp.annotation.type.thread.InitThread;
import org.springframework.boot.CommandLineRunner;

public class ThreadMsmpClientRunner implements CommandLineRunner {

    private InitThread initThread;

    public ThreadMsmpClientRunner(InitThread initThread) {
        this.initThread = initThread;
    }

    @Override
    public void run(String... args) throws Exception {
        this.initThread.execute();
    }
}
