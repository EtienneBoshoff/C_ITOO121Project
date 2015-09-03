/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

//imports-----------------------------------------------------------------------
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//------------------------------------------------------------------------------

/**
 *
 * @author Philip
 */
public class DPcalcGUIframe extends JFrame {
    public DPcalcGUIframe() throws IOException{
        
        super("DP calc - by Philip Venter DV2015-0048");
        JPanel calcPnl = new JPanel();
            //Panel settings set------------------------------------------------
            setDefaultCloseOperation(3);
            setSize(480,560);
            setLocationRelativeTo(null);
            //------------------------------------------------------------------
        JButton calcBtn = new JButton("Calculate");
        JButton multiSubjectBtn = new JButton("Multiple Subjects");
        JButton resetBtn = new JButton("Reset");
        JButton helpBtn = new JButton("Help");
        JComboBox subjectCmboBox;
            //Combo box settings set--------------------------------------------
            String[] comboValues = {"Subjects", 
                "Object Orientated Programming", 
                "Introduction to Information Systems", 
                "Networking Technologies", 
                "Human Computer Interaction", 
                "Computer Skills Development B"};
            subjectCmboBox = new JComboBox(comboValues);
            //------------------------------------------------------------------
        JLabel headerLbl = new JLabel("DP Calculator");
            //Header text set---------------------------------------------------
            headerLbl.setFont(new Font("Serif", Font.BOLD, 36));
            //------------------------------------------------------------------
        JLabel nameLbl = new JLabel("Name of Student");
        JLabel dvNumLbl = new JLabel("DV number of Student");
        JLabel semMarkLbl = new JLabel("Semester Test Mark");
        JLabel conMarkLbl = new JLabel("Continouos Assessment Mark");
        JLabel assMarkLbl = new JLabel("Assignment Mark");
        JLabel semWeightLbl = new JLabel("Semester Test Weight");
        JLabel conWeightLbl = new JLabel("Continouos Assessment Weight");
        JLabel assWeightLbl = new JLabel("Assignment Mark");
        JLabel passFailLbl = new JLabel("Pass/Fail");
        JLabel percLbl = new JLabel("Percentage Achieved: ");
        JLabel emoticon = new JLabel();
            //Image settings set------------------------------------------------
            emoticon.setIcon( new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("eh.jpg"))));
            //------------------------------------------------------------------
        JTextField nameTxtField = new JTextField();
        JTextField dvNumTxtField = new JTextField();
        JTextField semMarkTxtField = new JTextField();
        JTextField conMarkTxtField = new JTextField();
        JTextField assMarkTxtField = new JTextField();
        JTextField semWeightTxtField = new JTextField("0.2");
        JTextField conWeightTxtField = new JTextField("0.2");
        JTextField assWeightTxtField = new JTextField("0.6");
        
        //Layout----------------------------------------------------------------
        calcPnl.setLayout(null);
        headerLbl.setBounds(100, 0, 450, 50);
        subjectCmboBox.setBounds(85, 60, 250, 20);
        nameLbl.setBounds(10, 100, 200, 20);            dvNumLbl.setBounds(250, 100, 200, 20);
        nameTxtField.setBounds(10, 120, 200, 20);       dvNumTxtField.setBounds(250, 120, 200, 20);
        semMarkLbl.setBounds(10, 160, 200, 20);         semMarkTxtField.setBounds(250, 160, 200, 20);
        conMarkLbl.setBounds(10, 180, 200, 20);         conMarkTxtField.setBounds(250, 180, 200, 20);
        assMarkLbl.setBounds(10, 200, 200, 20);          assMarkTxtField.setBounds(250, 200, 200, 20);
        semWeightLbl.setBounds(10, 240, 200, 20);       semWeightTxtField.setBounds(250, 240, 200, 20);
        conWeightLbl.setBounds(10, 260, 200, 20);       conWeightTxtField.setBounds(250, 260, 200, 20);
        assWeightLbl.setBounds(10, 280, 200, 20);       assWeightTxtField.setBounds(250, 280, 200, 20);
        emoticon.setBounds(10, 310, 200, 200);          passFailLbl.setBounds(250, 320, 250, 20);        
                                                        percLbl.setBounds(250, 340, 200, 20);             
                                                        calcBtn.setBounds(250, 380, 200, 20);
                                                        multiSubjectBtn.setBounds(250, 400, 200, 20);
                                                        resetBtn.setBounds(250, 420, 200, 20);
                                                        helpBtn.setBounds(250, 440, 200, 20);
        //----------------------------------------------------------------------
        
        //Add components to calcPnl---------------------------------------------
        calcPnl.add(calcBtn);
        calcPnl.add(multiSubjectBtn);
        calcPnl.add(resetBtn);
        calcPnl.add(helpBtn);
        calcPnl.add(subjectCmboBox);
        calcPnl.add(headerLbl);
        calcPnl.add(nameLbl);
        calcPnl.add(dvNumLbl);
        calcPnl.add(semMarkLbl);
        calcPnl.add(conMarkLbl);
        calcPnl.add(assMarkLbl);
        calcPnl.add(semWeightLbl);
        calcPnl.add(conWeightLbl);
        calcPnl.add(assWeightLbl);
        calcPnl.add(passFailLbl);
        calcPnl.add(percLbl);
        calcPnl.add(emoticon);
        calcPnl.add(nameTxtField);
        calcPnl.add(dvNumTxtField);
        calcPnl.add(semMarkTxtField);
        calcPnl.add(conMarkTxtField);
        calcPnl.add(assMarkTxtField);
        calcPnl.add(semWeightTxtField);
        calcPnl.add(conWeightTxtField);
        calcPnl.add(assWeightTxtField);
        //----------------------------------------------------------------------
        
        //Action Listeners------------------------------------------------------
        
            //calculate button--------------------------------------------------
            calcBtn.addActionListener((ActionEvent evt) -> {
                try {
                    //convert all the fields to double--------------------------
                    Double assignmentMark = Double.parseDouble(assMarkTxtField.getText());
                    Double semesterTestMark = Double.parseDouble(semMarkTxtField.getText());
                    Double continuousAssessmentMark = Double.parseDouble(conMarkTxtField.getText());
                    Double assignmentWeight = Double.parseDouble(assWeightTxtField.getText());
                    Double semesterTestWeight = Double.parseDouble(semWeightTxtField.getText());
                    Double continuousAssessmentWeight = Double.parseDouble(conWeightTxtField.getText());
                    //----------------------------------------------------------

                    //multiple tests to ensure users do not break the programme-
                    if(assignmentMark <= 100.0 && 
                            semesterTestMark <= 100.0 && 
                            continuousAssessmentMark <= 100.0 && 
                            assignmentMark >= 0.0 && 
                            semesterTestMark >= 0.0 && 
                            continuousAssessmentMark >= 0.0 && 
                            assignmentWeight <= 1.0 && 
                            semesterTestWeight <= 1.0 && 
                            continuousAssessmentWeight <= 1.0 && 
                            assignmentWeight >= 0.0 && 
                            semesterTestWeight >= 0.0 && 
                            continuousAssessmentWeight >= 0.0 &&
                            !nameTxtField.getText().isEmpty() &&
                            !dvNumTxtField.getText().isEmpty()){
                    //----------------------------------------------------------

                        //makes sure the collective percentage of assignment
                        //weight, semester test weight and continuous assessment
                        //weight does not exeed 100%----------------------------
                        if ((assignmentWeight + semesterTestWeight + continuousAssessmentWeight) == 1.0){
                        //------------------------------------------------------

                            //creates a DPcalc object with the values from the 
                            //GUI-----------------------------------------------
                            DPcalc calc = new DPcalc(assignmentMark, 
                                    semesterTestMark, 
                                    continuousAssessmentMark, 
                                    nameTxtField.getText(), 
                                    dvNumTxtField.getText(), 
                                    subjectCmboBox.getSelectedItem().toString(), 
                                    assignmentWeight, 
                                    semesterTestWeight, 
                                    continuousAssessmentWeight);
                            //--------------------------------------------------

                            //test to see whether the user passes or fails and
                            //changes the image and note respectfuly------------
                            if (calc.canWriteExams()){
                                passFailLbl.setText("Pass");
                                emoticon.setIcon( new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("ay.jpg"))));
                            } else {
                                passFailLbl.setText("Fail");
                                emoticon.setIcon( new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("no.jpg"))));
                            }
                            //--------------------------------------------------

                            //displays the % theuser recieved-------------------
                            percLbl.setText("Percentage Achieved: " + calc.calculateDP() + "%");
                            //--------------------------------------------------
                        }
                    }else{
                        JOptionPane.showMessageDialog(calcPnl, "Please ensure all the fields are correct and that you have filled in ALL the fields");
                    }
                } catch (IOException | NumberFormatException ex) {
                    System.out.println(ex);
                }
            });
            //------------------------------------------------------------------
            //add another subject button----------------------------------------
            multiSubjectBtn.addActionListener((ActionEvent evt) -> {

            });
            //------------------------------------------------------------------
            //reset Button------------------------------------------------------
            resetBtn.addActionListener((ActionEvent evt) -> {
                try {
                    //returns the GUI to its default state
                    subjectCmboBox.setSelectedIndex(0);
                    nameTxtField.setText("");
                    dvNumTxtField.setText("");
                    semMarkTxtField.setText("");
                    conMarkTxtField.setText("");
                    assMarkTxtField.setText("");
                    semWeightTxtField.setText("0.2");
                    conWeightTxtField.setText("0.2");
                    assWeightTxtField.setText("0.6");
                    passFailLbl.setText("Pass/Fail");
                    percLbl.setText("Percentage Achieved: ");
                    emoticon.setIcon( new ImageIcon(ImageIO.read(this.getClass().getClassLoader().getResource("eh.jpg"))));

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            });
            //------------------------------------------------------------------
            //help button-------------------------------------------------------
            helpBtn.addActionListener((ActionEvent evt) -> {
            });
            //------------------------------------------------------------------
            
        //----------------------------------------------------------------------
        
        //adds the panel to the frame-------------------------------------------
        getContentPane().add(calcPnl);
        //----------------------------------------------------------------------
    }
}
