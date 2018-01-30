package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import FlowerMng.FlowerMng;
import in.InBiz;
import out.OutBiz;
import vo.InVO;
import vo.OutVO;

class ImagePanel extends JPanel {
	private ImageIcon icon = new ImageIcon("C:\\images\\330.320.jpg");
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		g.drawImage(icon.getImage(), 0, 0, null);

		setOpaque(false);
		super.paintComponent(g);

	}
}

class Maintitle extends JPanel {
	private ImageIcon icon2 = new ImageIcon("C:\\images\\maintitle2.jpg");
	private Image img1 = icon2.getImage();

	public void paintComponent(Graphics g) {
		g.drawImage(icon2.getImage(), 0, 0, null);

		setOpaque(false);
		super.paintComponent(g);
	}
}

class Background extends JPanel {
	private ImageIcon icon = new ImageIcon("C:\\images\\400.320.jpg");
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		g.drawImage(icon.getImage(), 0, 0, null);

		setOpaque(false);
		super.paintComponent(g);

	}
}

class flowertitle extends JPanel {
	private ImageIcon icon = new ImageIcon("C:\\images\\flowertitle.jpg");
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		g.drawImage(icon.getImage(), 0, 0, null);

		setOpaque(false);
		super.paintComponent(g);

	}
}

class flowermng extends JPanel {
	private ImageIcon icon = new ImageIcon("C:\\images\\330.320.jpg");
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		g.drawImage(icon.getImage(), 0, 0, null);

		setOpaque(false);
		super.paintComponent(g);

	}
}

public class FlowerFinal implements ActionListener {

	JFrame jFrame;
	JPanel jPanel; // main title ���� �г�(�ɺ��� �Ƹ��ٿ� �״뿩)
	JPanel jPanel2; // �԰�,���,�� ���� ��ư ���� �г�
	JPanel jPanel4; // �Է�, ����, ���� ��ư ���� �г�
	JPanel jPanel5; // �԰���� ����Ʈ ������ �г�
	JPanel jPanel6; // ������ ����Ʈ ������ �г�
	JPanel jPanel7; // �� ���� ������ ������ �г�

	// JPanel jPanel8; // �� ���� Ÿ��Ʋ ������ �г� (�� ���� �г�)
	JPanel jPanel10;// ������ �Է�, ����, ���� ��ư ���� �г�

	JLabel mainName, labelInInsert1, labelInInsert2, labelInInsert3, labelInInsert4, labelInInsert5, labelInInsert6;
	JButton inbutton, outbutton, mngbutton, extProgram;
	JButton register, delete, modify;// �԰���� ��ư
	JButton register2, delete2, modify2;// ������ ��ư
	JTable flowerTable, flowerOutTable;// flower list�� ���� table
	DefaultTableModel model, model2;// table�� �� ��
	JScrollPane tbl_sp, tbl_sp2;// ��ũ��
	String category[] = { "�ڵ�", "�ɸ�", "�ܼ�", "����", "���", "�԰���" };// table �޴�
	String category2[] = { "�ڵ�", "�ɸ�", "�ܼ�", "�ǸŰ�", "�ŷ�ó��", "�Ǹ���" };

	ArrayList<String> flowercode;
	JComboBox cx = null;
	JComboBox gradeCx = null;
	String gradecx[] = { "��", "��", "��" };
	JComboBox gradeCx2 = null;

	JButton comin1; // �԰�������� �Է¿Ϸ�
	JButton comin2; // �԰�������� �����Ϸ�
	JButton comin3; // �԰�������� �����Ϸ�
	JButton comout1; // ���������� �Է¿Ϸ�
	JButton comout2; // ���������� �����Ϸ�
	JButton comout3; // ���������� �����Ϸ�
	JButton complete; // �ɰ������� �Ϸ�

	JPanel jPanelin1;
	// jPanelin1 jPanelin1 = new jPanelin1(); // �԰�������� �Է�â
	JPanel jPanelin2; // �԰�������� ����â
	JPanel jPanelin3;// �԰�������� ����â
	JPanel jPanelout1; // ������ �Է�
	JPanel jPanelout2; // ��-����
	JPanel jPanelout3;// ��-����

