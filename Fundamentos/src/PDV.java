import java.text.DateFormat;
import java.util.Date;

public class PDV {

	public static void main(String[] args) {
		//date -> trabalhar com Data
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formatador.format(data));

	}

}
