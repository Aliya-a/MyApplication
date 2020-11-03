package com.example.javaproject;

import java.io.IOException;
import java.lang.annotation.Documented;

import javax.lang.model.util.Elements;
import javax.xml.bind.Element;

public class MyClass {
    public static void main(String[]args){
        System.out.println("");
        String ur1="http://www.usd.cny.com/bankofchina.htm";
        try{
            Documented doc=JSoup.connect(ur1).get();
            System.out.println(doc.title());
            Element table=doc.getElementsByTag(tagName:"table").first();
            Elements trs=table.getElementsByTag(tagName:"tr");
            for(Element tr:trs){
                Elements tds =tr.getElementsByTag(tagName:"td");
                if(tds.size()>0){
                    String td1=tds.get(0).text();
                    String td2=tds.get(5).text();
                    System.out.println(td1+"==>"+td2);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
    }

        public class RateListActivity extends ListActivity{
    }
    }