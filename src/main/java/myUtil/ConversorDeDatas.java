package myUtil;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public class ConversorDeDatas {

    java.text.SimpleDateFormat formatoDataSimples = new java.text.SimpleDateFormat("dd/MM/yyyy");
    java.text.SimpleDateFormat formatoHoraSimples = new java.text.SimpleDateFormat("HH:mm:ss");
    private Date dataFormatoString;
    private String stringFormatoData;

    public ConversorDeDatas() {
    }

    public Date getStringParaDataBr(String s) {
        try {
            return dataFormatoString = formatoDataSimples.parse(s);
        } catch (ParseException ex) {
            System.out.println("erro na data");
            return null;
        }
    }

    public String getDateParaStringBr(Date d) {
        if (d != null) {
            try {
                return stringFormatoData = formatoDataSimples.format(d);
            } catch (Exception ex) {
                System.out.println("erro na data");
                return null;
            }
        } else {
            return "";
        }
    }
}
