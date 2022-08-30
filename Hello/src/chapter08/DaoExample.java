package chapter08;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		DataAccessObject dao = new OracleDao();
		dbWork(dao);

		dao = new MySqlDao();
		dbWork(dao);
	}
}