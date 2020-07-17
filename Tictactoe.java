//SIMPLE TICTACTOE (X AND O) GAME
import java.awt.*;  
import javax.swing.*;
import java.awt.event.*; 

public class Tictactoe implements ActionListener{
    JFrame f;
    boolean x = true; boolean x1 = true;boolean x2 = true;boolean x3 = true;boolean x4 = true;boolean x5 = true;
    boolean x6 =true; boolean x7 = true; boolean x8 = true;
    static int count = 1;
    JButton buttons[] = new JButton[9];
    String s[];

    Tictactoe(){                            //initializing construtor

        f = new JFrame();
       
        for(int i=0;i<buttons.length;++i){
            JButton btn = new JButton();
            btn.addActionListener(this);
            f.add(btn);
            buttons[i] = btn;
        }

        f.setLayout(new GridLayout(3,3));  
        //setting grid layout of 3 rows and 3 columns  
      
        f.setSize(400,400);  
        f.setLocationRelativeTo(null);
        f.setVisible(true);  
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){  
        if(e.getSource() == buttons[0]){
            if(x==true){
                if(count%2==0){
                    buttons[0].setText("O");
                }else{
                    buttons[0].setText("X");
                }
              x = false;
              count++;  
            }  
        }
        if(e.getSource() == buttons[1]){
            if(x1==true){
                if(count%2==0){
                    buttons[1].setText("O");
                }else{
                    buttons[1].setText("X");
                }
              x1 = false;
              count++;  
            }  
        }
        if(e.getSource() == buttons[2]){
            if(x2==true){
                if(count%2==0){
                    buttons[2].setText("O");
                }else{
                    buttons[2].setText("X");
                }
                x2 = false;
                count++;
            }       
        }
        if(e.getSource() == buttons[3]){
            if(x3==true){
                if(count%2==0){
                    buttons[3].setText("O");
                }else{
                    buttons[3].setText("X");
                }
                x3 = false;
                count++;
            }          
        }
        if(e.getSource() == buttons[4]){
            if(x4==true){
                if(count%2==0){
                    buttons[4].setText("O");
                }else{
                    buttons[4].setText("X");
                }
                x4 = false;
                count++;
            }   
        }
        if(e.getSource() == buttons[5]){
            if(x5==true){
                if(count%2==0){
                    buttons[5].setText("O");
                }else{
                    buttons[5].setText("X");
                }
                x5 = false;
                count++;
            }          
        }
        if(e.getSource() == buttons[6]){
            if(x6==true){
                if(count%2==0){
                    buttons[6].setText("O");
                }else{
                    buttons[6].setText("X");
                }
                x6 = false;
                count++;
            }       
        }
        if(e.getSource() == buttons[7]){
            if(x7==true){
                if(count%2==0){
                    buttons[7].setText("O");
                }else{
                    buttons[7].setText("X");
                }
                x7 = false;
                count++;
            }       
        }
        if(e.getSource() == buttons[8]){
            if(x8==true){
                if(count%2==0){
                    buttons[8].setText("O");
                }else{
                    buttons[8].setText("X");
                }
                x8 = false;
                count++;
            }        
        }
        String s[] = {buttons[0].getText(),buttons[1].getText(),buttons[2].getText(),
            buttons[3].getText(),buttons[4].getText(),buttons[5].getText(),buttons[6].getText(),
            buttons[7].getText(),buttons[8].getText()                
        };
        //Check for winnig conditions
        //rows
         for(int k=0;k<3;k++){
            if(s[k*3]=="X" && s[k*3+1]=="X" && s[k*3+2]=="X"){		
                JOptionPane.showMessageDialog(f, "Player x won");
                f.setEnabled(false);
            }else if(s[k*3]=="O" && s[k*3+1]=="O" && s[k*3+2]=="O"){		
                JOptionPane.showMessageDialog(f, "Player o won");
                f.setEnabled(false);
            }
        }
     //Columns
         for(int l=0;l<3;l++){
            if(s[l]=="X" && s[l+3]=="X" && s[l+6]=="X"){		
                JOptionPane.showMessageDialog(f, "Player x won");
                f.setEnabled(false);
            }else if(s[l]=="O" && s[l+3]=="O" && s[l+6]=="O"){		
                JOptionPane.showMessageDialog(f, "Player o won");
                f.setEnabled(false);
            }
        }
     //Diagonals
        if((s[0]==s[4]) && (s[4]==s[8]) && (s[0]!="")){
            if(s[4]=="X"){
                JOptionPane.showMessageDialog(f, "Player x won");
               }else{
                JOptionPane.showMessageDialog(f, "Player 0 won");
               }
            f.setEnabled(false);
        }
        else if((s[2]==s[4]) && (s[4]==s[6]) && (s[2]!="")){
            if(s[4]=="X"){
                JOptionPane.showMessageDialog(f, "Player x won");
               }else{
                JOptionPane.showMessageDialog(f, "Player 0 won");
               }   
            f.setEnabled(false);
        }else if(count>=10){
             JOptionPane.showMessageDialog(f, "Draw");
             f.setEnabled(false);
        }
    }
    public static void main(String[] args) {
        new Tictactoe();
    }      
}
