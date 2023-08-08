public class ComputerDemo {
    public static void main(String[] args) {
        
        // create computer conponent objects
        HardDisk hardDisk = new XiHardDisk();
        CPU cpu = new IntelCPU();
        Memory memory = new KingstonMemory();

        Computer c = new Computer();

        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        c.run();
    }
}
