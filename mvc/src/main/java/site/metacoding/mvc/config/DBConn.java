package site.metacoding.mvc.config;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {

	// 이미 만들어져있는 커넥션 객체를 리턴받기 위한 메서드, DB 커넥션 코드 아님!!
	// 메서드의 책임 : Connection 객체 return
	public static Connection getConnection() {
		// 목적을 위한 객체는 전역적으로 선언
		Connection conn = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env"); // JNDI 박스, env는 외부환경
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			System.out.println("DB연결 성공");
		} catch (Exception e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}

		return conn;
	}
}