	// ================================������==============================
	Color pink_b = new Color(127, 85, 169);
	Color purple_a = new Color(213, 199, 227);
	Color gray = new Color(235, 235, 235);
	// ==================================================================

	// ==========================�̹�������==================================
	ImagePanel imgpl = new ImagePanel();
	Maintitle maintitle = new Maintitle();// ���� Ÿ��Ʋ �г�
	Background background = new Background(); // �԰�,��� �� ��ư ���� �г�
	flowertitle jPanel8 = new flowertitle();
	// ====================================================================

	TextField t1, t2, textOutInsert1, textOutInsert2, textOutInsert3, textOutInsert4, textOutInsert5;
	JLabel mngcode, mngtitle, jPanelguide;
	TextField mngtxt;
	// �������� �� �󺧰� �ؽ�Ʈ �ʵ�
	JLabel o1, o2, o3, o4, o5, o6, o7, o8, o9, o10;
	TextField ot1, ot2, ot3, ot4, ot5, ot6, ot7, ot8, ot9, ot10;
	// �԰� ������ �� �󺧰� �ؽ�Ʈ �ʵ�
	JLabel i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
	TextField it1, it2, it3, it4, it5, it6, it7, it8, it9, it10;

	// ================================mvc���� ���ῡ
	// �ʿ��Ѿ��̵�==============================
	ArrayList<String> flowername = null;
	FlowerMng flowermng = new FlowerMng();
	InBiz inbiz = null;
	OutBiz outbiz = null;
	ArrayList<InVO> inlist = null;
	ArrayList<OutVO> outlist = null;
	InVO in = null;
	OutVO out = null;
	int flower_code, amount, grade, prime_cost;
	String flower_name, client_code;
	Date register_date = null;
	FlowerMng manage;
	// ===================================================================================

