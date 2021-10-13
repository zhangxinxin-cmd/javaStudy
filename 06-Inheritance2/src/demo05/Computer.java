package demo05;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机。");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机。");
    }

//    使用USB设备的方法。
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
//            ((Mouse) usb).click();
        }
        if(usb instanceof Keyboard){
            ((Keyboard) usb).println();
        }
        usb.close();
    }

}
