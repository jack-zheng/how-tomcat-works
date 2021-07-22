package com.jzheng.others;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目的：使用默认的 IP 启动服务器
 *
 * Expected: all IPs:8888 能访问
 * Actual: only 127.0.0.1:8888 可以访问
 *
 * 都说默认就全部可访问，奇了怪了，难道是 mac 有什么特殊的设定？
 */
public class ServerSocketTest {
    public static void main(String[] args) throws Exception {
        SocketClient client = new SocketClient();
        new Thread(client).start();

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println(serverSocket);
        while(true) {
            Socket act = serverSocket.accept();
            System.out.println(act);
        }

    }
}

class SocketClient implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000);
            try {
                Socket socket = new Socket("127.0.0.1", 8888);
                System.out.println("127.0.0.1 成功" + socket);
            } catch (Exception e) {
                System.err.println("127.0.0.1 失败");
            }
            try {
                Socket socket = new Socket("192.168.1.100", 8888);
                System.out.println("192.168.1.100 成功" + socket);
            } catch (Exception e) {
                System.err.println("192.168.1.100 失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
