package music;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.CompoundBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class music.
 */
public class music extends JFrame implements ActionListener, ItemListener {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The choices. */
	String[] choices = { "胡歌 - 光棍.wav", "河图 - 儒道至圣 (儒道至圣主题曲).wav", "李荣浩 - 李白.wav" };;
	
	/** The file. */
	URL file = getClass().getResource(choices[0]);
	
	/** The file 1. */
	URL file1 = getClass().getResource(choices[1]);
	
	/** The file 2. */
	URL file2 = getClass().getResource(choices[2]);

	/** The s. */
	AudioClip s = java.applet.Applet.newAudioClip(file);
	
	/** The s 1. */
	AudioClip s1 = java.applet.Applet.newAudioClip(file1);
	
	/** The s 2. */
	AudioClip s2 = java.applet.Applet.newAudioClip(file2);

	/** The a. */
	AudioClip a = s;

	/** The p. */
	JButton p = new JButton("play");
	
	/** The l. */
	JButton l = new JButton("loop");
	
	/** The st. */
	JButton st = new JButton("stop");
	
	/** The jp. */
	JPanel jp = new JPanel();
	
	/** The con. */
	Container con = getContentPane();
	
	/** The jb. */
	JComboBox jb = new JComboBox(choices);
	
	/** The jl. */
	JLabel jl = new JLabel("选择播放文件");

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new music();
	}

	/**
	 * Instantiates a new music.
	 */
	public music() {

		super("play music");
		setTitle("MusicPlayer");
		jb.setSelectedIndex(0);
		this.setLocation(600, 300);
		// ImageIcon ic=new ImageIcon(getClass().getResource("/timgggg.png"));
		// Image img=ic.getImage();

		this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/music/timgggg.png")));
		p.setToolTipText("这个按钮意思是只播放一次音乐");
		p.setForeground(Color.CYAN);
		p.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 255, 255), null),
				new LineBorder(new Color(0, 255, 255))));
		p.setBackground(Color.WHITE);
		p.addActionListener(this);
		p.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				p.setForeground(Color.yellow);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				p.setForeground(Color.red);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				p.setForeground(Color.cyan);
				p.setBackground(Color.white);

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				p.setForeground(Color.CYAN);

			}
		});

		l.setForeground(Color.CYAN);
		l.setToolTipText("这个按钮意思是不停地播放这个音乐");
		l.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 255, 255), null),
				new LineBorder(new Color(0, 255, 255))));
		l.setBackground(Color.WHITE);
		l.addActionListener(this);
		l.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				l.setForeground(Color.yellow);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				l.setForeground(Color.red);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				l.setForeground(Color.cyan);
				l.setBackground(Color.white);

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				l.setForeground(Color.CYAN);

			}
		});

		st.setForeground(Color.CYAN);
		st.setToolTipText("这个按钮意思是停止播放");
		st.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 255, 255), null),
				new LineBorder(new Color(0, 255, 255))));
		st.setBackground(Color.WHITE);
		st.addActionListener(this);

		st.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				st.setForeground(Color.yellow);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				st.setForeground(Color.red);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				st.setForeground(Color.cyan);
				st.setBackground(Color.white);

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				st.setForeground(Color.CYAN);

			}
		});

		jb.setFont(new Font("华文行楷", Font.BOLD, 15));
		jb.setForeground(Color.CYAN);
		jb.setToolTipText("这里选择歌曲然后点击play按钮或者loop按钮播放");
		jb.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.CYAN, Color.CYAN, new Color(0, 255, 255), Color.CYAN));
		jb.setBackground(Color.WHITE);
		jb.addItemListener(this);
		st.setEnabled(false);

		jp.setFont(new Font("华文琥珀", Font.BOLD, 15));
		jp.setForeground(Color.CYAN);
		jp.setToolTipText("当按钮变成灰色时意味着这个按钮此时不可点击");
		jp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, Color.CYAN, null));
		jp.setBackground(Color.WHITE);
		jp.add(p, BorderLayout.CENTER);
		jp.add(l, BorderLayout.CENTER);
		jp.add(st, BorderLayout.CENTER);

		con.add(jp, BorderLayout.CENTER);
		jl.setFont(new Font("华文隶书", Font.BOLD, 15));
		jl.setForeground(new Color(30, 144, 255));
		jl.setToolTipText("这里提示播放状态");
		jl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.CYAN, null));
		jl.setBackground(Color.LIGHT_GRAY);
		con.add(jl, BorderLayout.SOUTH);
		con.add(jb, BorderLayout.NORTH);

		this.setSize(407, 293);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object su = e.getSource();
		if (a == null) {
			jl.setText("没有声音文件载入啊");
			return;
		}

		if (su == p) {
			st.setEnabled(true);
			l.setEnabled(false);
			p.setEnabled(false);
			a.play();
			jl.setText("正在播放:  " + jb.getSelectedItem().toString());

		}

		if (su == l) {
			st.setEnabled(true);
			l.setEnabled(false);
			p.setEnabled(false);
			a.loop();
			jl.setText("正在滚动播放:  " + jb.getSelectedItem().toString());
		}

		if (su == st) {
			a.stop();
			st.setEnabled(false);
			p.setEnabled(true);
			l.setEnabled(true);
			jl.setText("已经禁止播放:  " + jb.getSelectedItem().toString());
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		switch (jb.getSelectedIndex()) {
		case 0:
			a = s;
			break;
		case 1:
			a = s1;
			break;

		case 2:
			a = s2;
			break;

		default:
			a = s;
			break;
		}

	}

}