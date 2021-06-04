package oo;

import org.w3c.dom.css.Rect;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

/**
 * 챕터5, 객체지향 설계 원칙 SOLID
 */
public class Solid {
    public static void main(String[] args) {
//        RectangleClient rc = new RectangleClient();
//        Rectangle rect = new Rectangle();
//        rect.setHeight(10);
//        rect.setWidth(12);
//
//        Rectangle squa = new Square();
//        squa.setWidth(10);
//
//        rc.increseHeight(rect);
//        rc.increseHeight(squa);
//        System.out.println(rect.getHeight() + " : " + rect.getWidth());
//        System.out.println(squa.getHeight() + " : " + squa.getWidth());
    }
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
//
//// - 상속 사용
//class MoveServie {
//    Move move;
//
//    public MoveServie(Move move) {
//        this.move = move;
//    }
//}
//
//class Move {
//
//    public void move() {
//        System.out.println("움직임");
//    }
//}
//
//class FastMove extends Move {
//    @Override
//    public void move() {
//        System.out.println("빠르게 움직임");
//    }
//}


// 3. 리스코프 치환 원칙
class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

class RectangleClient {
    public void increseHeight(Rectangle rec) {
        if (rec.getHeight() <= rec.getWidth()) {
            rec.setHeight(rec.getWidth() + 10);
        }
    }
}

// 4. 인터페이스 분리 원칙
// 자바는 C 언어처럼 링크를 직접하는게 아닌 언어 차원에서 class 파일로 제어되니 생략...
// 다만, 패키지 구조 전략을 잘 사용하자는 말뿐..

// 5. 의존 역전 원칙
//class FlowController {
//    public void process() {
//        // 저수준인 실제 구현에 의존
//        FileDataReader reader = new FileDataReader();
//    }
//}
//// 고수준인 추상화에 의존
//class FileDataReader implements ByteSource {
//    ...
//}


// 6. DI와 서비스 로케이터
//class Worker {
//
//    public void run() {
//        JobQueue jobQueue = Locator.getInstance().getJobQueue();
//        Transcoder transcoder = Locator.getInstance().getTranscoder();
//        ...
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        JobQueue jobQueue = new FileJobQueue();
//
//        Locator locator = new Locator(jobQueue);
//        Locator.init(locator);
//
//        ...
//    }
//}

// 생성자 방식
//class Worker {
//    private JobQueue jobQueue;
//
//    public Worker(JobQueue jobQueue) {
//        this.jobQueue = jobQueue;
//    }
//}

// 설정 메서드 방식
//class Worker {
//    private JobQueue jobQueue;
//
//    public void setJobQueue(JobQueue jobQueue) {
//        this.jobQueue = jobQueue;
//    }
//}