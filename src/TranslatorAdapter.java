import java.util.Scanner;

public class TranslatorAdapter implements JapaneseTarget {
    private VietNameseAdaptee adaptee;

    public TranslatorAdapter(VietNameseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    private String translate(String vietnameseWords) {   // bắt đầu thực hiện quá trình chuyển đổi
        System.out.println("Đang chạy bộ Adapter để dịch...!");
        System.out.println("Đã dịch xong!");
        return "Tôi tên là Lộc."; // trả về chuỗi định dạng tiếng việt
    }


    @Override
    public void send(String wordsJapanese) {
        System.out.println(wordsJapanese);
        String vietnameseWords = this.translate(wordsJapanese);  // Chạy bộ chuyển đổi để dịch từ tiếng Nhật sang tiếng Việt
        System.out.println("Gửi chuỗi đã được thay đổi định dạng sang Tiếng việt vào Adaptee");
        adaptee.receive(vietnameseWords);  //Định dạng tiếng việt
    }


}

