package oo;

import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

/**
 * 챕터5, 객체지향 설계 원칙 SOLID
 */
public class Solid {

}

// 1. 단일 책임 원칙
//class DateViewer {
//    public void display() {
//        String data = loadHtml();
//        updateGui(data);
//    }
//
//    public String loadHtml() {
//        HttpClient client = new HttpClient(new URL("http://www.naver.com");
//        return client.getURLFile();
//    }
//
//    private void updateGui(String data) {
//        GuiData guiModel = parseDataToGuiData(data);
//        ...
//    }
//    ...
//}

// 여기서 HTTP 기반 프로토콜이 소켓 기반으로 변경이 되면?
//class DateViewer {
//    public void display() {
//        byte[] data = loadHtml();
//        updateGui(data);
//    }
//
//    public byte[] loadHtml() {
//        SocketClient client = new SocketClient(new URL("http://www.naver.com");
//        return client.read();
//    }
//
//    private void updateGui(byte[] data) {
//        GuiData guiModel = parseDataToGuiData(data);
//        ...
//    }
//    ...
//}


// 2. 개방 폐쇄 원칙
// - 추상화 사용
class FileService {
    Downloader down;

    public FileService(Downloader down) {
        this.down = down;
    }

    public void fileDown() {
        down.download();
    }
}

interface Downloader {
    void download();
}

class FileDownloader implements Downloader {
    @Override
    public void download() {
        System.out.println("파일");
    }
}

class SocketDownloader implements Downloader {
    @Override
    public void download() {
        System.out.println("소켓");
    }
}

// - 상속 사용
class MoveServie {
    Move move;

    public MoveServie(Move move) {
        this.move = move;
    }
}

class Move {

    public void move() {
        System.out.println("움직임");
    }
}

class FastMove extends Move {
    @Override
    public void move() {
        System.out.println("빠르게 움직임");
    }
}