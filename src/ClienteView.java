import java.awt.*;
import javax.swing.*;

public class ClienteView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	
	private JLabel nome;
	private JLabel cpf;
	private JLabel rua;
	private JLabel nro;
	private JLabel cidade;
	private JLabel bairro;
	private JLabel uf;
	private JLabel fone;
	private JLabel email;
	private JLabel nasc;
	
	private JTextField dCpf;
	private JTextField dNome;
	private JTextField dRua;
	private JTextField dNro;
	private JTextField dCidade;
	private JTextField dBairro;
	private JTextField dFone;
	private JTextField dEmail;
	private JTextField dNasc;
	
	private JComboBox<String> dUf;
	
	private JButton cancelar;
	private JButton confirmar;
	
	/*Cores e fontes utilizadas*/
	Font padrao = new Font("Lato",Font.BOLD, 18);
	Font big = new Font("Lato",Font.BOLD, 30); //título
	
	Color corf = new Color(158, 210, 198); //fonte
	Color corback = new Color(246, 241, 233); //background
	Color corerro = new Color(233, 218, 193); //botão cancelar
	Color cortitulo = new Color(84, 186, 185); //título

	public ClienteView(){
		
		/*configurações da tela*/
		setTitle("Cadastrar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
		getContentPane().setBackground(corback);
		
		/*título da página*/
		JPanel locTitulo = new JPanel();
		add(locTitulo);
		getContentPane().add(locTitulo, BorderLayout.NORTH);
		locTitulo.setBackground(corback);
		
		titulo = new JLabel("Cadastro de Clientes");
		locTitulo.add(titulo, BorderLayout.NORTH);
		this.titulo.setFont(big);
		this.titulo.setForeground(cortitulo);
		
		
		/*painel para adição do conteúdo*/
		JPanel painel = new JPanel();
		add(painel);
		getContentPane().add(painel, BorderLayout.WEST);
		painel.setLayout(new GridBagLayout());
		painel.setBackground(corback);
		GridBagConstraints co = new GridBagConstraints();
		co.anchor = GridBagConstraints.WEST;
		
		/*rótulos*/
		this.cpf = new JLabel("CPF*:");
		this.cpf.setFont(padrao);
		this.cpf.setForeground(corf);
		
		this.nome = new JLabel("Nome*:");
		this.nome.setForeground(corf);
		this.nome.setFont(padrao);
		
		this.rua = new JLabel("Rua:");
		this.rua.setForeground(corf);
		this.rua.setFont(padrao);
		
		this.nro = new JLabel("Número:");
		this.nro.setForeground(corf);
		this.nro.setFont(padrao);
		
		this.cidade = new JLabel("Cidade:");
		this.cidade.setForeground(corf);
		this.cidade.setFont(padrao);
		
		this.bairro = new JLabel("Bairro:");
		this.bairro.setForeground(corf);
		this.bairro.setFont(padrao);
		
		this.uf = new JLabel("UF:");
		this.uf.setForeground(corf);
		this.uf.setFont(padrao);
		
		this.fone = new JLabel("Telefone*:");
		this.fone.setForeground(corf);
		this.fone.setFont(padrao);
		
		this.email = new JLabel("E-mail*:");
		this.email.setForeground(corf);
		this.email.setFont(padrao);
		
		this.nasc = new JLabel("Data de Nascimento*:");
		this.nasc.setForeground(corf);
		this.nasc.setFont(padrao);
		
		
		/*campos de texto(input)*/
		this.dCpf = new JTextField(12);
		this.dCpf.setFont(padrao);
		
		this.dNome = new JTextField(25);
		this.dNome.setFont(padrao);
		
		this.dRua = new JTextField(25);
		this.dRua.setFont(padrao);
		
		this.dNro = new JTextField(5);
		this.dNro.setFont(padrao);
		
		this.dBairro = new JTextField(10);
		this.dBairro.setFont(padrao);
		
		this.dCidade = new JTextField(10);
		this.dCidade.setFont(padrao);
		
		this.dFone = new JTextField(10);
		this.dFone.setFont(padrao);
		
		this.dEmail = new JTextField(25);
		this.dEmail.setFont(padrao);
		
		this.dNasc = new JTextField(10);
		this.dNasc.setFont(padrao);
		
		/*ComboBox da UF*/
		String ufv[] = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
		this.dUf = new JComboBox<String>(ufv);
		dUf.setSelectedIndex(11);
		this.dUf.setFont(padrao);
		this.dUf.setForeground(corf);
		this.dUf.setBackground(Color.WHITE);
		
		
		/*botões*/
		this.cancelar = new JButton("Cancelar");
		this.cancelar.setBackground(corerro);
		this.cancelar.setFont(padrao);

		this.confirmar = new JButton("Confirmar");
		this.confirmar.setBackground(corf);
		this.confirmar.setFont(padrao);
		
		
		
		/*alocação na grid: separados por linha (y)*/
		co.gridx = 0;
		co.gridy = 0;
		co.insets = new Insets(10, 10, 10, 10);
		painel.add(cpf, co);
		co.gridx = 1;
		painel.add(dCpf, co);
		
		co.gridx = 0;
		co.gridy = 1;
		painel.add(nome, co);
		co.gridx = 1;
		painel.add(dNome, co);
		
		
		co.gridx = 0;
		co.gridy = 2;
		painel.add(nasc, co);
		co.gridx = 1;
		painel.add(dNasc, co);
		
		co.gridx = 0;
		co.gridy = 3;
		painel.add(fone, co);
		co.gridx = 1;
		painel.add(dFone, co);
		
		co.gridx = 0;
		co.gridy = 4;
		painel.add(email, co);
		co.gridx = 1;
		painel.add(dEmail, co);
		
	
		co.gridx = 0;
		co.gridy = 5;
		painel.add(rua, co);
		co.gridx = 1;
		painel.add(dRua, co);
		co.gridx = 2;
		painel.add(nro, co);
		co.gridx = 3;
		painel.add(dNro, co);
		
		
		co.gridx = 0;
		co.gridy = 6;
		painel.add(bairro, co);
		co.gridx = 1;
		painel.add(dBairro, co);
		
		co.gridx = 0;
		co.gridy = 7;
		painel.add(cidade, co);
		co.gridx = 1;
		painel.add(dCidade, co);
		co.gridx = 2;
		painel.add(uf, co);
		co.gridx = 3;
		painel.add(dUf, co);
		
		co.gridx = 2;
		co.gridy = 10;
		painel.add(cancelar, co);
		co.gridx = 3;
		painel.add(confirmar, co);
		
		pack();
	}
}

