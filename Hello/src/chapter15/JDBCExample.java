package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) throws Exception {
		// 0. 드라이버 로딩(리플렉션 기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 1. DB 접속(서버 주소, 아이디, 패스워드)  127.0.0.1=localhost
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "LHD94", "java");
		
		// 2. 연결된 DB에 요청할 쿼리 작성
		Statement statement = connection.createStatement();  //워크시트 생성
		String sql = ""; //쿼리 작성
		sql += " SELECT";
		sql += "     mem_id,";
		sql += "     mem_name,";
		sql += "     mem_hp,";
		sql += "     mem_mail";
		sql += " FROM";
		sql += "     member"; //앞이나 뒤에 한칸씩 띄워주기
		
		// 3. 쿼리 실행
		ResultSet resultSet = statement.executeQuery(sql);
		// executeQuery: select => 결과집합(ResultSet)을 반환
		// executeUpdate: insert, update, delete => 실행된 개수 반환-int타입으로
		
		// 4. 실행 결과 받기
		while(resultSet.next()) {
			String memId = resultSet.getString("mem_id");//가능하면 인덱스명 쓰지마!(바뀔 수 있으니까) 컬럼명 쓰는 게 좋음
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);
		}
		
		// 5. 접속 종료 (자원을 받아서 사용하기 때문에 반드시 반납해야해서 접속종료해야함)
		resultSet.close();
		statement.close();
		connection.close();
		
	}
}
