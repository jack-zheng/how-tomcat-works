package com.jzheng.core;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

import java.util.logging.Logger;

public class SimpleContextLifecycleListener implements LifecycleListener {

    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    public void lifecycleEvent(LifecycleEvent event) {
        Lifecycle lifecycle = event.getLifecycle();
        System.out.println("SimpleContextLifecycleListener's event " + event.getType());
        if (Lifecycle.START_EVENT.equals(event.getType())) {
            logger.info("Starting context.");
        } else if (Lifecycle.STOP_EVENT.equals(event.getType())) {
            logger.info("Stopping context.");
        }
    }
}
