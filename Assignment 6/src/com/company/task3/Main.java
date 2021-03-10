package com.company.task3;

public class Main {
        public static void main(String[] args) {
            testingAbstractFactory();
        }

        private static void testingAbstractFactory() {
            ComputingMachine pc = ComputingMachineFactory.getComputer(new PCFactory("4 GB","1000 GB","2.4 GHz"));
            ComputingMachine server = ComputingMachineFactory.getComputer(new PhoneFactory("3 GB","256 GB","2.0 GHz"));
            System.out.println("AbstractFactory PC Config: "+pc);
            System.out.println("AbstractFactory Server Config: "+server);
        }
    }
