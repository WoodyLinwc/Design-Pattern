public class Computer {
    
    private XiHardDisk hardDisk;
    private IntelCPU cpu;
    private KingstonMemory memory;

    public IntelCPU getCpu() {
        return cpu;
    }

    public XiHardDisk getHardDisk() {
        return hardDisk;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(XiHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setMemory(KingstonMemory memory) {
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
