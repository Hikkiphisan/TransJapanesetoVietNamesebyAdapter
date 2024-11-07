public class VIetNameseCompany1 {
    public static void main(String[] args) {    //Client sử dụng Adapter qua interface:
        JapaneseTarget japanclient = new TranslatorAdapter(new VietNameseAdaptee());
    // đây là trọng tâm của Adapter Design Pattern.
    //biến japanclient có địng dạng tiếng nhật sẽ thông qua TranslatorAdapter để tương thích với định dạng tiếng việt.



        System.out.println("Khách hàng người Nhật gửi lời chào qua message: ");
        japanclient.send("[こにちは.]"); //Định dạng tiếng nhật
    }
}

/* Quá trình hoat dong:
Client: Ông người Nhật sẽ gửi lời chào có địng dạng tiếng nhật tới công ty người việt.
Target:   interface chứa khung chức năng được sử dụng bởi Client  (Adapter).
Adapter: Bộ chuyển đổi Adapter sẽ nhận dược định dạng tiếng nhật từ Client và chuyển đổi nó sang định dạng tiếng việt
Adaptee: class sẽ nhận địng dạng tiếng việt được chuyển đổi.
 */