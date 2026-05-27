package com.dn.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

public class Request {
    static CloseableHttpClient httpClient = HttpClients.createDefault();
    public static String httpGet(String url){
        HttpGet httpGet = new HttpGet(url);
        String res = "";
        try {
            httpGet.addHeader("content-type","application/json");
            httpGet.setHeader("Authorization","Bearer "+"");
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

    public static String httpPostWithAuto(String url,String body){
        HttpPost httpPost = new HttpPost(url);
        String res = "";
        try {
            httpPost.setEntity(new StringEntity(body,"UTF-8"));
            httpPost.addHeader("content-type","application/json");
            httpPost.setHeader("Authorization","Bearer "+"");
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

    public static String httpPut(String url,String body){
        HttpPut httpPut = new HttpPut(url);
        String res = "";
        try {
            httpPut.setEntity(new StringEntity(body,"UTF-8"));
            httpPut.addHeader("content-type","application/json");
            httpPut.setHeader("Authorization","Bearer "+"");
            CloseableHttpResponse execute = httpClient.execute(httpPut);
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

    public static String httpDelete(String url){
        HttpDelete httpDelete = new HttpDelete(url);
        String res = "";
        try {
            httpDelete.addHeader("content-type","application/json");
            httpDelete.setHeader("Authorization","Bearer "+"");
            CloseableHttpResponse execute = httpClient.execute(httpDelete);
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
