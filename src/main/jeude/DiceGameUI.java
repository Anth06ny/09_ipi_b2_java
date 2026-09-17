package main.jeude;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceGameUI extends JPanel implements ActionListener {

    // Composants graphiques
    private JTextField jtfScoreP1;
    private JTextField jtfD1;
    private JTextField jtfD2;
    private JTextField jtfScoreP2;
    private JButton jbRollP1;
    private JLabel jlTourNumber;
    private JButton jbRollP2;
    private JButton jbRestart;
    private JLabel lblD1;
    private JLabel lblD2;
    private JLabel jlP1;
    private JLabel jlP2;
    private JLabel labelScoreP2;
    private JLabel lblScoreJ1;
    private JLabel lblTour;
    private JLabel jlMessage;
    private JCheckBox jcbP1, jcbP2;

    //Model jeu de données
    private PartyBean partyBean = new PartyBean("Toto", "Tata");

    /**
     * Create the application.
     */
    public DiceGameUI() {
        //construct components
        jlP1 = new JLabel(partyBean.getJ1().getName());

        jlP2 = new JLabel(partyBean.getJ2().getName());

        lblD1 = new JLabel("DE 1");

        lblD2 = new JLabel("DE 2");

        lblScoreJ1 = new JLabel("Score");

        jtfScoreP1 = new JTextField();

        jtfD1 = new JTextField();
        jtfD1.setText(partyBean.getJ1().getCup().getD1().getValue() + "");

        jtfD2 = new JTextField();
        jtfD2.setText(partyBean.getJ1().getCup().getD2().getValue() + "");

        jtfScoreP2 = new JTextField();

        labelScoreP2 = new JLabel("Score : ");

        lblTour = new JLabel("Tour : ");

        jlTourNumber = new JLabel(partyBean.getRound() + "");

        jbRollP1 = new JButton("Lancer");
        jbRollP1.addActionListener(this);


        jbRollP2 = new JButton("Lancer");
        jbRollP2.addActionListener(this);
        jbRollP2.setVisible(false);

        jbRestart = new JButton("Restart");
        jbRestart.setVisible(false);
        jbRestart.addActionListener(e -> {
               partyBean = new PartyBean(partyBean.getJ1().getName(), partyBean.getJ2().getName());

               //mise à jour graphque :
            jtfD1.setText(partyBean.getJ2().getCup().getD1().getValue() + "");
            jtfD2.setText(partyBean.getJ2().getCup().getD2().getValue() + "");
            jtfScoreP1.setText(partyBean.getJ1().getScore() + "");
            jtfScoreP2.setText(partyBean.getJ2().getScore() + "");
            jlTourNumber.setText(partyBean.getRound() + "");
            jbRollP1.setVisible(true);
            jbRollP2.setVisible(false);
            jbRestart.setVisible(false);
            jlMessage.setText("");

        });


        jcbP1 = new JCheckBox("Tricheur");
        jcbP1.addChangeListener(e -> {
               partyBean.getJ1().setCheater(jcbP1.isSelected());
        });

        jcbP2 = new JCheckBox("Tricheur");
        jcbP2.addChangeListener(e -> {
            partyBean.getJ2().setCheater(jcbP2.isSelected());
        });
        jlMessage = new JLabel("");

        //adjust size and set layout
        setPreferredSize(new Dimension(682, 403));
        setLayout(null);

        //add components
        add(jlP1);
        add(jlP2);
        add(lblD1);
        add(lblD2);
        add(lblScoreJ1);
        add(jtfScoreP1);
        add(jtfD1);
        add(jtfD2);
        add(labelScoreP2);
        add(jtfScoreP2);
        add(lblTour);
        add(jlTourNumber);
        add(jbRollP1);
        add(jbRollP2);
        add(jbRestart);
        add(jcbP1);
        add(jcbP2);
        add(jlMessage);

        //set component bounds (only needed by Absolute Positioning)
        jlP1.setBounds(39, 45, 82, 18);
        jlP2.setBounds(500, 45, 108, 18);
        lblD1.setBounds(235, 123, 46, 14);
        lblD2.setBounds(315, 123, 46, 14);
        lblScoreJ1.setBounds(33, 93, 57, 23);
        jtfScoreP1.setBounds(86, 96, 35, 20);
        jtfD1.setBounds(211, 148, 70, 64);
        jtfD2.setBounds(304, 148, 70, 64);
        labelScoreP2.setBounds(479, 93, 57, 23);
        jtfScoreP2.setBounds(532, 96, 35, 20);
        lblTour.setBounds(247, 36, 67, 27);
        jlTourNumber.setBounds(324, 36, 37, 27);
        jbRollP1.setBounds(33, 169, 89, 23);
        jbRollP2.setBounds(479, 169, 89, 23);
        jbRestart.setBounds(221, 290, 140, 23);
        jcbP1.setBounds(24, 119, 97, 23);
        jcbP2.setBounds(470, 119, 97, 23);
        jlMessage.setBounds(0, 251, 586, 14);

    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jeu de dés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DiceGameUI());
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbRollP1) {
            //Le joueur 1 lance
            //Modification des données
            partyBean.getJ1().roll();
            if (partyBean.getJ1().getCup().getScoreDice() >= 7) {
                partyBean.getJ1().add1Point();
            }

            //Modification de l'UI
            jtfD1.setText(partyBean.getJ1().getCup().getD1().getValue() + "");
            jtfD2.setText(partyBean.getJ1().getCup().getD2().getValue() + "");
            jtfScoreP1.setText(partyBean.getJ1().getScore() + "");
            jbRollP1.setVisible(false);
            jbRollP2.setVisible(true);


        } else if (e.getSource() == jbRollP2) {
            //Le joueur 2 lance
            //Modification des données
            partyBean.getJ2().roll();
            if (partyBean.getJ2().getCup().getScoreDice() >= 7) {
                partyBean.getJ2().add1Point();
            }
            partyBean.add1Round();

            //Modification de l'UI
            jtfD1.setText(partyBean.getJ2().getCup().getD1().getValue() + "");
            jtfD2.setText(partyBean.getJ2().getCup().getD2().getValue() + "");
            jtfScoreP2.setText(partyBean.getJ2().getScore() + "");
            jlTourNumber.setText(partyBean.getRound() + "");
            jbRollP1.setVisible(true);
            jbRollP2.setVisible(false);

            if(partyBean.getRound() == 4) {
                jbRollP1.setVisible(false);
                jbRollP2.setVisible(false);
                jbRestart.setVisible(true);

                //affichage gagnant
                if(partyBean.winner() != null) {
                    jlMessage.setText(partyBean.winner().getName() + " a gagné");
                }
                else {
                    jlMessage.setText("Egalité");
                }

            }
        }
    }
}