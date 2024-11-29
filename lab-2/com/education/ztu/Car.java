package com.education.ztu;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public class Engine {
        private boolean isRunning;

        public void startEngine() {
            isRunning = true;
        }

        public void stopEngine() {
            isRunning = false;
        }

        public boolean isEngineWorks() {
            return isRunning;
        }
    }
}
