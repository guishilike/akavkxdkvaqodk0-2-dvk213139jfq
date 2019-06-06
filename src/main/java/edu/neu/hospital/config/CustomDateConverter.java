package edu.neu.hospital.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CustomDateConverter implements Converter<String,Date>{
	
	private static final List<String> formarts = new ArrayList<>(4);
    static{
        formarts.add("yyyy-MM");
        formarts.add("yyyy-MM-dd");
        formarts.add("yyyy-MM-dd hh:mm");
        formarts.add("yyyy-MM-dd hh:mm:ss");
    }
 
    @Override
    public Date convert(String source) {
        String value = source.trim();
        if ("".equals(value)) {
            return null;
        }

        String  reg1 = "^[1-9]\\d{3}-(0[1-9]|1[0-2])$";
        String  reg2 = "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
        String  reg3 = "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]$";
        String  reg4 = "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$";
        if(source.matches(reg1)){
            return parseDate(source, formarts.get(0));
        }else if(source.matches(reg2)){
            return parseDate(source, formarts.get(1));
        }else if(source.matches(reg3)){
            return parseDate(source, formarts.get(2));
        }else if(source.matches(reg4)){
            return parseDate(source, formarts.get(3));
        }else {
            throw new IllegalArgumentException("Invalid date value '" + source + "'");
        }
    }
 
    /**
     * 格式化日期
     * @param dateStr String 字符型日期
     * @param format String 格式
     * @return Date 日期
     */
    public  Date parseDate(String dateStr, String format) {
        Date date=null;
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            date = dateFormat.parse(dateStr);
        } catch (Exception e) {
 
        }
        return date;
    }
}
