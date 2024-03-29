package edu.neu.hospital.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexProcess {

    /**
     *字符匹配
     *
     * @param regexMsg 匹配数据
     * @param content  被匹配内容
     * @return 是否匹配
     */
    public boolean regexProcess01(String regexMsg,String content){
        //替换大部分空白字符
        regexMsg=regexMsg.replaceAll("\\s*","");
        content=content.replaceAll("\\s*","");
        //正则表达式：%like%
        String regex=".*"+regexMsg+".*";
        //不区分大小写
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        //比较返回结果
        return pattern.matcher(content).matches();
    }

    /**
     *去除空格
     *
     * @param regexMsg 要去空格数据
     * @return 去空格数据
     */
    public String regexProcess02(String regexMsg){
        //替换大部分空白字符
        regexMsg=regexMsg.replaceAll("\\s*","");
        //比较返回结果
        return regexMsg;
    }

    /**
     *是否为数字
     *
     * @param regexMsg 要判断是否为数据
     * @return 是否为数字
     */
    public boolean regexProcess03(String regexMsg){
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) regexMsg);
        return matcher.matches();
    }


}
