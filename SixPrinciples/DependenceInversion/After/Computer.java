public class Computer {
    
    // abstract class not specific class
    private HardDisk hardDisk;
    private CPU cpu;
    private Memory memory;

    public CPU getCpu() {
        return cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("Using the computer");
        String data = hardDisk.get();
        System.out.println("Getting data from " + data);
        cpu.run();
        memory.save();
    }
}
