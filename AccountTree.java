/*
   ��д�����ȡ��Ŀ���ļ�,���ڴ��н�����Ŀ��, ��������Ŀ����ÿ����Ŀ����,���л��������ϡ�
   ��1�����ļ��ж�ȡ��Ŀ���������ֱ����ʽ��һ���ǹ̶������ʽ��һ���Ƕ�̬�����ʽ��
   ��2������Account��,Ϊ���ļ��ж�ȡ��ÿ����Ŀ����Account����
   ��3����Account�������л���������һ��Accounts.ser�ļ���
   ��4����ȡAccounts.ser�ļ���ѭ����ԭAccount�����γ�Account��������
   
   ���룺�̶���Ŀ.txt ��̬��Ŀ.txt
   �������Ŀ�������л��ļ�
*/
import java.io.*;
public class AccountTree{
	public static void main(String[] args){
		FileReader fis = null;
		try{
			fis = new FileReader("�̶���Ŀ.txt");
			BufferedReader br=new BufferedReader(fis);
			Object b	=br.readLine();
			while(b!=null){	
			System.out.print(b);
			b=br.readLine();
		}
			fis.close();
		}catch(Exception e){
		}
	}
}