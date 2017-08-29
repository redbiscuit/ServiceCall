package com.bj.test;

import com.bj.basic.Requests;
import com.bj.basic.Session;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JACKSON on 2017/8/29.
 */
public class RequestTest {

    public static void main(String[] args) throws IOException {
        Session session = Requests.session();
        Map<String, Object> params = new HashMap<>();
        params.put("Account", "director2");
        params.put("Password", "123fff");
        String txt = session.post("http://192.168.0.203:50062/Member/DoLogin").forms(params).send().readToText();
        System.out.println(txt);
        txt = session.get("http://192.168.0.203:50062/Member/AcceptAgreement").send().readToText();
        System.out.println(txt);
        params.clear();
        params.put("level","6");
        params.put("link","daycheckout");
        params.put("report_type","3");
        txt = session.get("http://192.168.0.203:50062/Report/GetDayReport").params(params).send().readToText();
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        Report R = mapper.readValue(StringEscapeUtils.unescapeJava(txt), Report.class);
        System.out.println(R.getData().getIs_show_report());
        System.out.println(R.getData().getTotal().getHold_money());
        System.out.println(R.getData().getList().get(5).getMember_bet_count());
        System.out.println(R.getData().getList().size());
    }
}
