package ram;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Space extends JLabel{
    private final int ancho=120;
    private final int alto=120;
    private final ImageIcon hide = new ImageIcon(getClass().getResource("/res/cover.png"));
    private ImageIcon pic;
    private String sPic="";
    private boolean frozen=false;
    public Space(String name){
        super();
        Dimension d = new Dimension(ancho,alto);
        setName(name);
        setSize(d);
        setPreferredSize(d);
        setText("");                
        setIcon(hide);
        setVisible(true);        
        setOpaque(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    public void showpic(){
        setIcon(pic);
    }
    public void hidepic(){
        if(!frozen){
            setIcon(hide);
        }
    }
    public void freezepic(boolean value){
        this.frozen=value;
    }
    public boolean isfrozen(){
        return this.frozen;
    }
    public void setpic(String name){
        this.sPic=name;
        if(!name.equals("")){            
            pic=new ImageIcon(getClass().getResource("/res/"+name+".png"));        
        }        
    }
    public String getnampic(){
        return sPic;
    }
}