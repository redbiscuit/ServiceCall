package com.bj.test;

import java.util.List;

/**
 * Created by JACKSON on 2017/8/29.
 */
public class Report {
    /**
     * Status : 1
     * Data : {"List":[{"is_showfrontend":"1","child_id":"18","account":"a001","nick_name":"w01","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"4382345","member_bet_money":"21659379.00000","member_profit_loss_money":"-1497419.70400","lower_level_contribution_money":"5071910.80000","lower_level_profit_loss_money_amount":"-270969.43630","hold_money":"5071910.80000","hold_profit_loss_money":"270969.43630","hold_return_water":"0.00000","hold_total_profit_loss_money":"270969.43630","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"19","account":"a002","nick_name":"亚飞","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"101149","member_bet_money":"500033.00000","member_profit_loss_money":"-21465.41600","lower_level_contribution_money":"177836.70000","lower_level_profit_loss_money_amount":"4793.45670","hold_money":"177836.70000","hold_profit_loss_money":"-4793.45670","hold_return_water":"0.00000","hold_total_profit_loss_money":"-4793.45670","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"20","account":"a003","nick_name":"三清","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"229286","member_bet_money":"1133020.00000","member_profit_loss_money":"-102557.86700","lower_level_contribution_money":"1052768.40000","lower_level_profit_loss_money_amount":"-72401.26220","hold_money":"1052768.40000","hold_profit_loss_money":"72401.26220","hold_return_water":"0.00000","hold_total_profit_loss_money":"72401.26220","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"21","account":"a004","nick_name":"陈景海","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"111183","member_bet_money":"549727.00000","member_profit_loss_money":"-5597.79100","lower_level_contribution_money":"259406.20000","lower_level_profit_loss_money_amount":"1983.36340","hold_money":"259406.20000","hold_profit_loss_money":"-1983.36340","hold_return_water":"0.00000","hold_total_profit_loss_money":"-1983.36340","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"25","account":"a008","nick_name":"雷一五","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"162043","member_bet_money":"801059.00000","member_profit_loss_money":"-81028.95800","lower_level_contribution_money":"789508.00000","lower_level_profit_loss_money_amount":"-65875.01850","hold_money":"789508.00000","hold_profit_loss_money":"65875.01850","hold_return_water":"0.00000","hold_total_profit_loss_money":"65875.01850","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"26","account":"a009","nick_name":"亚飞1","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"83352","member_bet_money":"411450.00000","member_profit_loss_money":"10589.68000","lower_level_contribution_money":"354913.60000","lower_level_profit_loss_money_amount":"11728.32780","hold_money":"354913.60000","hold_profit_loss_money":"-11728.32780","hold_return_water":"0.00000","hold_total_profit_loss_money":"-11728.32780","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"28","account":"a011","nick_name":"佳","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"10295","member_bet_money":"50967.00000","member_profit_loss_money":"19128.27800","lower_level_contribution_money":"50967.00000","lower_level_profit_loss_money_amount":"19792.86700","hold_money":"50967.00000","hold_profit_loss_money":"-19792.86700","hold_return_water":"0.00000","hold_total_profit_loss_money":"-19792.86700","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"29","account":"a012","nick_name":"亚飞2","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"3916","member_bet_money":"19304.00000","member_profit_loss_money":"-9123.95700","lower_level_contribution_money":"19304.00000","lower_level_profit_loss_money_amount":"-8903.26900","hold_money":"19304.00000","hold_profit_loss_money":"8903.26900","hold_return_water":"0.00000","hold_total_profit_loss_money":"8903.26900","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"33","account":"a016","nick_name":"利平","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1688","member_bet_money":"8336.00000","member_profit_loss_money":"-3477.52500","lower_level_contribution_money":"8336.00000","lower_level_profit_loss_money_amount":"-3477.52500","hold_money":"8336.00000","hold_profit_loss_money":"3477.52500","hold_return_water":"0.00000","hold_total_profit_loss_money":"3477.52500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"35","account":"a018","nick_name":"雷胜","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"627079","member_bet_money":"3099011.00000","member_profit_loss_money":"-138568.28500","lower_level_contribution_money":"2066490.90000","lower_level_profit_loss_money_amount":"-81232.89600","hold_money":"2066490.90000","hold_profit_loss_money":"81232.89600","hold_return_water":"0.00000","hold_total_profit_loss_money":"81232.89600","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"36","account":"a019","nick_name":"海宏","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"179935","member_bet_money":"889163.00000","member_profit_loss_money":"-32544.13900","lower_level_contribution_money":"544463.30000","lower_level_profit_loss_money_amount":"-20304.45960","hold_money":"544463.30000","hold_profit_loss_money":"20304.45960","hold_return_water":"0.00000","hold_total_profit_loss_money":"20304.45960","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"37","account":"a020","nick_name":"陵水明","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"112808","member_bet_money":"557096.00000","member_profit_loss_money":"-79088.58100","lower_level_contribution_money":"247360.90000","lower_level_profit_loss_money_amount":"-35106.61310","hold_money":"247360.90000","hold_profit_loss_money":"35106.61310","hold_return_water":"0.00000","hold_total_profit_loss_money":"35106.61310","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"2163","account":"a024","nick_name":"宁仔","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"36447","member_bet_money":"179957.00000","member_profit_loss_money":"-4639.38900","lower_level_contribution_money":"93630.40000","lower_level_profit_loss_money_amount":"370.86740","hold_money":"93630.40000","hold_profit_loss_money":"-370.86740","hold_return_water":"0.00000","hold_total_profit_loss_money":"-370.86740","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"11243","account":"a026","nick_name":"AAA","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"6651","member_bet_money":"32795.00000","member_profit_loss_money":"-5138.71500","lower_level_contribution_money":"32795.00000","lower_level_profit_loss_money_amount":"-5138.71500","hold_money":"32795.00000","hold_profit_loss_money":"5138.71500","hold_return_water":"0.00000","hold_total_profit_loss_money":"5138.71500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"14093","account":"a027","nick_name":"AAA","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1185","member_bet_money":"5879.00000","member_profit_loss_money":"-3247.24500","lower_level_contribution_money":"5879.00000","lower_level_profit_loss_money_amount":"-3247.24500","hold_money":"5879.00000","hold_profit_loss_money":"3247.24500","hold_return_water":"0.00000","hold_total_profit_loss_money":"3247.24500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"15352","account":"AT01","nick_name":"","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"791","member_bet_money":"3933.00000","member_profit_loss_money":"-2423.61000","lower_level_contribution_money":"3933.00000","lower_level_profit_loss_money_amount":"-2423.61000","hold_money":"3933.00000","hold_profit_loss_money":"2423.61000","hold_return_water":"0.00000","hold_total_profit_loss_money":"2423.61000","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"38","account":"b001","nick_name":"妹1","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"2432057","member_bet_money":"12022217.00000","member_profit_loss_money":"-492836.19200","lower_level_contribution_money":"4141557.20000","lower_level_profit_loss_money_amount":"-195196.89340","hold_money":"4141557.20000","hold_profit_loss_money":"195196.89340","hold_return_water":"0.00000","hold_total_profit_loss_money":"195196.89340","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"39","account":"b002","nick_name":"妹","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1074822","member_bet_money":"5311048.00000","member_profit_loss_money":"-276362.35600","lower_level_contribution_money":"2492592.70000","lower_level_profit_loss_money_amount":"-138226.04000","hold_money":"2492592.70000","hold_profit_loss_money":"138226.04000","hold_return_water":"2492.59270","hold_total_profit_loss_money":"135733.44730","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"2492.59270"},{"is_showfrontend":"1","child_id":"42","account":"b005","nick_name":"妹","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"142809","member_bet_money":"706069.00000","member_profit_loss_money":"11512.71900","lower_level_contribution_money":"691158.60000","lower_level_profit_loss_money_amount":"26454.83720","hold_money":"691158.60000","hold_profit_loss_money":"-26454.83720","hold_return_water":"691.15860","hold_total_profit_loss_money":"-27145.99580","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"691.15860"}],"Total":{"is_showfrontend":1,"member_bet_count":"9699841","member_bet_money":"47940443","member_profit_loss_money":"-2714289.053","lower_level_contribution_money":"18104811.7","lower_level_profit_loss_money_amount":"-837379.264","hold_money":"18104811.7","hold_profit_loss_money":"837379.264","hold_return_water":"3183.751","hold_total_profit_loss_money":"834195.512","higher_level_contribution_money":"0","higher_level_profit_loss_money":"3183.751","sell_tatal_bet_money":"0","sell_total_profit_loss_money":"0","bet_member_count":null,"period_day":"20170829","period_no":null},"big_shareholder_report_show_benefit":1,"is_show_report":1}
     */


