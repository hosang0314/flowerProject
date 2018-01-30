package vo;


public class OutVO {

	private int S_price;// �ǸŰ�
	private int F_code;// �ڵ�
	private int amount;// �ܷ�
	private String F_name;// �̸�
	
	private String C_code;
	private double profit;// ����%

	private String date;
	
	private ClientVO client;// Ŭ���̾�Ʈ ��ü
	
	{setProfit(0.4);}
	
	public OutVO() {
		super();
	}

	public OutVO(int f_code, int amount, String c_code) {
		super();
		
		F_code = f_code;
		this.amount = amount;
		C_code = c_code;
	}

	public int getS_price() {

		return S_price;
	}

	public void setS_price(int s_price) {
		S_price = s_price;
	}

	public int getF_code() {
		return F_code;
	}

	public void setF_code(int f_code) {
		F_code = f_code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getF_name() {
		return F_name;
	}

	public void setF_name(String f_name) {
		F_name = f_name;
	}


	public String getC_code() {
		return C_code;
	}

	public void setC_code(String c_code) {
		C_code = c_code;
	}

	
	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public ClientVO getClient() {
		return client;
	}

	public void setClient(ClientVO client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "��¥ = " + date +", �� �̸� = "+F_name+", �ǸŰ�=" + S_price + ", �ܷ�=" + amount+"\n�ŷ�ó= "+client;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
