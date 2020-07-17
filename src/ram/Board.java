package ram;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
public class Board extends JPanel{
    private String[]band={"p1","p2","p3","p4","p5","p6","p7","p8","p9","p10","p11","p12","p13","p14","p15","p16","p17","p18","p19","p20","p21","p22","p23","p24","p25","p26","p27","p28","p29","p30"};
    private int row=6;
    private int col=10;
    private int sqwidth=120;
    public boolean play=false;
    int c=0;
    Space c1;
    Space c2;
    int accs=0;
    public Board(){
        super();
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        setLayout(new java.awt.GridLayout(row,col));        
        Dimension d=new Dimension((sqwidth*col),(sqwidth*row));        
        setSize(d);
        setPreferredSize(d);
        int cuenta=0;
        for(int i=1;i<=(row*col);i++){
            Space p = new Space(String.valueOf(i));            
            p.setpic(band[cuenta]);
            cuenta++;
            cuenta=(cuenta>=band.length)?0:cuenta++;
            p.showpic();
            p.addMouseListener(new gamous());
            Component add = this.add(p);
        }        
        setVisible(true);        
    }
    public void startgame(){
        accs=0;
        play=true;
        Component[]comp=this.getComponents();
        for(int i=0;i<comp.length;i++){
            ((Space)comp[i]).freezepic(false);
            ((Space)comp[i]).hidepic();            
            ((Space)comp[i]).setpic("");
        }
        for( int i=0;i<comp.length;i++){
            int n=(int)(Math.random()*(band.length));        
            if(!existe(band[n])){
                ((Space)comp[i]).setpic(band[n]);
            }else{
                i--;
            }
        }
    }
    private boolean existe(String pic){  
        int cuenta=0;
        Component[]comp = this.getComponents(); 
        for (Component comp1 : comp) {
            if (comp1 instanceof Space) {
                if (((Space) comp1).getnampic().equals(pic)) {
                    cuenta++;
                }
            }
        }        
        return(cuenta==2);
    }
    class gamous implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e){
            if(play){
                c++;
                if(c==1){
                    c1=((Space)e.getSource());
                    if(!c1.isfrozen()){
                        c1.showpic();     
                        System.out.println("First picture: "+c1.getnampic());    
                    }else{
                        c=0;   
                    }                
                }else if(c==2&&!c1.getName().equals(((Space)e.getSource()).getName())){
                    c2=((Space)e.getSource()); 
                    if(!c2.isfrozen()){
                        c2.showpic();     
                        System.out.println("Second picture: "+c2.getnampic());    
                        Anim ani = new Anim(c1,c2);
                        ani.execute();
                    }
                    c=0;
                }else{
                    c=0; 
                }
            }else{
                System.out.println("To play: FILE -> PLAY");
            }
        }
        @Override
        public void mousePressed(MouseEvent e){}
        @Override
        public void mouseReleased(MouseEvent e){}
        @Override
        public void mouseEntered(MouseEvent e){}
        @Override
        public void mouseExited(MouseEvent e){}
    }
    class Anim extends SwingWorker<Void,Void>{
        private final Space casuno;
        private final Space casdos;
        public Anim(Space v1, Space v2){
            this.casuno=v1;
            this.casdos=v2;
        }
        @Override
        protected Void doInBackground()throws Exception{
            System.out.println("Processing images...");            
            Thread.sleep(750);                
            if(casuno.getnampic().equals(casdos.getnampic())){
                casuno.freezepic(true);
                casdos.freezepic(true);
                System.out.println("Pictures are the same");    
                accs++;
                if(accs==30){
                    System.out.println("You won the game!");  
                    JOptionPane.showMessageDialog(null,"You win!", "Victory", JOptionPane.PLAIN_MESSAGE);
                }
            }            
            else{
                casuno.hidepic();
                casdos.hidepic();
                System.out.println("Pictures aren't the same");    
            }
            return null;
        }
    }
}