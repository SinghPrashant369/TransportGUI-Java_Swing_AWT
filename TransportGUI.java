import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class TransportGUI implements ActionListener
{
    //instance variables
    private JFrame auto_jframe, electric_jframe;
    private JPanel jPanelLeft,jPanelRight, e_jPanel;
    
    private JLabel
    //JLabels for AutoRickshaw
    title1, vIDJLabel, vNameJLabel, vWeightJLabel, vColorJLabel, vSpeedJLabel, eDJLabel, torqueJLabel, fTCJLabel, gClearanceJLabel, 
    vIDJlabel2,bookedDateJLabel, chargeAmountJLabel, noOfSeatsJLabel, copyRightJLabel,
    //JLabels for ElectricScooter
    title2, e_vIDJLabel, e_vNameJLabel, e_vWeightJLabel, e_vColorJLabel,e_vSpeedJLabel,e_batteryCapacityJLabel, 
    e_vIDJLabel1, e_brandJLabel, e_priceJLabel, e_chargingTimeJLabel,e_mileageJLabel, e_rangeJLabel,
    e_vIDJLabel2,e_priceJLabel1,copyRightJLabel2;
    
    private JTextField 
    //JTextField for AutoRickshaw
    vIDF, vNameF, vWeightF, vColorF, vSpeedF, eDF, torqueF, FTCF, gClearanceF, 
    vIDF2, chargeAmountF, noOfSeatsF,
    //JTextField for ElectricScooter
    e_vIDF, e_vNameF, e_vWeightF, e_vColorF, e_vSpeedF,e_batteryCapacityF, 
    e_vIDF2, e_brandF, e_priceF, e_chargingTimeF,e_mileageF, e_rangeF,
    e_vIDF3,e_priceF1;
    
    private JButton 
    //Buttons for AutoRickshaw GUI
    addButton,bookButton, displayButton, clearButton,
    //Buttons for ElectricScooter GUI
    addButton2, purchaseButton, sellButton, e_displayButton, e_clearButton;
    private JComboBox cYear,cMonth, cDay;
    private JToggleButton changeToButton, e_changeToButton;
    
    private ArrayList<Vehicle> al_obj=new ArrayList<Vehicle>();

    public void autoRickshaw_method()
    {
        //Creating JFrame object 
        auto_jframe=new JFrame();
        auto_jframe.setTitle("Transport GUI");
        auto_jframe.setLayout(null);
        //auto_jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color c0=new Color(48, 50, 58);
        auto_jframe.getContentPane().setBackground(c0);
        auto_jframe.setResizable(true);
        auto_jframe.setBounds(50,0,1300,800);
    
        //Creating JPanel object
        jPanelLeft=new JPanel();
        jPanelLeft.setLayout(null);
        Color c1=new Color(208, 209, 156);
        jPanelLeft.setBackground(c1);
        jPanelLeft.setBounds(25,150,612,550);
        auto_jframe.add(jPanelLeft);

        //Creating another object for Jpanel
        jPanelRight=new JPanel();
        jPanelRight.setLayout(null);
        Color c2=new Color(90, 164, 156);
        jPanelRight.setBackground(c2);
        jPanelRight.setBounds(663,150,612,550);
        auto_jframe.add(jPanelRight);

        //Creating Fonts
        Font f1=new Font("New Roman Times",Font.BOLD,18);
        Font f2=new Font("Segoe UI",Font.PLAIN,12);
        Font f3=new Font("Arial",Font.BOLD,12);

        //Creating an object of JLabel
        title1=new JLabel();
        title1.setText("Auto Rickshaw");
        title1.setForeground(Color.WHITE);
        title1.setBounds(500,30,300,50);
        title1.setFont(new Font("Arial",Font.BOLD,40));
        auto_jframe.add(title1);

        //Creating JLabel object for Vehicle ID
        vIDJLabel=new JLabel();
        vIDJLabel.setText("Vehicle ID: ");
        vIDJLabel.setFont(f1);
        vIDJLabel.setBounds(20,10,250,40);
        jPanelLeft.add(vIDJLabel);

        //Creating Jlabel object for Vehcle Name
        vNameJLabel=new JLabel();
        vNameJLabel.setText("Vehicle Name: ");
        vNameJLabel.setFont(f1);
        vNameJLabel.setBounds(20,60,250,40);
        //vNameJLabel.setOpaque(true);
        //vNameJLabel.setBackground(Color.red);
        jPanelLeft.add(vNameJLabel);

        //Creating JLabel Object for Vehicle Weight
        vWeightJLabel=new JLabel();
        vWeightJLabel.setText("Vehicle Weight: ");
        vWeightJLabel.setBounds(20,110,250,40);
        vWeightJLabel.setFont(f1);
        jPanelLeft.add(vWeightJLabel);

        //Creating JLabel Object for Vehicle Color
        vColorJLabel=new JLabel();
        vColorJLabel.setText("Vehcle Color: ");
        vColorJLabel.setBounds(20,160,250,40);
        vColorJLabel.setFont(f1);
        jPanelLeft.add(vColorJLabel);

        //Creating JLabel Object for Vehicle Speed
        vSpeedJLabel=new JLabel();
        vSpeedJLabel.setText("Vehicle Speed: ");
        vSpeedJLabel.setBounds(20,210,250,40);
        vSpeedJLabel.setFont(f1);
        jPanelLeft.add(vSpeedJLabel);

        //Creating JLabel Object for Engine Displacement
        eDJLabel=new JLabel();
        eDJLabel.setText("Engine Displacement: ");
        eDJLabel.setBounds(20,260,250,40);
        //eDJLabel.setOpaque(true);
        //eDJLabel.setBackground(Color.red);
        eDJLabel.setFont(f1);
        jPanelLeft.add(eDJLabel);

        //Creating JLabel Object for Torque
        torqueJLabel=new JLabel();
        torqueJLabel.setText("Torque: ");
        torqueJLabel.setBounds(20,310,250,40);
        torqueJLabel.setFont(f1);
        jPanelLeft.add(torqueJLabel);

        //Creating JLabel Object for Fuel Tank Capacity
        fTCJLabel=new JLabel();
        fTCJLabel.setText("Fuel Tank Capacity: ");
        fTCJLabel.setBounds(20,360,250,40);
        fTCJLabel.setFont(f1);
        jPanelLeft.add(fTCJLabel);

        //Creating JLabel Object for Ground Clearance
        gClearanceJLabel=new JLabel();
        gClearanceJLabel.setText("Ground clearance: ");
        gClearanceJLabel.setBounds(20,410,250,40);
        gClearanceJLabel.setFont(f1);
        jPanelLeft.add(gClearanceJLabel);

        //Creating JLabel Object for Vehicle ID in jPanelRight
        vIDJlabel2=new JLabel();
        vIDJlabel2.setText("Vehicle ID: ");
        vIDJlabel2.setBounds(20,10,250,40);
        vIDJlabel2.setFont(f1);
        jPanelRight.add(vIDJlabel2);
        
        //Creating JLabel Object for Booked Date 
        bookedDateJLabel=new JLabel();
        bookedDateJLabel.setText("Booked Date: ");
        bookedDateJLabel.setBounds(20,60,250,40);
        bookedDateJLabel.setFont(f1);
        jPanelRight.add(bookedDateJLabel);

        //Creating JLabel Object for Charge Amount
        chargeAmountJLabel=new JLabel();
        chargeAmountJLabel.setText("Charge Amount: ");
        chargeAmountJLabel.setBounds(20,110,250,40);
        chargeAmountJLabel.setFont(f1);
        jPanelRight.add( chargeAmountJLabel);

        //Creating JLabel Object for Number of Seats
        noOfSeatsJLabel=new JLabel();
        noOfSeatsJLabel.setText("Number of Seats: ");
        noOfSeatsJLabel.setBounds(20,160,250,40);
        noOfSeatsJLabel.setFont(f1);
        jPanelRight.add(noOfSeatsJLabel);
        
        //Creating JLabel for copy right
        copyRightJLabel=new JLabel();
        copyRightJLabel.setText("Copyright © 2021-2022 Singh's. All Rights Reserved");
        copyRightJLabel.setBounds(500,720,350,40);
        copyRightJLabel.setForeground(Color.WHITE);
        copyRightJLabel.setFont(f2);
        auto_jframe.add(copyRightJLabel);
        
        

        //Creating JTextField for Vehicle ID
        vIDF=new JTextField();
        vIDF.setBounds(270,10,300,40);
        jPanelLeft.add(vIDF);

        //Creating JTextField for Vehicle Name
        vNameF=new JTextField();
        vNameF.setBounds(270,60,300,40);
        jPanelLeft.add(vNameF);

        //Creating JTextField for Vehicle Weight
        vWeightF=new JTextField();
        vWeightF.setBounds(270,110,300,40);
        jPanelLeft.add(vWeightF);

        //Creating JTextField for Vehicle Color
        vColorF=new JTextField();
        vColorF.setBounds(270,160,300,40);
        jPanelLeft.add(vColorF);

        //Creating JTextField for Vehicle Speed
        vSpeedF=new JTextField();
        vSpeedF.setBounds(270,210,300,40);
        jPanelLeft.add(vSpeedF);

        //Creatiing JTextField for Engine Displacement
        eDF=new JTextField();
        eDF.setBounds(270,260,300,40);
        jPanelLeft.add(eDF);

        //Creating JTextField for Torque
        torqueF=new JTextField();
        torqueF.setBounds(270,310,300,40);
        jPanelLeft.add(torqueF);

        //Creating JTextField for Fuel Tank Capacity
        FTCF=new JTextField();
        FTCF.setBounds(270,360,300,40);
        jPanelLeft.add(FTCF);

        //Creating JTextField for Ground Clearance
        gClearanceF=new JTextField();
        gClearanceF.setBounds(270,410,300,40);
        jPanelLeft.add(gClearanceF);

        //Creating JTextField for Vehicle ID
        vIDF2=new JTextField();
        vIDF2.setBounds(270,10,300,40);
        jPanelRight.add(vIDF2);

        //Creating JTextField for Charge Amount
        chargeAmountF=new JTextField();
        chargeAmountF.setBounds(270,110,300,40);
        jPanelRight.add(chargeAmountF);

        //Creating JTextField for Number of Seats
        noOfSeatsF=new JTextField();
        noOfSeatsF.setBounds(270,160,300,40);
        jPanelRight.add(noOfSeatsF);

        //Creating JComboBox
        String years[]={"YYYY","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004",
        "2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2018",
        "2019","2020","2021","2022"};
        cYear=new JComboBox(years);
        cYear.setBounds(270,50,100,70);
        jPanelRight.add(cYear);
        
        String months[]={"MM","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        cMonth=new JComboBox(months);
        cMonth.setBounds(390,50,80,70);
        jPanelRight.add(cMonth);
    
        String days[]={"DD","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15",
        "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        cDay=new JComboBox(days);
        cDay.setBounds(490,50,80,70);
        jPanelRight.add(cDay);
        
        //Creating an Object of JButton for Add an Auto Rickshaw
        addButton=new JButton("Add an Auto Rickshaw");
        addButton.setBounds(20,460,550,50);
        addButton.setFont(f1);
        jPanelLeft.add(addButton);
        addButton.addActionListener(this);
        
        //Creating an Object of JToggleButton for Change for Electric Scooter
        changeToButton=new JToggleButton("Change for Electric Scooter");
        changeToButton.setBounds(663,90,612,50);
        changeToButton.setFont(f1);
        auto_jframe.add(changeToButton);
        changeToButton.addActionListener(this);
        
        
        
        //Creating an Object of JButton for Book an Auto Rickshaw
        bookButton=new JButton("Book an Auto Rickshaw");
        bookButton.setBounds(20,250,550,50);
        bookButton.setFont(f1);
        jPanelRight.add(bookButton);
        bookButton.addActionListener(this);
        
        //Creating an Object of JButton for Display button
        displayButton=new JButton("Display");
        displayButton.setBounds(20,460,250,50);
        displayButton.setFont(f1);
        jPanelRight.add(displayButton);
        displayButton.addActionListener(this);
        
        
        //Creating an Object of JButton for Clear button
        clearButton=new JButton("Clear");
        clearButton.setBounds(320,460,250,50);
        clearButton.setFont(f1);
        jPanelRight.add(clearButton);
        clearButton.setForeground(Color.red);
        clearButton.setBackground(Color.red);
        clearButton.setOpaque(true);
        clearButton.addActionListener(this);
        
        auto_jframe.setVisible(true);   
    }
    
    //method for Electric Scooter with no return type
    public void electricScooter_method()
    {
        electric_jframe=new JFrame();
        electric_jframe.setTitle("Transport GUI");
        electric_jframe.setLayout(null);
        //electric_jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color c0=new Color(185, 22, 19);
        electric_jframe.getContentPane().setBackground(c0);
        electric_jframe.setResizable(true);
        electric_jframe.setBounds(50,0,1300,800);
        
        //Creating Fonts
        Font f1=new Font("New Roman Times",Font.BOLD,18);
        Font f2=new Font("Segoe UI",Font.PLAIN,12);
        Font f3=new Font("Arial",Font.BOLD,12);
        
        //Creating JPanel Object
        e_jPanel=new JPanel();
        e_jPanel.setLayout(null);
        Color c1=new Color(75, 37, 65);
        e_jPanel.setBackground(c1);
        e_jPanel.setBounds(5,5,1290,790);
        electric_jframe.add(e_jPanel);
        
        //Creating a JLabel for Electric Scooter
        title2=new JLabel();
        title2.setText("Electric Scooter");
        title2.setForeground(Color.WHITE);
        title2.setBounds(495,30,300,50);
        title2.setFont(new Font("Arial",Font.BOLD,35));
        e_jPanel.add(title2);
        
        //Creating an Object of JToggleButton for Change for Auto Rickshaw
        e_changeToButton=new JToggleButton("Change for Auto Rickshaw");
        e_changeToButton.setBounds(665,120,550,50);
        e_changeToButton.setFont(f1);
        e_jPanel.add(e_changeToButton);
        e_changeToButton.addActionListener(this);
        
        
        //Creating JLabel for Vehicle ID
        e_vIDJLabel=new JLabel();
        e_vIDJLabel.setText("Vehicle ID: ");
        e_vIDJLabel.setForeground(Color.WHITE);
        e_vIDJLabel.setBounds(20,200,250,40);
        e_vIDJLabel.setFont(f1);
        e_jPanel.add(e_vIDJLabel);
        
        //Creating JLabel for Vehicle Name
        e_vNameJLabel=new JLabel();
        e_vNameJLabel.setText("Vehicle Name: ");
        e_vNameJLabel.setForeground(Color.WHITE);
        e_vNameJLabel.setBounds(20,250,250,40);
        e_vNameJLabel.setFont(f1);
        e_jPanel.add(e_vNameJLabel);
        
        //Creating JLabel for Vehicle Weight
        e_vWeightJLabel=new JLabel();
        e_vWeightJLabel.setText("Vehicle Weight: ");
        e_vWeightJLabel.setForeground(Color.WHITE);
        e_vWeightJLabel.setBounds(20,300,250,40);
        e_vWeightJLabel.setFont(f1);
        e_jPanel.add(e_vWeightJLabel);
        
        //Creating JLabel for Vehicle Color
        e_vColorJLabel=new JLabel();
        e_vColorJLabel.setText("Vehicle Color: ");
        e_vColorJLabel.setForeground(Color.WHITE);
        e_vColorJLabel.setBounds(20,350,250,40);
        e_vColorJLabel.setFont(f1);
        e_jPanel.add(e_vColorJLabel);
        
        //Creating JLabel for Vehicle Speed
        e_vSpeedJLabel=new JLabel();
        e_vSpeedJLabel.setText("Vehicle Speed: ");
        e_vSpeedJLabel.setForeground(Color.WHITE);
        e_vSpeedJLabel.setBounds(20,400,250,40);
        e_vSpeedJLabel.setFont(f1);
        e_jPanel.add(e_vSpeedJLabel);
        
        //Creating JLabel for Battery Capacity
        e_batteryCapacityJLabel=new JLabel();
        e_batteryCapacityJLabel.setText("Battery Capacity: ");
        e_batteryCapacityJLabel.setForeground(Color.WHITE);
        e_batteryCapacityJLabel.setBounds(20,450,250,40);
        e_batteryCapacityJLabel.setFont(f1);
        e_jPanel.add(e_batteryCapacityJLabel);

        //Creating JLabel for Vehicle ID for purchasing
        e_vIDJLabel1=new JLabel();
        e_vIDJLabel1.setText("Vehicle ID: ");
        e_vIDJLabel1.setBounds(665,200,250,40);
        e_vIDJLabel1.setForeground(Color.WHITE);
        e_vIDJLabel1.setFont(f1);
        e_jPanel.add(e_vIDJLabel1);

        //Creating JLabel for Brand
        e_brandJLabel=new JLabel();
        e_brandJLabel.setText("Brand: ");
        e_brandJLabel.setBounds(665,250,250,40);
        e_brandJLabel.setForeground(Color.WHITE);
        e_brandJLabel.setFont(f1);
        e_jPanel.add(e_brandJLabel);

        //Creating JLabel for Price for purchasing
        e_priceJLabel=new JLabel();
        e_priceJLabel.setText("Price: ");
        e_priceJLabel.setBounds(665,300,250,40);
        e_priceJLabel.setForeground(Color.WHITE);
        e_priceJLabel.setFont(f1);
        e_jPanel.add(e_priceJLabel);
        
        //Creating JLabel for Charging Time
        e_chargingTimeJLabel=new JLabel();
        e_chargingTimeJLabel.setText("Charging Time: ");
        e_chargingTimeJLabel.setBounds(665,350,250,40);
        e_chargingTimeJLabel.setForeground(Color.WHITE);
        e_chargingTimeJLabel.setFont(f1);
        e_jPanel.add(e_chargingTimeJLabel);

        //Creating JLabel for Mileage
        e_mileageJLabel=new JLabel();
        e_mileageJLabel.setText("Mileage: ");
        e_mileageJLabel.setBounds(665,400,250,40);
        e_mileageJLabel.setForeground(Color.WHITE);
        e_mileageJLabel.setFont(f1);
        e_jPanel.add(e_mileageJLabel);
        
        //Creating JLabel for Range
        e_rangeJLabel=new JLabel();
        e_rangeJLabel.setText("Range: ");
        e_rangeJLabel.setBounds(665,450,250,40);
        e_rangeJLabel.setForeground(Color.WHITE);
        e_rangeJLabel.setFont(f1);
        e_jPanel.add(e_rangeJLabel);
        
        //Creating JLabel for Vehicle ID for Selling an Electric Scooter
        e_vIDJLabel2=new JLabel();
        e_vIDJLabel2.setText("Vehicle ID: ");
        e_vIDJLabel2.setBounds(20,560,250,40);
        e_vIDJLabel2.setForeground(Color.WHITE);
        e_vIDJLabel2.setFont(f1);
        e_jPanel.add(e_vIDJLabel2);
        
        //Creating JLabel for Price for Selling an Electric Scooter
        e_priceJLabel1=new JLabel();
        e_priceJLabel1.setText("Price: ");
        e_priceJLabel1.setBounds(20,610,250,40);
        e_priceJLabel1.setForeground(Color.WHITE);
        e_priceJLabel1.setFont(f1);
        e_jPanel.add(e_priceJLabel1);
        
        //Creating JLabel for Copy right
        copyRightJLabel2=new JLabel();
        copyRightJLabel2.setText("Copyright © 2021-2022 Singh's. All Rights Reserved");
        copyRightJLabel2.setBounds(500,720,350,40);
        copyRightJLabel2.setForeground(Color.WHITE);
        e_jPanel.add(copyRightJLabel2);
        
        
        //Creating JTextField for Vehicle ID
        e_vIDF=new JTextField();
        e_vIDF.setBounds(270,200,300,40);
        e_jPanel.add(e_vIDF);
        
        //Creating JTextField for Vehicle Name
        e_vNameF=new JTextField();
        e_vNameF.setBounds(270,250,300,40);
        e_jPanel.add(e_vNameF);
        
        //Creating JTextField for Vehicle Weight
        e_vWeightF=new JTextField();
        e_vWeightF.setBounds(270,300,300,40);
        e_jPanel.add(e_vWeightF);
        
        //Creating JTextField for Vehicle Color
        e_vColorF=new JTextField();
        e_vColorF.setBounds(270,350,300,40);
        e_jPanel.add(e_vColorF);
        
        //Creating JTextField for Vehicle Speed
        e_vSpeedF=new JTextField();
        e_vSpeedF.setBounds(270,400,300,40);
        e_jPanel.add(e_vSpeedF);
        
        //Creating JTextField for Battery Capacity
        e_batteryCapacityF=new JTextField();
        e_batteryCapacityF.setBounds(270,450,300,40);
        e_jPanel.add(e_batteryCapacityF);

        //Creatiing JTextField for Vehicle ID
        e_vIDF2=new JTextField();
        e_vIDF2.setBounds(915,200,300,40);
        e_jPanel.add(e_vIDF2);

        //Creating JTextField for Brand
        e_brandF=new JTextField();
        e_brandF.setBounds(915,250,300,40);
        e_jPanel.add(e_brandF);
        
        //Creating JTextField for Price
        e_priceF=new JTextField();
        e_priceF.setBounds(915,300,300,40);
        e_jPanel.add(e_priceF);

        //Creating JTextField for Charging Time
        e_chargingTimeF=new JTextField();
        e_chargingTimeF.setBounds(915,350,300,40);
        e_jPanel.add(e_chargingTimeF);

        //Creating JTextField for Mileage
        e_mileageF=new JTextField();
        e_mileageF.setBounds(915,400,300,40);
        e_jPanel.add(e_mileageF);

        //Creating JTextField for Range
        e_rangeF=new JTextField();
        e_rangeF.setBounds(915,450,300,40);
        e_jPanel.add(e_rangeF);
        
        //Creating JTextField for Sell an ElectriScooter
        e_vIDF3=new JTextField();
        e_vIDF3.setBounds(270,560,300,40);
        e_jPanel.add(e_vIDF3);
        
        e_priceF1=new JTextField();
        e_priceF1.setBounds(270,610,300,40);
        e_jPanel.add(e_priceF1);
        
        //Creating JButton to Add an Electric Scooter
        addButton2=new JButton("Add an Electric Scooter");
        addButton2.setBounds(20,500,550,50);
        addButton2.setFont(f1);
        e_jPanel.add(addButton2);
        addButton2.addActionListener(this);

        //Creating JButton to Purchase an Electric Scooter
        purchaseButton=new JButton("Purchase an Electric Scooter");
        purchaseButton.setFont(f1);
        purchaseButton.setBounds(665,500,550,50);
        e_jPanel.add(purchaseButton);
        purchaseButton.addActionListener(this);
        
        //Creating JButton to Sell an Electric Scooter
        sellButton=new JButton("Sell an Electric Scooter");
        sellButton.setFont(f1);
        sellButton.setBounds(20,660,550,50);
        e_jPanel.add(sellButton);
        sellButton.addActionListener(this);

        //Creating JButton to Display
        e_displayButton=new JButton("Display");
        e_displayButton.setFont(f1);
        e_displayButton.setBounds(665,580,250,50);
        e_jPanel.add(e_displayButton);
        e_displayButton.addActionListener(this);

        //Creating JButton to Clear all TextField
        e_clearButton=new JButton("Clear");
        e_clearButton.setFont(f1);
        e_clearButton.setForeground(Color.red);
        e_clearButton.setBounds(965,580,250,50);
        e_jPanel.add(e_clearButton);
        e_clearButton.addActionListener(this);
        
        electric_jframe.setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==changeToButton) //Change for Electric Scooter(Button)
        {
            auto_jframe.setVisible(false);
            electricScooter_method();    
        }
        if(ae.getSource()==e_changeToButton) //Change for Auto Rickshaw (Button)
        {
            electric_jframe.setVisible(false);
            autoRickshaw_method();   
        }
        //AutoRickshaw buttons
        if(ae.getSource()==addButton) //Add an Auto Rickshaw (Button)
        {
            try
            {
                String vID=vIDF.getText();  //get value from vIDF JTextField
                int v_vID=Integer.parseInt(vID);//Convert String to Integer datatype
    
                String vName=vNameF.getText(); //get value from vNameF JTextField
                String vWeight=vWeightF.getText(); //get value from vWeightF JTextField
                String vColor=vColorF.getText(); //get value from vColorF JTextField
                String vSpeed=vSpeedF.getText(); //get value from vSpeedF JTextField
                
                String eD=eDF.getText(); //get value from  eDF JTextField
                int v_eD=Integer.parseInt(eD);//Convert String to Integer
                
                String torque=torqueF.getText(); //get value from torqueF JTextField
                
                String FTC=FTCF.getText(); //get value from FTCF JTextField
                int v_FTC=Integer.parseInt(FTC); //Convert String to Integer dataType
                
                String gClearance=gClearanceF.getText(); //get value from gClearanceF JTextField
                
                //Creating an Object of an AutoRickshaw
                AutoRickshaw AR_obj=new AutoRickshaw(v_vID,vName,vWeight,vColor,vSpeed,v_eD,torque,v_FTC,gClearance);
                al_obj.add(AR_obj);
                //Dialogue box
                JOptionPane.showMessageDialog(auto_jframe," You have successfully added.\n Vehicle ID: "+v_vID+"\n Vehicle Name: "+vName+"\n Vehicle Weight: "+vWeight+
                "\n Vehicle Color: "+vColor+"\n Vehicle Speed: "+vSpeed+"\n Engine Displacement: "+v_eD+"\n Torque: "+torque+"\n Fuel Tank Capacity: "+v_FTC+
                "\n Ground Clearance: "+gClearance);   
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(auto_jframe,"Please enter the correct Value..");
            }
    
        }
        if(ae.getSource()==bookButton)
        {
            try
            {
                int v_vID=Integer.parseInt(vIDF2.getText());
                String bookedYear=cYear.getSelectedItem().toString();
                String bookedMonth=cMonth.getSelectedItem().toString();
                String bookedDay=cDay.getSelectedItem().toString();
                String bookedDate=bookedYear+" "+bookedMonth+" "+bookedDay;
                int v_chargeAmount=Integer.parseInt(chargeAmountF.getText());
                int no_of_seats=Integer.parseInt(noOfSeatsF.getText());
                
                for(Vehicle vehicle_obj:al_obj)
                {
                    if(vehicle_obj instanceof AutoRickshaw)
                    {
                        //DOWNCASTING
                        AutoRickshaw auto_obj=(AutoRickshaw) vehicle_obj;
                        if(auto_obj.getVehicleID()==v_vID)
                        {
                            if(auto_obj.getIsBooked()==true)
                            {
                                JOptionPane.showMessageDialog(auto_jframe,"The AutoRickshaw having Vehicle ID "+v_vID+" has been already booked.");
                                break;
                            }
                            else if(auto_obj.getIsBooked()==false)
                            {
                                auto_obj.book(bookedDate,v_chargeAmount,no_of_seats);
                                JOptionPane.showMessageDialog(auto_jframe,"Thank You..Your Auto Rickshaw has been booked successfully.\n"+
                                "\n Vehicle ID: "+v_vID+
                                "\n Charge Amount: "+v_chargeAmount+
                                "\n Number of Seats: "+no_of_seats+
                                "\n Booked Date: "+bookedDate);
                                
                                
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(auto_jframe," Sorry !. The AutoRickshaw with vehicle ID "+v_vID+"has not been added yet.");
                            break;
                        }
                    }
                }
            }
            catch(NumberFormatException nfe1)
            {
                JOptionPane.showMessageDialog(auto_jframe," Please enter the correct Value..");
                
            }
        }
        //display button in AutoRickshaw GUI
        if(ae.getSource()==displayButton)
        {
            for(Vehicle vehicle_obj1:al_obj)
            {
                if(vehicle_obj1 instanceof AutoRickshaw)
                {
                    //DOWNCASTING
                    AutoRickshaw auto_obj1=(AutoRickshaw) vehicle_obj1;
                    auto_obj1.display();
                    
                }
            }
        }
        
        //Clear button in AutoRickshaw GUI
        if(ae.getSource()==clearButton) // Clear (Button) for Auto Rickshaw GUI
        {
            vIDF.setText(null);
            vNameF.setText(null);
            vWeightF.setText(null);
            vColorF.setText(null);
            vSpeedF.setText(null);
            eDF.setText(null);
            torqueF.setText(null);
            FTCF.setText(null);
            gClearanceF.setText(null); 
            vIDF2.setText(null);
            chargeAmountF.setText(null);
            noOfSeatsF.setText(null);   
        }
        
        //Electric Scooter Buttons
        if(ae.getSource()==addButton2) //Add an Electric Scooter (Button)
        {
            try
            {
                String e_vID=e_vIDF.getText();
                int v_e_vID=Integer.parseInt(e_vID);
                
                String e_vName=e_vNameF.getText();
                String e_vWeight=e_vWeightF.getText();
                String e_vColor=e_vColorF.getText();
                String e_vSpeed=e_vSpeedF.getText();
                String e_batteryCapacity=e_batteryCapacityF.getText();
                int v_e_batteryCapacity=Integer.parseInt(e_batteryCapacity);
                
                //Calling ElectricScooter class Constructor
                ElectricScooter ES_obj=new ElectricScooter(v_e_vID, e_vName, e_vWeight, e_vColor, e_vSpeed, v_e_batteryCapacity);
                //Adding obj of ElectricScooter into ArrayList
                al_obj.add(ES_obj);
                //Dialogue box
                //JOptionPane.showMessageDialog(electric_jframe," You have successfully added.\n Vehicle ID: "+e_vID+"\n Vehicle Name: "+e_vName+"\n Vehicle Weight: "+e_vWeight+
                //"\n Vehicle Color: "+e_vColor+"\n Vehicle Speed: "+e_vSpeed+"\n Battery Capacity: "+v_e_batteryCapacity);  
                JOptionPane.showMessageDialog(electric_jframe,"You have successfully added.\n Vehicle ID: "+v_e_vID+"\n Vehicle Name: "+e_vName+"\n Vehicle Weight: "+e_vWeight+
                "\n Vehicle Color: "+e_vColor+"\n Vehicle Speed: "+e_vSpeed+"\n Battery Capacity: "+v_e_batteryCapacity+"\n "," Event Status: ",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException nfe1)
            {
                JOptionPane.showMessageDialog(electric_jframe,"Please enter valid data..");
            }
        }
        //Purchase Button in Electric Scooter
        if(ae.getSource()==purchaseButton)
        {
            try
            {
                int e_ID=Integer.parseInt(e_vIDF2.getText());
                String e_brand=e_brandF.getText();
                int e_price=Integer.parseInt(e_priceF.getText());
                String e_chargingTime=e_chargingTimeF.getText();
                String e_mileage=e_mileageF.getText();
                int e_range=Integer.parseInt(e_rangeF.getText());
                
                for(Vehicle vehicle_obj2:al_obj)
                {
                    if(vehicle_obj2 instanceof ElectricScooter)
                    {
                        //DOWNCASTING
                        ElectricScooter electric_obj=(ElectricScooter) vehicle_obj2;
                        if(electric_obj.getVehicleID()==e_ID)
                        {
                            if(electric_obj.getHasPurchased()==true)
                            {
                                JOptionPane.showMessageDialog(electric_jframe," Sorry The Electric Scooter with the vehicle ID "+e_ID+" has been already purchased.\n You can purchase another Electric Scooter.");
                                break;
                            }
                            else if(electric_obj.getHasPurchased()==false)
                            {
                                electric_obj.purchase(e_brand,e_price,e_chargingTime,e_mileage,e_range);
                                JOptionPane.showMessageDialog(electric_jframe,"Congratulation.You have successfully purchased an Electric Scooter.\n"+
                                "\n Vehicle ID: "+e_ID+
                                "\n Price: "+e_price+
                                "\n Brand: "+e_brand+
                                "\n Charging Tiime: "+e_chargingTime+
                                "\n Mileage: "+e_mileage+
                                "\n Range: "+e_range);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(electric_jframe,"Sorry ! The Electric Scooter with the Vehicle ID; "+e_ID+" has not been added yet. ");
                            break;   
                        }
                        
                    }
                }    
            }
            catch(NumberFormatException nfe2)
            {
                JOptionPane.showMessageDialog(electric_jframe,"Please Enter Valid data..");    
            }
            
        }
        //Sell Button in Electric Scooter
        if(ae.getSource()==sellButton)
        {
            try
            {
                int e_ID=Integer.parseInt(e_vIDF3.getText());
                int e_price=Integer.parseInt(e_priceF1.getText());
                for(Vehicle vehicle_obj3:al_obj)
                {
                    if(vehicle_obj3 instanceof ElectricScooter)
                    {
                        ElectricScooter electric_obj2=(ElectricScooter) vehicle_obj3;
                        if(electric_obj2.getVehicleID()==e_ID)
                        {
                            if(electric_obj2.getHasSold()==true)
                            {
                                JOptionPane.showMessageDialog(electric_jframe,"Sorry! The Electric Scooter with Vehicle ID "+e_ID+" has been already sold.");
                                break;
                            }
                            else if(electric_obj2.getHasSold()==false)
                            {
                                JOptionPane.showMessageDialog(electric_jframe," Congratulation! The Electric Scooter has been sold successfully..\n"+
                                "\n Vehicle ID: "+e_ID+
                                "\n Price: "+e_price);
                                
                            }
                        }   
                    }   
                }   
            }
            catch(NumberFormatException nfe3)
            {
                JOptionPane.showMessageDialog(electric_jframe," Please enter Valid data.");
                
            }
            
        }
        if(ae.getSource()==e_displayButton)
        {
            for(Vehicle vehicle_obj4:al_obj)
            {
                //DOWNCASTING
                ElectricScooter electric_obj3=(ElectricScooter) vehicle_obj4;
                electric_obj3.display();
                
            }
        }
        if(ae.getSource()==e_clearButton) //Clear (Button) for Electric Scooter GUI
        {
            e_vIDF.setText(null);
            e_vNameF.setText(null);
            e_vWeightF.setText(null);
            e_vColorF.setText(null);
            e_vSpeedF.setText(null);
            e_batteryCapacityF.setText(null); 
            e_vIDF2.setText(null);
            e_brandF.setText(null);
            e_priceF.setText(null);
            e_chargingTimeF.setText(null);
            e_mileageF.setText(null);
            e_rangeF.setText(null);
            e_vIDF3.setText(null);
            e_priceF1.setText(null);    
        }      
    }
    public static void main(String args[])
    {
        TransportGUI ref=new TransportGUI();
        ref.autoRickshaw_method();    
    }   
}