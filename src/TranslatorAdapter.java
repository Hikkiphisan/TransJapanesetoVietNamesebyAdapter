import java.util.Scanner;
 // lớp Adapter tuân thủ giao diện của client
public class TranslatorAdapter implements JapaneseTarget {
    private VietNameseAdaptee adaptee;   // Tham chiếu đến đối tượng VietNameseAdaptee

    public TranslatorAdapter(VietNameseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    private String translate(String vietnameseWords) {   // bắt đầu thực hiện quá trình chuyển đổi
        System.out.println("Đang chạy bộ chuyển đổi Adapter để dịch...!");
        System.out.println("Đã dịch xong!");
        return "[Xin chào.]"; // trả về chuỗi định dạng tiếng việt
    }


    @Override
    public void send(String wordsJapanese) {  //  Triển khai phương thức của interface trong lớp Adapter:
        System.out.println(wordsJapanese);
        String vietnameseWords = this.translate(wordsJapanese);  // Chạy bộ chuyển đổi để dịch từ tiếng Nhật sang tiếng Việt
        System.out.println("Gửi chuỗi đã được thay đổi định dạng sang Tiếng việt vào Adaptee");
        adaptee.receive(vietnameseWords);  //Định dạng tiếng việt
    }


}