	public FlowerFinal() {

		// ================================mvc���� ���ῡ �ʿ���
		// ���̵�==============================
		

		inbiz = new InBiz();

		// ===================================================================================

		imgpl.setLayout(null);
		imgpl.setBounds(400, 61, 330, 380);

		jFrame = new JFrame("Flower Management Program");
		jFrame.setLayout(null);
		jFrame.setBounds(40, 40, 1270, 380);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
		jFrame.add(imgpl);

		background.setLayout(null);
		background.setBounds(0, 61, 400, 380);
		background.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 1)));// �׵θ� �׸���
		jFrame.add(background);

		// 3. Maintitle �̹��� ����

		maintitle.setLayout(null);
		maintitle.setBounds(0, 0, 400, 60);
		jFrame.add(maintitle);

		// 4. �Է�, ����, ���� ��ư�� ���� �г�
		jPanel4 = new JPanel(null);
		jPanel4.setBounds(400, 0, 330, 60);
		jFrame.add(jPanel4);

		jPanel10 = new JPanel(null);
		jPanel10.setBounds(400, 0, 330, 60);
		// jFrame.add(jPanel10);

		// 5. ����Ʈ�� �� �г�
		jPanel5 = new JPanel(null);
		jPanel5.setBounds(730, 0, 540, 380);
		jPanel5.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 1)));
		jFrame.add(jPanel5);

		// 7. ù ��° �гο� �԰�, ���, �� ����, ������ ��ư �ֱ�
		inbutton = new JButton("�԰� ����");
		inbutton.setBounds(70, 40, 250, 40);
		inbutton.setBackground(gray);
		inbutton.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		inbutton.addActionListener(this);
		background.add(inbutton);

		outbutton = new JButton("��� ����");
		outbutton.setBounds(70, 100, 250, 40);
		outbutton.setBackground(gray);
		outbutton.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		outbutton.addActionListener(this);
		background.add(outbutton);

		mngbutton = new JButton("�� ����");
		mngbutton.setBounds(70, 160, 250, 40);
		mngbutton.setBackground(gray);
		mngbutton.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		mngbutton.addActionListener(this);
		background.add(mngbutton);

		extProgram = new JButton("������");
		extProgram.setBounds(70, 220, 250, 40);
		extProgram.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		extProgram.setBackground(gray);
		extProgram.addActionListener(this);
		background.add(extProgram);

		// 8. 2��° �гο� ��ư �ֱ�
		register = new JButton("�Է��ϱ�");
		register.setBounds(0, 0, 109, 60);
		register.setBackground(pink_b);
		register.setForeground(Color.white);
		register.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		register.addActionListener(this);
		jPanel4.add(register);

		modify = new JButton("�����ϱ�");
		modify.setBounds(110, 0, 109, 60);
		modify.setBackground(pink_b);
		modify.setForeground(Color.white);
		modify.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		modify.addActionListener(this);
		jPanel4.add(modify);

		delete = new JButton("�����ϱ�");
		delete.setBounds(220, 0, 109, 60);
		delete.setBackground(pink_b);
		delete.setForeground(Color.white);
		delete.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		delete.addActionListener(this);
		jPanel4.add(delete);

		// 8. ��� ���� �гο� ��ư �����

		register2 = new JButton("�Է��ϱ�");
		register2.setBounds(0, 0, 109, 60);
		register2.setBackground(pink_b);
		register2.setForeground(Color.white);
		register2.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		register2.addActionListener(this);
		jPanel10.add(register2);

		modify2 = new JButton("�����ϱ�");
		modify2.setBounds(110, 0, 109, 60);
		modify2.setBackground(pink_b);
		modify2.setForeground(Color.white);
		modify2.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		modify2.addActionListener(this);
		jPanel10.add(modify2);

		delete2 = new JButton("�����ϱ�");
		delete2.setBounds(220, 0, 109, 60);
		delete2.setBackground(pink_b);
		delete2.setForeground(Color.white);
		delete2.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		delete2.addActionListener(this);
		jPanel10.add(delete2);

		// 9. �԰���� - �Է�â �����

		jPanelin1 = new JPanel(null);
		jPanelin1.setBackground(purple_a);
		jPanelin1.setBounds(400, 61, 330, 380);

		labelInInsert2 = new JLabel("FLOWER CODE");
		labelInInsert2.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		labelInInsert2.setBounds(20, 10, 150, 30);
		jPanelin1.add(labelInInsert2);

		textOutInsert1 = new TextField();
		textOutInsert1.setBounds(170, 10, 150, 30);
		jPanelin1.add(textOutInsert1);
		textOutInsert1.setColumns(10);

		labelInInsert3 = new JLabel("FLOWER NAME");
		labelInInsert3.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		labelInInsert3.setBounds(20, 50, 150, 30);
		jPanelin1.add(labelInInsert3);

		textOutInsert2 = new TextField();
		textOutInsert2.setColumns(10);
		textOutInsert2.setBounds(170, 50, 150, 30);
		jPanelin1.add(textOutInsert2);

		labelInInsert4 = new JLabel("FLOWER UNIT");
		labelInInsert4.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		labelInInsert4.setBounds(20, 90, 150, 30);
		jPanelin1.add(labelInInsert4);

		textOutInsert3 = new TextField();
		textOutInsert3.setColumns(10);
		textOutInsert3.setBounds(170, 90, 150, 30);
		jPanelin1.add(textOutInsert3);

		labelInInsert5 = new JLabel("FLOWER COST");
		labelInInsert5.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		labelInInsert5.setBounds(20, 130, 150, 30);
		jPanelin1.add(labelInInsert5);

		textOutInsert4 = new TextField();
		textOutInsert4.setColumns(10);
		textOutInsert4.setBounds(170, 130, 150, 30);
		jPanelin1.add(textOutInsert4);

		labelInInsert6 = new JLabel("FLOWER GRADE");
		labelInInsert6.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		labelInInsert6.setBounds(20, 170, 150, 30);
		jPanelin1.add(labelInInsert6);

		gradeCx = new JComboBox(gradecx);
		gradeCx.setBounds(170, 170, 150, 30);
		jPanelin1.add(gradeCx);

		comin1 = new JButton("�Է� �Ϸ�");
		comin1.setBounds(15, 220, 300, 42);
		comin1.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		comin1.addActionListener(this);
		jPanelin1.add(comin1);

		// 9. �԰���� - ����â �����

		jPanelin2 = new JPanel(null);
		jPanelin2.setBackground(purple_a);
		jPanelin2.setBounds(400, 61, 330, 380);

		i1 = new JLabel("FLOWER CODE");
		i1.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i1.setBounds(20, 10, 150, 30);
		jPanelin2.add(i1);

		it1 = new TextField();
		it1.setBounds(170, 10, 150, 30);
		jPanelin2.add(it1);
		it1.setColumns(10);

		i2 = new JLabel("FLOWER NAME");
		i2.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i2.setBounds(20, 50, 150, 30);
		jPanelin2.add(i2);

		it2 = new TextField();
		it2.setColumns(10);
		it2.setBounds(170, 50, 150, 30);
		jPanelin2.add(it2);

		i3 = new JLabel("FLOWER UNIT");
		i3.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i3.setBounds(20, 90, 150, 30);
		jPanelin2.add(i3);

		it3 = new TextField();
		it3.setColumns(10);
		it3.setBounds(170, 90, 150, 30);
		jPanelin2.add(it3);

		i4 = new JLabel("FLOWER COST");
		i4.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i4.setBounds(20, 130, 150, 30);
		jPanelin2.add(i4);

		it4 = new TextField();
		it4.setColumns(10);
		it4.setBounds(170, 130, 150, 30);
		jPanelin2.add(it4);

		i5 = new JLabel("FLOWER GRADE");
		i5.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i5.setBounds(20, 170, 150, 30);
		jPanelin2.add(i5);

		gradeCx2 = new JComboBox(gradecx);
		gradeCx2.setBounds(170, 170, 150, 30);
		jPanelin2.add(gradeCx2);

		comin2 = new JButton("���� �Ϸ�");
		comin2.setBounds(15, 220, 300, 42);
		comin2.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		comin2.addActionListener(this);
		jPanelin2.add(comin2);

		// 10. �ö�� �԰� ����Ʈ�� �� �г� �����

		model = new DefaultTableModel(category, 0);
		flowerTable = new JTable(model);
		tbl_sp = new JScrollPane(flowerTable);
		tbl_sp.setBounds(0, 0, 540, 380);
		jPanel5.add(tbl_sp);

		// 10. �԰���� - ����â �����

		jPanelin3 = new JPanel(null);
		jPanelin3.setBackground(purple_a);
		jPanelin3.setBounds(400, 61, 330, 380);

		i1 = new JLabel("FLOWER CODE");
		i1.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		i1.setBounds(20, 10, 150, 30);
		jPanelin3.add(i1);

		it6 = new TextField();
		it6.setBounds(170, 10, 150, 30);
		jPanelin3.add(it6);
		it6.setColumns(10);

		comin3 = new JButton("���� �Ϸ�");
		comin3.setBounds(15, 220, 300, 42);
		comin3.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		comin3.addActionListener(this);
		jPanelin3.add(comin3);

		// 11. �ö�� ��� ����Ʈ�� �� �г� �����

		jPanel6 = new JPanel(null);
		jPanel6.setBounds(730, 0, 540, 380);
		jPanel6.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 1)));

		model2 = new DefaultTableModel(category2, 0);
		flowerOutTable = new JTable(model2);
		tbl_sp2 = new JScrollPane(flowerOutTable);
		tbl_sp2.setBounds(0, 0, 540, 380);
		jPanel6.add(tbl_sp2);

		// 12. �� ���� �г� �����

		jPanel7 = new JPanel(null);
		jPanel7.setBackground(purple_a);
		jPanel7.setBounds(400, 61, 330, 380);
		jPanel7.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 1)));

		// ���������� title panel
		jPanel8.setLayout(null);
		jPanel8.setBounds(400, 0, 330, 60);
		jPanel8.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY, 1)));
		mngtitle = new JLabel(" ");
		mngtitle.setBounds(100, 10, 300, 40);
		mngtitle.setForeground(Color.white);
		mngtitle.setFont(new Font("�޸ո���T", Font.BOLD, 18));
		jPanel8.add(mngtitle);

		// ���������� �Ϸ� ��ư
		complete = new JButton("�Ϸ�");
		complete.setBounds(15, 190, 300, 40);
		complete.setFont(new Font("�޸ո���T", Font.TRUETYPE_FONT, 15));
		complete.addActionListener(this);

		// ���������� �ڵ��Է� �г�
		mngcode = new JLabel("��ȸ�� ���� �Է��ϼ���.");
		mngcode.setBounds(85, 65, 200, 40);
		mngcode.setFont(new Font("�޸ո���T", Font.PLAIN, 20));

		/*Vector<String> f_code = new Vector<>();
		try {
			inlist = inbiz.get();
			for (InVO invo : inlist) {
				String flower = invo.getF_code() + "-" + invo.getF_name();
				f_code.add(flower);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cx = new JComboBox<>(f_code);
		cx.setBounds(15, 120, 300, 40);
		cx.setBackground(Color.white);
		jPanel7.add(mngcode);
		jPanel7.add(complete);
		jPanel7.add(cx);*/

		// 13. ������ - �Է� ������

		jPanelout1 = new JPanel(null);
		jPanelout1.setBackground(purple_a);
		jPanelout1.setBounds(400, 61, 330, 380);

		o1 = new JLabel("FLOWER CODE");
		o1.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o1.setBounds(20, 40, 150, 30);
		jPanelout1.add(o1);

		ot1 = new TextField();
		ot1.setBounds(170, 40, 150, 30);
		jPanelout1.add(ot1);
		ot1.setColumns(10);

		o2 = new JLabel("FLOWER UNIT");
		o2.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o2.setBounds(20, 100, 150, 30);
		jPanelout1.add(o2);

		ot2 = new TextField();
		ot2.setColumns(10);
		ot2.setBounds(170, 100, 150, 30);
		jPanelout1.add(ot2);

		o3 = new JLabel("CLIENT CODE");
		o3.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o3.setBounds(20, 160, 150, 30);
		jPanelout1.add(o3);

		ot3 = new TextField();
		ot3.setColumns(10);
		ot3.setBounds(170, 160, 150, 30);
		jPanelout1.add(ot3);

		comout1 = new JButton("�Է� �Ϸ�");
		comout1.setBounds(15, 220, 300, 42);
		comout1.addActionListener(this);
		comout1.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		jPanelout1.add(comout1);

		// 14. ������ - ���� ������

		jPanelout2 = new JPanel(null);
		jPanelout2.setBackground(purple_a);
		jPanelout2.setBounds(400, 61, 330, 380);

		o4 = new JLabel("FLOWER CODE");
		o4.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o4.setBounds(20, 40, 150, 30);
		jPanelout2.add(o4);

		ot4 = new TextField();
		ot4.setBounds(170, 40, 150, 30);
		jPanelout2.add(ot4);
		ot4.setColumns(10);

		o5 = new JLabel("FLOWER UNIT");
		o5.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o5.setBounds(20, 100, 150, 30);
		jPanelout2.add(o5);

		ot5 = new TextField();
		ot5.setColumns(10);
		ot5.setBounds(170, 100, 150, 30);
		jPanelout2.add(ot5);

		o6 = new JLabel("CLIENT CODE");
		o6.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o6.setBounds(20, 160, 150, 30);
		jPanelout2.add(o6);

		ot6 = new TextField();
		ot6.setColumns(10);
		ot6.setBounds(170, 160, 150, 30);
		jPanelout2.add(ot6);

		comout2 = new JButton("���� �Ϸ�");
		comout2.setBounds(15, 220, 300, 42);
		comout2.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		comout2.addActionListener(this);
		jPanelout2.add(comout2);

		// 15. ������ - ���� ������

		jPanelout3 = new JPanel(null);
		jPanelout3.setBackground(purple_a);
		jPanelout3.setBounds(400, 61, 330, 380);

		o7 = new JLabel("FLOWER CODE");
		o7.setFont(new Font("�޸ո���T", Font.BOLD, 15));
		o7.setBounds(20, 40, 150, 30);
		jPanelout3.add(o7);

		ot7 = new TextField();
		ot7.setBounds(170, 40, 150, 30);
		jPanelout3.add(ot7);
		ot7.setColumns(10);

		comout3 = new JButton("���� �Ϸ�");
		comout3.setBounds(15, 220, 300, 42);
		comout3.setFont(new Font("�޸ո���T", Font.PLAIN, 16));
		comout3.addActionListener(this);
		jPanelout3.add(comout3);

	}

	// 11.1 ����Ʈ �ҷ�����

	public void getInTable() {
		for (int i = model.getRowCount() - 1; i >= 0; i--) {
			model.removeRow(i);
		}
		inbiz = new InBiz();
		try {
			inlist = inbiz.get();
			for (InVO in : inlist) {
				String[] inRow = new String[6];
				inRow[0] = "" + in.getF_code();
				inRow[1] = "" + in.getF_name();
				inRow[2] = "" + in.getAmount();
				inRow[3] = "" + in.getP_cost();
				inRow[4] = "" + in.getG_number();
				inRow[5] = "" + in.getDate();
				model.addRow(inRow);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void getOutTable() {
		for (int i = model2.getRowCount() - 1; i >= 0; i--) {
			model2.removeRow(i);
		}
		outbiz = new OutBiz();
		try {
			outlist = outbiz.get();
			for (OutVO out : outlist) {
				String[] outRow = new String[6];
				outRow[0] = "" + out.getF_code();
				outRow[1] = "" + out.getF_name();
				outRow[2] = "" + out.getAmount();
				outRow[3] = "" + out.getS_price();
				outRow[4] = "" + out.getC_code();
				outRow[5] = "" + out.getDate();
				model2.addRow(outRow);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// ===========================�԰���� ��ư��============================
		if (e.getSource() == inbutton) {
			jPanel4.setVisible(true);
			imgpl.setVisible(true);
			// jPanel3.setVisible(true);
			jPanel10.setVisible(false);
			jPanel7.setVisible(false);

			getInTable();

			jFrame.remove(jPanel6);
			jFrame.add(jPanel5);
			jFrame.add(jPanelin1);

		}
		if (e.getSource() == register) {
			imgpl.setVisible(false);
			jPanelout1.setVisible(false);
			jPanelout2.setVisible(false);
			jPanelout3.setVisible(false);
			jPanelin2.setVisible(false);
			jPanelin3.setVisible(false);
			jFrame.add(jPanelin1);
			jPanelin1.setVisible(true);

		}
		if (e.getSource() == modify) {
			imgpl.setVisible(false);
			jPanelout1.setVisible(false);
			jPanelout2.setVisible(false);
			jPanelout3.setVisible(false);
			jPanelin1.setVisible(false);
			jPanelin3.setVisible(false);
			jFrame.add(jPanelin2);
			jPanelin2.setVisible(true);

		}
		if (e.getSource() == delete) {
			imgpl.setVisible(false);
			jPanelout1.setVisible(false);
			jPanelout2.setVisible(false);
			jPanelout3.setVisible(false);
			jPanelin1.setVisible(false);
			jPanelin2.setVisible(false);
			jFrame.add(jPanelin3);
			jPanelin3.setVisible(true);

		}
		if (e.getSource() == comin1) {
			// =========================MVC===========================
			flower_code = Integer.parseInt(textOutInsert1.getText());
			flower_name = textOutInsert2.getText();
			amount = Integer.parseInt(textOutInsert3.getText());
			prime_cost = Integer.parseInt(textOutInsert4.getText());

			String str = (String) gradeCx.getSelectedItem();
			if (str.equals("��")) {
				grade = 1;
			} else if (str.equals("��")) {
				grade = 2;
			} else
				grade = 3;

			in = new InVO(flower_code, flower_name, amount, prime_cost, grade);
			try {
				inbiz.register(in);
				getInTable();

			} catch (Exception e1) {
				System.out.println("���� �Է� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "�ԷµǾ����ϴ�.", "Register completed!", JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == comin2) {

			// =========================MVC===========================
			flower_code = Integer.parseInt(it1.getText());
			flower_name = it2.getText();
			amount = Integer.parseInt(it3.getText());
			prime_cost = Integer.parseInt(it4.getText());

			String str = (String) gradeCx2.getSelectedItem();
			if (str.equals("��")) {
				grade = 1;
			} else if (str.equals("��")) {
				grade = 2;
			} else
				grade = 3;

			in = new InVO(flower_code, flower_name, amount, prime_cost, grade);
			try {
				inbiz.modify(in);
				getInTable();

			} catch (Exception e1) {
				System.out.println("���� ���� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Modify completed!", JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == comin3) {

			flower_code = Integer.parseInt(it6.getText());
			try {
				inbiz.remove(flower_code);
				getInTable();

			} catch (Exception e1) {
				System.out.println("���� ���� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Remove completed!", JOptionPane.INFORMATION_MESSAGE);
		}

		// ===========================������ ��ư��============================

		// �������ϴ� ����Ʈ�� �Է�â �ٲٱ�
		if (e.getSource() == outbutton) {

			try {
				jPanel4.setVisible(false);
				jPanel8.setVisible(false);
				imgpl.setVisible(true);
				jPanel7.setVisible(false);// �ɰ��� �޴� �ݱ�

				// ������â �ݱ�
				jPanelout1.setVisible(false);
				jPanelout2.setVisible(false);
				jPanelout3.setVisible(false);

				getOutTable();

				jFrame.remove(jPanel5);
				jFrame.add(jPanelout1);
				jFrame.add(jPanel10);
				jFrame.add(jPanel6);
				jPanel10.setVisible(true);
				jPanel6.setVisible(true);
			} catch (Exception ex) {
				System.out.println("��Ȳ������ �ɰž�");
			}

		}
		if (e.getSource() == register2) {

			try {
				imgpl.setVisible(false);
				jPanelin1.setVisible(false);
				jPanelin2.setVisible(false);
				jPanelin3.setVisible(false);

				jPanelout2.setVisible(false);
				jPanelout3.setVisible(false);

				jFrame.add(jPanelout1);
				jPanelout1.setVisible(true);
			} catch (Exception ex) {
				System.out.println("��Ȳ������ �ɰž�");
			}

		}
		if (e.getSource() == modify2) {

			try {
				imgpl.setVisible(false);
				jPanelin1.setVisible(false);
				jPanelout1.setVisible(false);
				jPanelin2.setVisible(false);
				jPanelin3.setVisible(false);
				jPanelout3.setVisible(false);

				jFrame.add(jPanelout2);
				jPanelout2.setVisible(true);
			} catch (Exception ex) {
				System.out.println("��Ȳ������ �ɰž�");
			}

		}
		if (e.getSource() == delete2) {
			try {
				imgpl.setVisible(false);
				jPanelin1.setVisible(false);
				jPanelout1.setVisible(false);
				jPanelout2.setVisible(false);
				jPanelin2.setVisible(false);
				jPanelin3.setVisible(false);

				jFrame.add(jPanelout3);
				jPanelout3.setVisible(true);
			} catch (Exception ex) {
				System.out.println("��Ȳ������ �ɰž�");
			}
		}

		if (e.getSource() == comout1) {
			// =========================MVC===========================
			flower_code = Integer.parseInt(ot1.getText());
			amount = Integer.parseInt(ot2.getText());
			client_code = ot3.getText();

			out = new OutVO(flower_code, amount, client_code);
			try {
				outbiz.register(out);
				getOutTable();
			} catch (Exception e1) {
				System.out.println("���� �Է� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "�ԷµǾ����ϴ�.", "Register completed!", JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == comout2) {
			flower_code = Integer.parseInt(ot4.getText());
			amount = Integer.parseInt(ot5.getText());
			client_code = ot6.getText();

			out = new OutVO(flower_code, amount, client_code);
			try {
				outbiz.modify(out);
				getOutTable();
			} catch (Exception e1) {
				System.out.println("���� ���� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Modify completed!", JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == comout3) {

			flower_code = Integer.parseInt(ot7.getText());
			try {
				outbiz.remove(flower_code);
				getOutTable();
			} catch (Exception e1) {
				System.out.println("���� ���� �Ұ� : ���� �ٶ�");
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Remove completed!", JOptionPane.INFORMATION_MESSAGE);

		}
		// ===========================�ɰ��� ��ư��============================
		// �� ���� ��ư ������ ��
		
		if (e.getSource() == mngbutton) {
			
			
			//=============�޺��ڽ� ����====================
			
			Vector<String> f_code = new Vector<>();
			try {
				inlist = inbiz.get();
				for (InVO invo : inlist) {
					String flower = invo.getF_code() + "-" + invo.getF_name();
					
					f_code.add(flower);
				}
			} catch (Exception e11) {
				// TODO Auto-generated catch block
				e11.printStackTrace();
			}
			cx = new JComboBox<>(f_code);
			cx.setBounds(15, 120, 300, 40);
			cx.setBackground(Color.white);
			jPanel7.add(mngcode);
			jPanel7.add(complete);
			jPanel7.add(cx);
			//=========================================//
			getInTable();
			
			jPanel6.setVisible(false);
			jFrame.add(jPanel5);
			jPanel5.setVisible(true);
			
			
			jPanelin1.setVisible(false);
			jPanelin2.setVisible(false);
			jPanelin3.setVisible(false);
			jPanel4.setVisible(false);
			imgpl.setVisible(false);
			jPanel10.setVisible(false);
			jPanelout1.setVisible(false);
			jPanelout2.setVisible(false);
			jPanelout3.setVisible(false);
			jFrame.add(jPanel8);
			jFrame.add(jPanel7);
			jPanel8.setVisible(true);
			jPanel7.setVisible(true);
		}
		if (e.getSource() == complete) {
			String str = (String) cx.getSelectedItem();
			/*""�� code�� name�� �־���ϴµ� 
			name��code��������*/
			if (str.equals("13-��������")) {
				JOptionPane.showMessageDialog(null, "��ŭ�� ���Դϴ�.");
			} else if (str.equals("9-���ϳ���")) {
				JOptionPane.showMessageDialog(null, "��ŭ�� ���Դϴ�.");
			} else if (str.equals("10-��ä����")) {
				JOptionPane.showMessageDialog(null, "������ ���Դϴ�.");
			} else if (str.equals("11-��������")) {
				JOptionPane.showMessageDialog(null, "�ְ��� �� �Դϴ�.");
			} else if (str.equals("12-������")) {
				JOptionPane.showMessageDialog(null, "���ֿ��� ���Դϴ�.");
			} else {
				int idx = str.indexOf('-');
				String code = str.substring(0, idx);
				int cd = Integer.parseInt(code);
				try {
					SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
					in=inbiz.get(cd);
					int gr = in.getG_number();
					Date date = in.getDate();
					String name = in.getF_name();
					Calendar cal = Calendar.getInstance();
					switch (gr) {
					case 1: {

						cal.setTime(date);
						cal.add(Calendar.DATE, 3);
						String today = sdformat.format(cal.getTime());
						
							JOptionPane.showMessageDialog(null, "�� �̸�: " + name+"\n�õ�� �ӵ��� ���� ���̿���\n"
						+today + "�� �ٱ⸦ �ڸ�����.");
						
					}
						break;

					case 2: {

						
						cal.setTime(date);
						cal.add(Calendar.DATE, 5);
						String today = sdformat.format(cal.getTime());

						JOptionPane.showMessageDialog(null, "�� �̸�: " + name+"\n�õ�� �ӵ��� ���� ���̿���\n"
								+today + "�� �ٱ⸦ �ڸ�����.");

					}
						break;

					case 3: {

						cal.setTime(date);
						cal.add(Calendar.DATE, 7);
						String today = sdformat.format(cal.getTime());

						JOptionPane.showMessageDialog(null, "�� �̸�: " + name+"\n�õ�� �ӵ��� ���� ���̿���\n"
								+today + "�� �ٱ⸦ �ڸ�����.");

					}
						break;

					default:
						System.out.println("grade���� �Է����� �ʾҽ��ϴ�.");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
					
				}
				//JOptionPane.showMessageDialog(null, "�õ�� ���� ���Դϴ�." + "\n2018�� 1�� 30�Ͽ� �ٱ⸦ �߶��ּ���.");
		
			}

		if (e.getSource() == extProgram) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		new FlowerFinal();

	}

}// class
