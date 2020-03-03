/**
 * The GUI from the notes (p.15 Chapter 11 Slides)
 * 
 * @author Adam Heffernan 
 * @version Skeleton: November 29th 2017 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.*;
import java.io.File;
import javax.swing.border.TitledBorder;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.EmptyBorder ;
import java.awt.Insets;
import java.awt.Dimension;



public class NotesGui implements ActionListener
{
       
    private DefaultListModel listModel = new DefaultListModel();
     
    private JButton aButton = new JButton("A JButton");
    private   JToggleButton aToggleButton = new JToggleButton("A JToggleButton");
    private  JCheckBox checkBox1 = new JCheckBox("A JCheckBox"); 
    private  JCheckBox checkBox2 = new JCheckBox("Another JCheckBox"); 
    private  JRadioButton radioButton1 = new JRadioButton("A JRadioButton"); 
    private  JRadioButton radioButton2 = new JRadioButton("Another JRadioButton");
    private   JLabel label = new JLabel("A JLabel with a text label");
    private  JSlider slider = new JSlider(); 
   
    private   JSpinner spinner = new JSpinner();
    private JList list1 = new JList(listModel);
    private JScrollPane scrollPane = new JScrollPane(list1);
   
    private  JComboBox combo = new JComboBox();
    private  JList list2 = new JList(listModel);
    private JScrollPane scrollPane2 = new JScrollPane(list2);
    private JTextField text = new JTextField("You can type text in an editable JTextField, Hit Enter when done");
   public NotesGui() {
       
          
      
      listModel.addElement("Item 0");
      listModel.addElement("Item 1");
      listModel.addElement("Item 2");
      listModel.addElement("Item 3");
      listModel.addElement("Item 4");
      listModel.addElement("Item 5");
      listModel.addElement("Item 6");
      listModel.addElement("Item 7");
      listModel.addElement("Item 8");
      listModel.addElement("Item 9");
      TitledBorder border1 =  new TitledBorder("Buttons");
      TitledBorder border2 =  new TitledBorder("A Button Group");
      TitledBorder border3 =  new TitledBorder("Labels and Text Entry");
      TitledBorder border4 =  new TitledBorder("A JProgress Bar");
      TitledBorder border5 =  new TitledBorder("Components for Selecting");
      TitledBorder border6 =  new TitledBorder("A JSlider");
      TitledBorder border7 =  new TitledBorder("A JSpinner");
      TitledBorder border8 =  new TitledBorder("A JList in a JScrollPane");
      TitledBorder border9 =  new TitledBorder("A JComboBox");
      TitledBorder border10 =  new TitledBorder("");
      TitledBorder border11 =  new TitledBorder("");
      
      // JFrame and contentPane
      
      JFrame frame = new JFrame("Swing Component Demo");
      
      
      Container contentPane = frame.getContentPane();
       combo.addItem("Item 0");
      combo.addItem("Item 1");
      combo.addItem("Item 2");
      combo.addItem("Item 3");
      combo.addItem("Item 4");
      combo.addItem("Item 5");
      combo.addItem("Item 6");
      combo.addItem("Item 7");
      combo.addItem("Item 8");
      combo.addItem("Item 9");
      
    
     
      JProgressBar progress = new JProgressBar();
      JPanel componentPanel = new JPanel();
      JPanel sliderPanel = new JPanel();
      JPanel spinnerPanel = new JPanel();
      
      JPanel comboPanel  = new JPanel();
      
      text.setEditable(true);
      JPanel progressPanel = new JPanel();
      JPanel bigButtonPanel = new JPanel(); 
      JPanel buttonPanel = new JPanel();
      JPanel radioButtonPanel = new JPanel(); 
      JPanel checkBoxPanel = new JPanel();
      JPanel textPanel = new JPanel(); 
      componentPanel.setBorder(border5); 
      progressPanel.setBorder(border4);
      bigButtonPanel.setBorder(border1);
      sliderPanel.setBorder(border6);
      spinnerPanel.setBorder(border7);
      scrollPane.setBorder(border8);
      comboPanel.setBorder(border9);
      buttonPanel.setBorder(border10);
      checkBoxPanel.setBorder(border11); 
      aButton.addActionListener(this);
      aToggleButton.addActionListener(this);
      radioButton1.addActionListener(this);
      radioButton2.addActionListener(this);
      checkBox1.addActionListener(this);
      checkBox2.addActionListener(this);
      combo.addActionListener(this);
      text.addActionListener(this);
      slider.addChangeListener(new SliderListener());
  
      spinner.addChangeListener(new SpinnerListener());
      list1.addListSelectionListener(new ListSelectionHandler());
      list2.addListSelectionListener(new ListSelectionHandler());
      
      Component mySpinnerEditor = spinner.getEditor();
      JFormattedTextField jftf = ((JSpinner.DefaultEditor) mySpinnerEditor).getTextField();
      jftf.setColumns(5);
      combo.setEditable(true);
      
      textPanel.setLayout(new GridLayout(1,2));
      textPanel.setBorder(border3);
      bigButtonPanel.setLayout(new GridLayout(1,3));
      buttonPanel.setLayout(new GridLayout(2,1));
      checkBoxPanel.setLayout(new GridLayout(2,1));
      radioButtonPanel.setLayout(new GridLayout(2,1));
      comboPanel.setLayout(new GridLayout(2,1));
      radioButtonPanel.setBorder(border2);
      progress.setStringPainted(true);
      frame.setLayout(new GridBagLayout());
      slider.setMajorTickSpacing(5);
      slider.setMinorTickSpacing(1);
      slider.setPaintTicks(true);
      slider.setPaintLabels(true);
      slider.setMaximum(10);
      progressPanel.setLayout(new GridLayout(1,1));
      
      GridBagConstraints c = new GridBagConstraints();
   
      componentPanel.setLayout(new GridLayout(2,2));
      buttonPanel.add(aButton);
      
      sliderPanel.add(slider);
      spinnerPanel.add(spinner);
      comboPanel.add(combo);
      comboPanel.add(scrollPane2);
      
      progress.setValue(75);
      buttonPanel.add(aToggleButton);
      checkBoxPanel.add(checkBox1);
      checkBoxPanel.add(checkBox2);
      radioButtonPanel.add(radioButton1);
      radioButtonPanel.add(radioButton2);
      bigButtonPanel.add(buttonPanel);
      bigButtonPanel.add(checkBoxPanel);
      bigButtonPanel.add(radioButtonPanel);
      textPanel.add(label);
      textPanel.add(text);
      progressPanel.add(progress);
      componentPanel.add(sliderPanel);
      componentPanel.add(spinnerPanel);
      componentPanel.add(scrollPane);
      componentPanel.add(comboPanel);
      
      
      
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 1;
      c.gridheight = 1; 
      
      frame.add(bigButtonPanel,c);
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 2;
      c.gridheight = 1; 
      frame.add(textPanel,c);
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 3;
      c.gridheight = 1; 
      frame.add(progressPanel,c);
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;
      c.gridy = 10;
      c.gridheight = 5; 
      frame.add(componentPanel,c);
      // set the layout of the contentPane
      
      // add all the GUI components 
      // Most of the classes required can be determined from the names
      // used in the GUI (e.g. JButton, etc.).
      // Note that many of these have a TitledBorder -- that's what
      // puts the line around a component with a title in the upper left.
      // See the TitledBorder interface and also the tutorial on using Borders:
      // http://docs.oracle.com/javase/tutorial/uiswing/components/border.html
      
      // set up the action listeners 
      
      // finish setting up the frame
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setSize(600,400);
      frame.setResizable(false);
      frame.setVisible(true);
   }
   
   /** 
    * This action listener is called when the user clicks / enters
    * information using the GUI. 
    */
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if (o instanceof JButton){
        System.out.println("JButton Pushed");
        }  else if(o instanceof JCheckBox){
        System.out.println("JCheckBox Pushed");
        }
        else if(o instanceof JRadioButton){
        System.out.println("JRadioButton Pushed");
        }
        else if(o instanceof JComboBox){
            JComboBox box = (JComboBox) o;
            System.out.println("JComboBox Pushed Item " + box.getSelectedIndex());
        }
        else if(o instanceof JTextField){
            JTextField text = (JTextField) o; 
        System.out.println("JTextField Changed to... " + text.getText());
        }
        else if(o instanceof JToggleButton ){
        System.out.println("JToggleButton Pushed");
        }
        // add an if statement to deal with the possible options
        // and for each one, just output a message (to System.out)
        // saying what the user did.  For example, "JButton clicked.",
        // "Text 'blah blah blah' entered in JTextArea.", "JSlider moved 
        // to 9.", etc.
        
   }
}
   class SliderListener implements ChangeListener{
   public void stateChanged(ChangeEvent e){
         Object o = e.getSource();
          if(o instanceof JSlider){
              
        JSlider slider = (JSlider) o; 
        if(!slider.getValueIsAdjusting()){
    System.out.println("Slider was changed to " + slider.getValue());
    }} 
    else{}
    }
}
    class SpinnerListener implements ChangeListener{
    public void stateChanged(ChangeEvent e){
            Object o = e.getSource();
            if(o instanceof JSpinner){
                    JSpinner spin = (JSpinner) o; 
                    System.out.println("Spinner holds the value " + spin.getValue());
    
                }
    
            }
   
}
class ListSelectionHandler implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
            JList o = (JList)e.getSource();
            
            if(!e.getValueIsAdjusting()){
                     
                    System.out.println("Current selection in the list is " + o.getSelectedValue());
                }
              
    
            }
   
}



