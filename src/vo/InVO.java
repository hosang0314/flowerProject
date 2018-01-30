package vo;

import java.sql.Date;

public class InVO {
	private int F_code;
	private String F_name;
	private int amount;
	private int P_cost;
	private int G_number;
	private Date date;
	
	public InVO() {
		super();
	}
	public InVO(int f_code, String f_name, int amount, int p_cost, int g_number) {
		super();
		F_code = f_code;
		F_name = f_name;
		this.amount = amount;
		P_cost = p_cost;
		G_number = g_number;
	}
	
	
	
	public InVO(int f_code, String f_name, int amount, int p_cost, int g_number, Date date) {
		super();
		F_code = f_code;
		F_name = f_name;
		this.amount = amount;
		P_cost = p_cost;
		G_number = g_number;
		this.date = date;
	}
	public int getF_code() {
		return F_code;
	}
	public void setF_code(int f_code) {
		F_code = f_code;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getP_cost() {
		return P_cost;
	}
	public void setP_cost(int p_cost) {
		P_cost = p_cost;
	}
	public int getG_number() {
		return G_number;
	}
	public void setG_number(int g_number) {
		G_number = g_number;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "�� ���� [�� �ڵ�=" + F_code + ", �ɸ�=" + F_name + ", ����=" + amount + ", ����=" + P_cost
				+ ", ���=" + G_number + ", �Է³�¥=" + date + "]";
	}
	
	
	
}


