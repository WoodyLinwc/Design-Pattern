public class XiHardDisk implements HardDisk {
    public void save(String data) {
        System.out.println("saving " + data);
    }

    public String get(){
        System.out.println("Using Xi Hard Disk");
        return "data";
    }
}
