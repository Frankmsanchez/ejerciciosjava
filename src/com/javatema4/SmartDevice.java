package com.javatema4;


    class SmartDevice {
        private String brand;
        private String model;
        private double price;

        public SmartDevice() {}

        public SmartDevice(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String toString() {
            return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
        }
    }

    class SmartPhone extends SmartDevice {
        private int storage;
        private int ram;
        private double screenSize;

        public SmartPhone() {}

        public SmartPhone(String brand, String model, double price, int storage, int ram, double screenSize) {
            super(brand, model, price);
            this.storage = storage;
            this.ram = ram;
            this.screenSize = screenSize;
        }

        public int getStorage() {
            return storage;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public String toString() {
            return super.toString() + ", Storage: " + storage + ", RAM: " + ram + ", Screen Size: " + screenSize;
        }
    }

    class SmartWatch extends SmartDevice {
        private String material;
        private String color;

        public SmartWatch() {}

        public SmartWatch(String brand, String model, double price, String material, String color) {
            super(brand, model, price);
            this.material = material;
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return super.toString() + ", Material: " + material + ", Color: " + color;
        }
    }

