package com.dn.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

public class Request {
//    烧烤鱿鱼
//    金沙鸡翅
//    干拔财鱼
//    小炒时蔬
//    韭菜鸡蛋
//    牛肉丸冬瓜汤（要买嫩芹菜）
    static CloseableHttpClient httpClient = HttpClients.createDefault();
    public static String httpGet(String url){
        HttpGet httpGet = new HttpGet(url);
        String res = "";
        try {
            CloseableHttpResponse execute = httpClient.execute(httpGet);
            HttpEntity entity = execute.getEntity();
            res = EntityUtils.toString(entity);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return res;
    }

    public static String httpPost(String url,String body){
        HttpPost httpPost = new HttpPost(url);
        String res = "";
        try {
            httpPost.setEntity(new StringEntity(body,"UTF-8"));
            CloseableHttpResponse execute = httpClient.execute(httpPost);
            HttpEntity entity = execute.getEntity();
            res = EntityUtils.toString(entity);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return res;
    }



}
