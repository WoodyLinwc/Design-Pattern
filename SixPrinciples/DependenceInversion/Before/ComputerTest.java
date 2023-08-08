public class ComputerTest {

    public static void main(String[] args) {
        XiHardDisk hardDisk = new XiHardDisk();
        IntelCPU cpu = new IntelCPU();
        KingstonMemory memory = new KingstonMemory();


        Computer c = new Computer();
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        c.run();
    }

}
