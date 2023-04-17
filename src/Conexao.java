import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	Connection conecBD = null;
    Statement stt = null;
    ResultSet rset = null;

	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String link = "";
		String user = "";
		String pass = "";
		
		conecBD = DriverManager.getConnection(link, user, pass);
		
	}

}
}
}


