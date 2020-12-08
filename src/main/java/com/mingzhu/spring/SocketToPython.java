package com.mingzhu.spring;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.Socket;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class SocketToPython {
    public Object remoteCall() throws IOException {
        Map<String,String> dict = new HashMap<String,String>();
        dict.put("日期","2020.12.08");
        dict.put("发送者","java web");
        //创建一个Socket，跟服务器的8080端口链接
        Socket socket = new Socket("192.168.56.1", 54321);
        //使用PrintWriter和BufferedReader进行读写数据
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //发送数据
        pw.println(dict);
        pw.flush();
        //接收数据
        String line = is.readLine();
        System.out.println(line);
        //关闭资源
        pw.close();
        is.close();
        socket.close();
        return null;
    }
}
