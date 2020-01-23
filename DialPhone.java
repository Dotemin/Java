
import java.awt.event.*;
import java.awt.*;


public class DialPhone extends Frame {
    TextField displayPhoneNbr;
    Panel buttonPanel;
    Panel bottomPanel;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonStar, button0, buttonDiez, buttonDial;

    public DialPhone(String title, int width, int height) {
        super(title);
        setLayout(new BorderLayout(10, 10));
        displayPhoneNbr = buildDisplayPhoneNbr(width * 5 / 10, height / 10);
        buttonPanel = buildButtonPanel();
        buttonPanel.setPreferredSize(new Dimension(width * 5 / 10, height * 7 / 10));
        bottomPanel = buildBottomPanel();
        bottomPanel.setPreferredSize(new Dimension(width * 5 / 10, height / 10));
        add(BorderLayout.NORTH, displayPhoneNbr);
        add(BorderLayout.CENTER, buttonPanel);
        add(BorderLayout.SOUTH, bottomPanel);
        addWindowListener(new WindowCloser());
        setSize(width, height);
        setVisible(true);
    }

    public void setDisplayPhoneNbr(TextField curDisplayPhoneNbr) {
        displayPhoneNbr = curDisplayPhoneNbr;
    }

    public void setButtonPanel(Panel curButtonPanel) {
        buttonPanel = curButtonPanel;
    }

    public void setBottomPanel(Panel curBottomPanel) {
        bottomPanel = curBottomPanel;
    }

    public void setButton1(Button curButton1) {
        button1 = curButton1;
    }

    public void setButton2(Button curButton2) {
        button2 = curButton2;
    }

    public void setButton3(Button curButton3) {
        button3 = curButton3;
    }

    public void setButton4(Button curButton4) {
        button4 = curButton4;
    }

    public void setButton5(Button curButton5) {
        button5 = curButton5;
    }

    public void setButton6(Button curButton6) {
        button6 = curButton6;
    }

    public void setButton7(Button curButton7) {
        button7 = curButton7;
    }

    public void setButton8(Button curButton8) {
        button8 = curButton8;
    }

    public void setButton9(Button curButton9) {
        button9 = curButton9;
    }

    public void setButtonStar(Button curButtonStar) {
        buttonStar = curButtonStar;
    }

    public void setButton0(Button curButton0) {
        button0 = curButton0;
    }

    public void setButtonDiez(Button curButtonDiez) {
        buttonDiez = curButtonDiez;
    }

    public void setButtonDial(Button curButtonDial) {
        buttonDial = curButtonDial;
    }

    public TextField getDisplayPhoneNbr() {
        return displayPhoneNbr;
    }

    public Panel getButtonPanel() {
        return buttonPanel;
    }

    public Panel getBottomPanel() {
        return bottomPanel;
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Button getButton3() {
        return button3;
    }

    public Button getButton4() {
        return button4;
    }

    public Button getButton5() {
        return button5;
    }

    public Button getButton6() {
        return button6;
    }

    public Button getButton7() {
        return button7;
    }

    public Button getButton8() {
        return button8;
    }

    public Button getButton9() {
        return button9;
    }

    public Button getButtonStar() {
        return buttonStar;
    }

    public Button getButton0() {
        return button0;
    }

    public Button getButtonDiez() {
        return buttonDiez;
    }

    public Button getButtonDial() {
        return buttonDial;
    }


    public TextField buildDisplayPhoneNbr(int width, int height) {
        TextField myDisplayPhoneNbr = new TextField();
        myDisplayPhoneNbr.setPreferredSize(new Dimension(width, height));
        return myDisplayPhoneNbr;
    }

    public void createButton(Panel curButtonPanel, int i) {

        switch (i) {
        case 1:
            button1 = new Button("1");
            button1.addActionListener(new ButtonListener());
            curButtonPanel.add(button1);
            break;

        case 2:
            button2 = new Button("2");
            button2.addActionListener(new ButtonListener());
            curButtonPanel.add(button2);
            break;

        case 3:
            button3 = new Button("3");
            button3.addActionListener(new ButtonListener());
            curButtonPanel.add(button3);
            break;

        case 4:
            button4 = new Button("4");
            button4.addActionListener(new ButtonListener());
            curButtonPanel.add(button4);
            break;

        case 5:
            button5 = new Button("5");
            button5.addActionListener(new ButtonListener());
            curButtonPanel.add(button5);
            break;

        case 6:
            button6 = new Button("6");
            button6.addActionListener(new ButtonListener());
            curButtonPanel.add(button6);
            break;

        case 7:
            button7 = new Button("7");
            button7.addActionListener(new ButtonListener());
            curButtonPanel.add(button7);
            break;

        case 8:
            button8 = new Button("8");
            button8.addActionListener(new ButtonListener());
            curButtonPanel.add(button8);
            break;

        case 9:
            button9 = new Button("9");
            button9.addActionListener(new ButtonListener());
            curButtonPanel.add(button9);
            break;
        }
    }

    public Panel buildButtonPanel() {
        Panel curButtonPanel = new Panel();
        Button curButton;
        curButtonPanel.setLayout(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            createButton(curButtonPanel, i);
        }
        buttonStar = new Button("*");
        buttonStar.addActionListener(new ButtonListener());
        curButtonPanel.add(buttonStar);
        button0 = new Button("0");
        button0.addActionListener(new ButtonListener());
        curButtonPanel.add(button0);
        buttonDiez = new Button("#");
        buttonDiez.addActionListener(new ButtonListener());
        curButtonPanel.add(buttonDiez);
        return curButtonPanel;
    }

    public Panel buildBottomPanel() {
        Panel curBottomPanel = new Panel();
        curBottomPanel.setLayout(new FlowLayout());
        buttonDial = new Button("Dial");
        buttonDial.addActionListener(new ButtonListener());
        curBottomPanel.add(buttonDial);
        return curBottomPanel;
    }


    public static void main(String[] args) {
        DialPhone myDial = new DialPhone("Simulation of phone number dialing", 250, 200);
    }
    //add a class here for button listener. That class must implement the method public void actionPerformed(ActionEventevt) . Please note that you should make sure that each digit typed by a user must be copied in the TextField variable named myText.

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            final int IC_PHONENBR_SIZE = 8; //Ivory Coast Phone Number Size
            String finalDial = "";
            String buttonVal = evt.getActionCommand();

            if (buttonVal != "*" && buttonVal != "#" && buttonVal != "Dial") {
                finalDial = displayPhoneNbr.getText();
                finalDial = (finalDial + buttonVal).trim();
                displayPhoneNbr.setText(finalDial);
            } else if (buttonVal == "Dial") {
                finalDial = displayPhoneNbr.getText();
                if (finalDial.length() == IC_PHONENBR_SIZE) {
                    System.out.println("Dialing number " + finalDial);
                    finalDial = "";
                    displayPhoneNbr.setText(finalDial);
                } else {
                    System.out.println(finalDial +
                                       ": Wrong Phone number size... Please use 8 digits for Ivory Coast Phone..");
                    finalDial = "";
                    displayPhoneNbr.setText(finalDial);
                }
            } else {
                System.out.println(buttonVal +
                                   ": Wrong button, special character not allowed... Please use 8 digits (between 0-9) for Ivory Coast Phone..");
            }
        }
    }

    class WindowCloser extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
        }
    }
}
