    import java.awt.*;  
    import java.awt.event.*;  
    public class AdapterExample extends WindowAdapter{  
        Frame f;  
        AdapterExample(){  
            f=new Frame();  
            f.addWindowListener(this);  
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);  
            f.setLocationRelativeTo(null);
        }  
    public void windowClosing(WindowEvent e) {  
        f.dispose();  
    }  
    public static void main(String[] args) {  
        new AdapterExample();  
    }  
    }  