    private DataBean Data;


    public DataBean getData() {
        return Data;
    }

    public void setData(DataBean Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * List : [{"is_showfrontend":"1","child_id":"18","account":"a001","nick_name":"w01","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"4382345","member_bet_money":"21659379.00000","member_profit_loss_money":"-1497419.70400","lower_level_contribution_money":"5071910.80000","lower_level_profit_loss_money_amount":"-270969.43630","hold_money":"5071910.80000","hold_profit_loss_money":"270969.43630","hold_return_water":"0.00000","hold_total_profit_loss_money":"270969.43630","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"19","account":"a002","nick_name":"亚飞","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"101149","member_bet_money":"500033.00000","member_profit_loss_money":"-21465.41600","lower_level_contribution_money":"177836.70000","lower_level_profit_loss_money_amount":"4793.45670","hold_money":"177836.70000","hold_profit_loss_money":"-4793.45670","hold_return_water":"0.00000","hold_total_profit_loss_money":"-4793.45670","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"20","account":"a003","nick_name":"三清","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"229286","member_bet_money":"1133020.00000","member_profit_loss_money":"-102557.86700","lower_level_contribution_money":"1052768.40000","lower_level_profit_loss_money_amount":"-72401.26220","hold_money":"1052768.40000","hold_profit_loss_money":"72401.26220","hold_return_water":"0.00000","hold_total_profit_loss_money":"72401.26220","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"21","account":"a004","nick_name":"陈景海","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"111183","member_bet_money":"549727.00000","member_profit_loss_money":"-5597.79100","lower_level_contribution_money":"259406.20000","lower_level_profit_loss_money_amount":"1983.36340","hold_money":"259406.20000","hold_profit_loss_money":"-1983.36340","hold_return_water":"0.00000","hold_total_profit_loss_money":"-1983.36340","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"25","account":"a008","nick_name":"雷一五","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"162043","member_bet_money":"801059.00000","member_profit_loss_money":"-81028.95800","lower_level_contribution_money":"789508.00000","lower_level_profit_loss_money_amount":"-65875.01850","hold_money":"789508.00000","hold_profit_loss_money":"65875.01850","hold_return_water":"0.00000","hold_total_profit_loss_money":"65875.01850","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"26","account":"a009","nick_name":"亚飞1","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"83352","member_bet_money":"411450.00000","member_profit_loss_money":"10589.68000","lower_level_contribution_money":"354913.60000","lower_level_profit_loss_money_amount":"11728.32780","hold_money":"354913.60000","hold_profit_loss_money":"-11728.32780","hold_return_water":"0.00000","hold_total_profit_loss_money":"-11728.32780","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"28","account":"a011","nick_name":"佳","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"10295","member_bet_money":"50967.00000","member_profit_loss_money":"19128.27800","lower_level_contribution_money":"50967.00000","lower_level_profit_loss_money_amount":"19792.86700","hold_money":"50967.00000","hold_profit_loss_money":"-19792.86700","hold_return_water":"0.00000","hold_total_profit_loss_money":"-19792.86700","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"29","account":"a012","nick_name":"亚飞2","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"3916","member_bet_money":"19304.00000","member_profit_loss_money":"-9123.95700","lower_level_contribution_money":"19304.00000","lower_level_profit_loss_money_amount":"-8903.26900","hold_money":"19304.00000","hold_profit_loss_money":"8903.26900","hold_return_water":"0.00000","hold_total_profit_loss_money":"8903.26900","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"33","account":"a016","nick_name":"利平","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1688","member_bet_money":"8336.00000","member_profit_loss_money":"-3477.52500","lower_level_contribution_money":"8336.00000","lower_level_profit_loss_money_amount":"-3477.52500","hold_money":"8336.00000","hold_profit_loss_money":"3477.52500","hold_return_water":"0.00000","hold_total_profit_loss_money":"3477.52500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"35","account":"a018","nick_name":"雷胜","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"627079","member_bet_money":"3099011.00000","member_profit_loss_money":"-138568.28500","lower_level_contribution_money":"2066490.90000","lower_level_profit_loss_money_amount":"-81232.89600","hold_money":"2066490.90000","hold_profit_loss_money":"81232.89600","hold_return_water":"0.00000","hold_total_profit_loss_money":"81232.89600","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"36","account":"a019","nick_name":"海宏","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"179935","member_bet_money":"889163.00000","member_profit_loss_money":"-32544.13900","lower_level_contribution_money":"544463.30000","lower_level_profit_loss_money_amount":"-20304.45960","hold_money":"544463.30000","hold_profit_loss_money":"20304.45960","hold_return_water":"0.00000","hold_total_profit_loss_money":"20304.45960","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"37","account":"a020","nick_name":"陵水明","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"112808","member_bet_money":"557096.00000","member_profit_loss_money":"-79088.58100","lower_level_contribution_money":"247360.90000","lower_level_profit_loss_money_amount":"-35106.61310","hold_money":"247360.90000","hold_profit_loss_money":"35106.61310","hold_return_water":"0.00000","hold_total_profit_loss_money":"35106.61310","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"2163","account":"a024","nick_name":"宁仔","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"36447","member_bet_money":"179957.00000","member_profit_loss_money":"-4639.38900","lower_level_contribution_money":"93630.40000","lower_level_profit_loss_money_amount":"370.86740","hold_money":"93630.40000","hold_profit_loss_money":"-370.86740","hold_return_water":"0.00000","hold_total_profit_loss_money":"-370.86740","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"11243","account":"a026","nick_name":"AAA","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"6651","member_bet_money":"32795.00000","member_profit_loss_money":"-5138.71500","lower_level_contribution_money":"32795.00000","lower_level_profit_loss_money_amount":"-5138.71500","hold_money":"32795.00000","hold_profit_loss_money":"5138.71500","hold_return_water":"0.00000","hold_total_profit_loss_money":"5138.71500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"14093","account":"a027","nick_name":"AAA","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1185","member_bet_money":"5879.00000","member_profit_loss_money":"-3247.24500","lower_level_contribution_money":"5879.00000","lower_level_profit_loss_money_amount":"-3247.24500","hold_money":"5879.00000","hold_profit_loss_money":"3247.24500","hold_return_water":"0.00000","hold_total_profit_loss_money":"3247.24500","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"15352","account":"AT01","nick_name":"","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"791","member_bet_money":"3933.00000","member_profit_loss_money":"-2423.61000","lower_level_contribution_money":"3933.00000","lower_level_profit_loss_money_amount":"-2423.61000","hold_money":"3933.00000","hold_profit_loss_money":"2423.61000","hold_return_water":"0.00000","hold_total_profit_loss_money":"2423.61000","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"38","account":"b001","nick_name":"妹1","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"2432057","member_bet_money":"12022217.00000","member_profit_loss_money":"-492836.19200","lower_level_contribution_money":"4141557.20000","lower_level_profit_loss_money_amount":"-195196.89340","hold_money":"4141557.20000","hold_profit_loss_money":"195196.89340","hold_return_water":"0.00000","hold_total_profit_loss_money":"195196.89340","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"0.00000"},{"is_showfrontend":"1","child_id":"39","account":"b002","nick_name":"妹","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"1074822","member_bet_money":"5311048.00000","member_profit_loss_money":"-276362.35600","lower_level_contribution_money":"2492592.70000","lower_level_profit_loss_money_amount":"-138226.04000","hold_money":"2492592.70000","hold_profit_loss_money":"138226.04000","hold_return_water":"2492.59270","hold_total_profit_loss_money":"135733.44730","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"2492.59270"},{"is_showfrontend":"1","child_id":"42","account":"b005","nick_name":"妹","company_id":"1","period_no":"","period_day":"20170829","member_id":"2","member_bet_count":"142809","member_bet_money":"706069.00000","member_profit_loss_money":"11512.71900","lower_level_contribution_money":"691158.60000","lower_level_profit_loss_money_amount":"26454.83720","hold_money":"691158.60000","hold_profit_loss_money":"-26454.83720","hold_return_water":"691.15860","hold_total_profit_loss_money":"-27145.99580","higher_level_contribution_money":"0.00000","higher_level_profit_loss_money":"691.15860"}]
         * Total : {"is_showfrontend":1,"member_bet_count":"9699841","member_bet_money":"47940443","member_profit_loss_money":"-2714289.053","lower_level_contribution_money":"18104811.7","lower_level_profit_loss_money_amount":"-837379.264","hold_money":"18104811.7","hold_profit_loss_money":"837379.264","hold_return_water":"3183.751","hold_total_profit_loss_money":"834195.512","higher_level_contribution_money":"0","higher_level_profit_loss_money":"3183.751","sell_tatal_bet_money":"0","sell_total_profit_loss_money":"0","bet_member_count":null,"period_day":"20170829","period_no":null}
         * big_shareholder_report_show_benefit : 1
         * is_show_report : 1
         */

        private TotalBean Total;
        private int big_shareholder_report_show_benefit;
        private int is_show_report;
        private java.util.List<ListBean> List;

        public TotalBean getTotal() {
            return Total;
        }

        public void setTotal(TotalBean Total) {
            this.Total = Total;
        }

        public int getBig_shareholder_report_show_benefit() {
            return big_shareholder_report_show_benefit;
        }

        public void setBig_shareholder_report_show_benefit(int big_shareholder_report_show_benefit) {
            this.big_shareholder_report_show_benefit = big_shareholder_report_show_benefit;
        }

        public int getIs_show_report() {
            return is_show_report;
        }

        public void setIs_show_report(int is_show_report) {
            this.is_show_report = is_show_report;
        }

        public List<ListBean> getList() {
            return List;
        }

        public void setList(List<ListBean> List) {
            this.List = List;
        }

        public static class TotalBean {
            /**
             * is_showfrontend : 1
             * member_bet_count : 9699841
             * member_bet_money : 47940443
             * member_profit_loss_money : -2714289.053
             * lower_level_contribution_money : 18104811.7
             * lower_level_profit_loss_money_amount : -837379.264
             * hold_money : 18104811.7
             * hold_profit_loss_money : 837379.264
             * hold_return_water : 3183.751
             * hold_total_profit_loss_money : 834195.512
             * higher_level_contribution_money : 0
             * higher_level_profit_loss_money : 3183.751
             * sell_tatal_bet_money : 0
             * sell_total_profit_loss_money : 0
             * bet_member_count : null
             * period_day : 20170829
             * period_no : null
             */

            private int is_showfrontend;
            private String member_bet_count;
            private String member_bet_money;
            private String member_profit_loss_money;
            private String lower_level_contribution_money;
            private String lower_level_profit_loss_money_amount;
            private String hold_money;
            private String hold_profit_loss_money;
            private String hold_return_water;
            private String hold_total_profit_loss_money;
            private String higher_level_contribution_money;
            private String higher_level_profit_loss_money;
            private String sell_tatal_bet_money;
            private String sell_total_profit_loss_money;
            private Object bet_member_count;

            private Object period_no;

            public int getIs_showfrontend() {
                return is_showfrontend;
            }

            public void setIs_showfrontend(int is_showfrontend) {
                this.is_showfrontend = is_showfrontend;
            }

            public String getMember_bet_count() {
                return member_bet_count;
            }

            public void setMember_bet_count(String member_bet_count) {
                this.member_bet_count = member_bet_count;
            }

            public String getMember_bet_money() {
                return member_bet_money;
            }

            public void setMember_bet_money(String member_bet_money) {
                this.member_bet_money = member_bet_money;
            }

            public String getMember_profit_loss_money() {
                return member_profit_loss_money;
            }

            public void setMember_profit_loss_money(String member_profit_loss_money) {
                this.member_profit_loss_money = member_profit_loss_money;
            }

            public String getLower_level_contribution_money() {
                return lower_level_contribution_money;
            }

            public void setLower_level_contribution_money(String lower_level_contribution_money) {
                this.lower_level_contribution_money = lower_level_contribution_money;
            }

            public String getLower_level_profit_loss_money_amount() {
                return lower_level_profit_loss_money_amount;
            }

            public void setLower_level_profit_loss_money_amount(String lower_level_profit_loss_money_amount) {
                this.lower_level_profit_loss_money_amount = lower_level_profit_loss_money_amount;
            }

            public String getHold_money() {
                return hold_money;
            }

            public void setHold_money(String hold_money) {
                this.hold_money = hold_money;
            }

            public String getHold_profit_loss_money() {
                return hold_profit_loss_money;
            }

            public void setHold_profit_loss_money(String hold_profit_loss_money) {
                this.hold_profit_loss_money = hold_profit_loss_money;
            }

            public String getHold_return_water() {
                return hold_return_water;
            }

            public void setHold_return_water(String hold_return_water) {
                this.hold_return_water = hold_return_water;
            }

            public String getHold_total_profit_loss_money() {
                return hold_total_profit_loss_money;
            }

            public void setHold_total_profit_loss_money(String hold_total_profit_loss_money) {
                this.hold_total_profit_loss_money = hold_total_profit_loss_money;
            }

            public String getHigher_level_contribution_money() {
                return higher_level_contribution_money;
            }

            public void setHigher_level_contribution_money(String higher_level_contribution_money) {
                this.higher_level_contribution_money = higher_level_contribution_money;
            }

            public String getHigher_level_profit_loss_money() {
                return higher_level_profit_loss_money;
            }

            public void setHigher_level_profit_loss_money(String higher_level_profit_loss_money) {
                this.higher_level_profit_loss_money = higher_level_profit_loss_money;
            }

            public String getSell_tatal_bet_money() {
                return sell_tatal_bet_money;
            }

            public void setSell_tatal_bet_money(String sell_tatal_bet_money) {
                this.sell_tatal_bet_money = sell_tatal_bet_money;
            }

            public String getSell_total_profit_loss_money() {
                return sell_total_profit_loss_money;
            }

            public void setSell_total_profit_loss_money(String sell_total_profit_loss_money) {
                this.sell_total_profit_loss_money = sell_total_profit_loss_money;
            }

            public Object getBet_member_count() {
                return bet_member_count;
            }

            public void setBet_member_count(Object bet_member_count) {
                this.bet_member_count = bet_member_count;
            }

            public Object getPeriod_no() {
                return period_no;
            }

            public void setPeriod_no(Object period_no) {
                this.period_no = period_no;
            }
        }

        public static class ListBean {
            /**
             * is_showfrontend : 1
             * child_id : 18
             * account : a001
             * nick_name : w01
             * company_id : 1
             * period_no :
             * period_day : 20170829
             * member_id : 2
             * member_bet_count : 4382345
             * member_bet_money : 21659379.00000
             * member_profit_loss_money : -1497419.70400
             * lower_level_contribution_money : 5071910.80000
             * lower_level_profit_loss_money_amount : -270969.43630
             * hold_money : 5071910.80000
             * hold_profit_loss_money : 270969.43630
             * hold_return_water : 0.00000
             * hold_total_profit_loss_money : 270969.43630
             * higher_level_contribution_money : 0.00000
             * higher_level_profit_loss_money : 0.00000
             */

            private String is_showfrontend;
            private String child_id;
            private String account;
            private String nick_name;
            private String company_id;
            private String period_no;
            private String period_day;
            private String member_id;
            private String member_bet_count;
            private String member_bet_money;
            private String member_profit_loss_money;
            private String lower_level_contribution_money;
            private String lower_level_profit_loss_money_amount;
            private String hold_money;
            private String hold_profit_loss_money;
            private String hold_return_water;
            private String hold_total_profit_loss_money;
            private String higher_level_contribution_money;
            private String higher_level_profit_loss_money;

            public String getIs_showfrontend() {
                return is_showfrontend;
            }

            public void setIs_showfrontend(String is_showfrontend) {
                this.is_showfrontend = is_showfrontend;
            }

            public String getChild_id() {
                return child_id;
            }

            public void setChild_id(String child_id) {
                this.child_id = child_id;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getNick_name() {
                return nick_name;
            }

            public void setNick_name(String nick_name) {
                this.nick_name = nick_name;
            }

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }

            public String getPeriod_no() {
                return period_no;
            }

            public void setPeriod_no(String period_no) {
                this.period_no = period_no;
            }

            public String getPeriod_day() {
                return period_day;
            }

            public void setPeriod_day(String period_day) {
                this.period_day = period_day;
            }

            public String getMember_id() {
                return member_id;
            }

            public void setMember_id(String member_id) {
                this.member_id = member_id;
            }

            public String getMember_bet_count() {
                return member_bet_count;
            }

            public void setMember_bet_count(String member_bet_count) {
                this.member_bet_count = member_bet_count;
            }

            public String getMember_bet_money() {
                return member_bet_money;
            }

            public void setMember_bet_money(String member_bet_money) {
                this.member_bet_money = member_bet_money;
            }

            public String getMember_profit_loss_money() {
                return member_profit_loss_money;
            }

            public void setMember_profit_loss_money(String member_profit_loss_money) {
                this.member_profit_loss_money = member_profit_loss_money;
            }

            public String getLower_level_contribution_money() {
                return lower_level_contribution_money;
            }

            public void setLower_level_contribution_money(String lower_level_contribution_money) {
                this.lower_level_contribution_money = lower_level_contribution_money;
            }

            public String getLower_level_profit_loss_money_amount() {
                return lower_level_profit_loss_money_amount;
            }

            public void setLower_level_profit_loss_money_amount(String lower_level_profit_loss_money_amount) {
                this.lower_level_profit_loss_money_amount = lower_level_profit_loss_money_amount;
            }

            public String getHold_money() {
                return hold_money;
            }

            public void setHold_money(String hold_money) {
                this.hold_money = hold_money;
            }

            public String getHold_profit_loss_money() {
                return hold_profit_loss_money;
            }

            public void setHold_profit_loss_money(String hold_profit_loss_money) {
                this.hold_profit_loss_money = hold_profit_loss_money;
            }

            public String getHold_return_water() {
                return hold_return_water;
            }

            public void setHold_return_water(String hold_return_water) {
                this.hold_return_water = hold_return_water;
            }

            public String getHold_total_profit_loss_money() {
                return hold_total_profit_loss_money;
            }

            public void setHold_total_profit_loss_money(String hold_total_profit_loss_money) {
                this.hold_total_profit_loss_money = hold_total_profit_loss_money;
            }

            public String getHigher_level_contribution_money() {
                return higher_level_contribution_money;
            }

            public void setHigher_level_contribution_money(String higher_level_contribution_money) {
                this.higher_level_contribution_money = higher_level_contribution_money;
            }

            public String getHigher_level_profit_loss_money() {
                return higher_level_profit_loss_money;
            }

            public void setHigher_level_profit_loss_money(String higher_level_profit_loss_money) {
                this.higher_level_profit_loss_money = higher_level_profit_loss_money;
            }
        }
    }
}
