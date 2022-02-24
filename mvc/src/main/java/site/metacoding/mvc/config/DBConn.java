package site.metacoding.mvc.config;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {

	// �̹� ��������ִ� Ŀ�ؼ� ��ü�� ���Ϲޱ� ���� �޼���, DB Ŀ�ؼ� �ڵ� �ƴ�!!
	// �޼����� å�� : Connection ��ü return
	public static Connection getConnection() {
		// ������ ���� ��ü�� ���������� ����
		Connection conn = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env"); // JNDI �ڽ�, env�� �ܺ�ȯ��
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			System.out.println("DB���� ����");
		} catch (Exception e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}

		return conn;
	}
}
