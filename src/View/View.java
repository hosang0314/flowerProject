package View;

import java.util.ArrayList;
import java.util.Scanner;

import FlowerMng.FlowerMng;
import in.InBiz;
import out.OutBiz;
import vo.InVO;
import vo.OutVO;

public class View {

	public static void main(String[] args) {
		/*
		 * 3,100,10000,'cl001') 4,12,10000,'cl001'); 3,10,20000,'cl001');
		 * 5,50,30000,'cl001');
		 */

		Scanner sc = new Scanner(System.in);
		w:while (true) {
			System.out.println("[1] �԰� ����  [2] ��� ���� [3] �� ���� [4] ������");
			int number = sc.nextInt();
			
			switch (number) {
			case 1:
				while (true) {
					System.out.println();
					System.out.println("[1] �԰� ���� ��ȸ  [2] ��� ���� ��ȸ [3] �԰� ���� �Է�");
					System.out.println("[4] �԰� ���� ����  [5] �԰� ���� ���� [6] ��������");
					InBiz biz = new InBiz();
					InVO in = null;
					ArrayList<InVO> list = null;
					
					int f_code;
					String f_name;
					int amount, p_cost, g_number;

					int select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("���� ��ȸ�� '�� code' �Է�>>");
						f_code = sc.nextInt();
						try {
							in = biz.get(f_code);
							System.out.println(in);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 2:
						try {
							list = biz.get();
							for (InVO o : list) {
								System.out.println(o);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;

					case 3:
						try {
							System.out.println("'�� code', '�� �̸�', '����', '�ɰ��� ���' �Է�>>");
							f_code = sc.nextInt();
							f_name = sc.next();
							amount = sc.nextInt();
							p_cost = sc.nextInt();
							g_number = sc.nextInt();
							in = new InVO(f_code, f_name, amount, p_cost, g_number);
							biz.register(in);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;

					case 4:
						try {
							System.out.println("���� ������ '�� code' �Է�>>");
							f_code = sc.nextInt();
							System.out.println("���� ����:'�� �̸�' �Է�>>");
							f_name = sc.next();
							System.out.println("���� ����:'�� �ܼ�' �Է� >>");
							amount = sc.nextInt();
							System.out.println("���� ����:'�� ����' �Է� >>");
							p_cost = sc.nextInt();
							System.out.println("���� ����:'�� ���' �Է� >>");
							g_number = sc.nextInt();
							in = new InVO(f_code, f_name, amount, p_cost, g_number);
							biz.modify(in);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 5:
						System.out.println("���� ������ '�� code' �Է�>>");
						f_code = sc.nextInt();
						try {
							biz.remove(f_code);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					
					case 6: continue w;
					}
				}
			case 2:

				while (true) {
					System.out.println();
					System.out.println("[1] ��� ���� ��ȸ  [2] ��� ���� ��ȸ [3] ��� ���� �Է�");
					System.out.println("[4] ��� ���� ����  [5] ��� ���� ���� [6] ��������");
					OutBiz biz = new OutBiz();
					OutVO out = null;
					ArrayList<OutVO> list = null;
					int f_code;
					int amount;
					String c_code;

					int select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("���� ��ȸ�� '�� code' �Է�>>");
						f_code = sc.nextInt();
						try {
							out = biz.get(f_code);
		
							System.out.println(out);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;

					case 2:
						try {
							list = biz.get();
							System.out.println(list.get(1));
							for (OutVO o : list) {
								System.out.println(o);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;

					case 3:
						try {
							System.out.println("'�� code', '�ܷ�', '�ŷ�ó code' �Է�>>");
							f_code = sc.nextInt();
							amount = sc.nextInt();
							c_code = sc.next();
							out = new OutVO(f_code, amount, c_code);
							biz.register(out);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;

					case 4:
						try {
							System.out.println("���� ������ '�� code' �Է�>>");
							f_code = sc.nextInt();
							System.out.println("���� ����:'�ܷ�' �Է�>>");
							amount = sc.nextInt();
							System.out.println("���� ����:'�ŷ�ó code' �Է� >>");
							c_code = sc.next();
							out = new OutVO(f_code, amount, c_code);
							biz.modify(out);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 5:
						System.out.println("���� ������ '�� code' �Է�>>");
						f_code = sc.nextInt();
						try {
							biz.remove(f_code);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 6: continue w;
					default:
						System.out.println("�ٽ� �Է��ϼ���");
					}
				}
				
			case 3: 	
				while (true) {
					
					System.out.println("�� �ڵ带 �Է��ϼ���>>");
					FlowerMng fm = new FlowerMng();
					fm.Alarm(sc.nextInt());
					continue w;
				}

			case 4: break w;
				
			}
		}
	}
}
