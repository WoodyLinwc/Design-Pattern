## 开闭原则（Open Close Principle）

开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。

```
        // DefaultSkin skin = new DefaultSkin();
        AnotherSkin skin = new AnotherSkin();
```

## 里氏代换原则（Liskov Substitution Principle）

里氏代换原则中说：子类可以扩展父类的功能，但不能改变父类原有的功能。

```
Before,
public class Square extends Rectangle{...}
```

```
After,
write an interface,
public interface Quadrilateral {
    double getLength();
    double getWidth();
}
```
```
public class Square implements Quadrilateral{...}
```

## 依赖倒转原则（Dependence Inversion Principle）

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

```
Before
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
```
```
After
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
```