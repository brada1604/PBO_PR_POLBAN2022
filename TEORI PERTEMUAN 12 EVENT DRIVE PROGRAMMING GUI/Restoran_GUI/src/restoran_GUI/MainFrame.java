package restoran_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.TextField;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TfName;
	private JTextField TfAlamat;
	private JTextField TfTelp;
	private TextField TfTotal;
	private JCheckBox chckbxMenu1;
	private JCheckBox chckbxMenu2;
	private JCheckBox chckbxMenu3;
	private String Struk = "";
	
	private void getTotal() {
        
        int totalBayar = 0;
        
        if (chckbxMenu1.isSelected()) {
            totalBayar += 10000;
        }
        if (chckbxMenu2.isSelected()) {
            totalBayar += 20000;
        }
        if (chckbxMenu3.isSelected()) {
            totalBayar += 30000;
        }
        
        TfTotal.setText(String.valueOf(totalBayar));
//        TfTotal.setText("ini total");
    }


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Aplikasi Pemesanan Makan - Restoran Bagus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APLIKASI PEMESANAN");
		lblNewLabel.setBounds(152, 30, 151, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Data Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 55, 195, 112);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Name     :");
		panel.add(lblNewLabel_1);
		
		TfName = new JTextField();
		panel.add(TfName);
		TfName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Alamat  : ");
		panel.add(lblNewLabel_2);
		
		TfAlamat = new JTextField();
		panel.add(TfAlamat);
		TfAlamat.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("No Telp : ");
		panel.add(lblNewLabel_3);
		
		TfTelp = new JTextField();
		panel.add(TfTelp);
		TfTelp.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Pilihan Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(234, 55, 190, 112);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		chckbxMenu1 = new JCheckBox("Steak [10000]");
		chckbxMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTotal();
			}
		});
		chckbxMenu1.setBounds(16, 25, 93, 23);
		panel_1.add(chckbxMenu1);
		
		chckbxMenu2 = new JCheckBox("Spagethi [20000]");
		chckbxMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTotal();
			}
		});
		chckbxMenu2.setBounds(16, 51, 109, 23);
		panel_1.add(chckbxMenu2);
		
		 chckbxMenu3 = new JCheckBox("Pizza [30000]");
		 chckbxMenu3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		getTotal();
		 	}
		 });
		chckbxMenu3.setBounds(16, 77, 91, 23);
		panel_1.add(chckbxMenu3);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL BAYAR");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(244, 178, 82, 14);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Data Penjualan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 255, 414, 168);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		TextArea TaResult = new TextArea();
		TaResult.setBounds(10, 20, 394, 138);
		panel_2.add(TaResult);
		
		JButton btnTambah = new JButton("TAMBAH");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Struk += "Nama     :  " + TfName.getText() + "\n";
		        Struk += "Alamat   :  " + TfAlamat.getText() + "\n";
		        Struk += "Telepon :  " + TfTelp.getText() + "\n";
		        
		        Struk += "-------------- Pesanan Anda -----------------\n";
		        if (chckbxMenu1.isSelected()) {
		        	Struk += " - " + chckbxMenu1.getText() + "\n";
		        }
		        if (chckbxMenu2.isSelected()) {
		        	Struk += " - " + chckbxMenu2.getText() + "\n";
		        }
		        if (chckbxMenu3.isSelected()) {
		        	Struk += " - " + chckbxMenu3.getText() + "\n";
		        }
		        Struk += "-----------------------------------------------------\n";
		        
		        Struk += "Total Bayar : Rp." + TfTotal.getText() + "\n";
		        
		        Struk += "-----------------------------------------------------\n";
		        Struk += "\n";
		        Struk += "\n";


				TaResult.setText(Struk);
			}
		});
		btnTambah.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTambah.setBounds(335, 228, 89, 23);
		contentPane.add(btnTambah);
		
		TfTotal = new TextField();
		TfTotal.setBounds(234, 198, 190, 22);
		contentPane.add(TfTotal);
	}
}
