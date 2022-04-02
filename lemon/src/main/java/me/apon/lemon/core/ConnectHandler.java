package me.apon.lemon.core;


import java.net.Socket;

/**
 * Created by yaopeng(aponone@gmail.com) on 2018/11/2.
 */
public interface ConnectHandler{

    void connectSuccess(Socket socket);

    void connectFail();

    void disconnect();
}
