package logMessage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Map<String, String> logs = new HashMap<>();
        
        logs.put("LD1226I01", "ダミーテキスト");
        logs.put("LD1056I02", "つれづれなるまゝに、日暮らし、硯にむかひて、心にうつりゆくよしなし事");
        logs.put("LD1876D03", "を、そこはかとなく書きつくれば、あやしうこそものぐるほしけれ。");
        logs.put("LD1226I04", "（Wikipediaより）つれづれなるまゝに、日暮らし、硯にむかひて、心にうつり");
        logs.put("LD1234E05", "ゆくよしなし事を");
        logs.put("LD1226I06", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD7726I07", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD1656W08", "日暮らし");
        logs.put("LD1265I09", "硯にむかひて");
        logs.put("LD1226I10", "心にうつりゆくよしなし事を");
        logs.put("LD1290W11", "そこはかとなく書きつくれば");
        logs.put("LD1226I12", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD3326I13", "日暮らし");
        logs.put("LD1216E14", "硯にむかひて");
        logs.put("LD1268I15", "心にうつりゆくよしなし事を");
        logs.put("LD1116I16", "そこはかとなく書きつくれば");
        logs.put("LD1226E17", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD1435I18", "日暮らし");
        logs.put("LD1226I19", "硯にむかひて");
        logs.put("LD1987I20", "心にうつりゆくよしなし事を");
        logs.put("LD1132D21", "そこはかとなく書きつくれば");
        logs.put("LD1262I22", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD2626I23", "日暮らし");
        logs.put("LD1376I24", "硯にむかひて");
        logs.put("LD1226D25", "心にうつりゆくよしなし事を");
        logs.put("LD2626I26", "そこはかとなく書きつくれば");
        logs.put("LD1622W27", "あやしうこそものぐるほしけれ。（Wikipediaより）つれづれなるまゝに");
        logs.put("LD5466D28", "日暮らし");
        logs.put("LD2261I29", "硯にむかひて");
        logs.put("LD2621E30", "心にうつりゆくよしな");
        logs.put("LD5556I31", "親譲りの無鉄砲で小供の時から損ばかりしている。小学校に居る時分学校の二階から飛び降りて一週間ほど腰を抜かした事がある。なぜそんな無闇をしたと聞く人があるかも知れぬ。別段深い理由でもない。新築の二階から首を出していたら");
        logs.put("LD1776E32", "同級生の一人が冗談に");
        logs.put("LD2612I33", "いくら威張っても");
        logs.put("LD6122D34", "そこから飛び降りる事は出来まい。弱虫やーい。と囃したからである。小使に負ぶさって帰って来た時");
        logs.put("LD1286I35", "おやじが大きな眼をして二階ぐらいから飛び降りて腰を抜かす奴があるかと云ったから");
        logs.put("LD1226D36", "この次は抜かさずに飛んで見せますと答えた。（青空文庫より）");
        logs.put("LD1666W37", "Lorem ipsum dolor sit amet");
        logs.put("LD1299I38", " consectetur adipisicing elit");
        logs.put("LD2226W39", " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        logs.put("LD1126I40", " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident");
        logs.put("LD1233E41", " sunt in culpa qui officia deserunt mollit anim id est laborum.");
        logs.put("LD1767I42", "親譲りの無鉄砲で小供の時から損ばかりしている");
        logs.put("LD1009E43", "小学校に居る時分学校の二階から飛び降りて一週間ほど腰を抜かした事がある");
        logs.put("LD1354I44", "なぜそんな無闇をしたと聞く人があるかも知れぬ");
        logs.put("LD1116I45", "別段深い理由でもない");
        logs.put("LD1118E46", "新築の二階から首を出していたら、同級生の一人が冗談に、いくら威張っても、そこから飛び降りる事は出来まい");
        logs.put("LD1789I47", "弱虫やーい");
        logs.put("LD3326I48", "と囃したからである");
        logs.put("LD1676W49", "小使に負ぶさって帰って来た時、おやじが大きな眼をして二階ぐらいから飛び降りて腰を抜かす奴があるかと云ったから、この次は抜かさずに飛んで見せますと答えた");
        logs.put("LD7656E50", "（青空文庫より）");
        for(Entry<String, String> log: logs.entrySet()) {
            int random = (int)(Math.random()*3)+1;
            int random2 = (int)(Math.random()*3)+1;
            if(random == 1 | random == 2) {
                System.out.println(log.getKey() + ":" + log.getValue());
            }
            if(random == random2) {
                System.out.println();
            }
        }
        
    }
}
