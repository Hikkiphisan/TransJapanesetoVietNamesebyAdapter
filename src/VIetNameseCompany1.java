public class VIetNameseCompany1 {
    public static void main(String[] args) {    //Client sử dụng Adapter qua interface:
        JapaneseTarget japanclient = new TranslatorAdapter(new VietNameseAdaptee()); //trọng tâm của quá trình sử dụng Adapter, cho phép japanclient sử dụng TranslatorAdapter với giao diện JapaneseTarget mà không phải lo lắng về sự không tương thích của VietNameseAdaptee.



        System.out.println("Khách hàng người Nhật gửi lời chào qua message: ");
        japanclient.send("`こにちは`．"); //Định dạng tiếng nhật
    }
}

/* Quá trình hoat dong:
Client: Ông người Nhật sẽ gửi lời chào có địng dạng tiếng nhật tới công ty người việt.
Target:   interface chứa khung chức năng được sử dụng bởi Client  (Adapter).
Adapter: Bộ chuyển đổi Adapter sẽ nhận dược định dạng tiếng nhật từ Client và chuyển đổi nó sang định dạng tiếng việt trước khi gởi cho người Việt.
Adaptee: class được sử dụng để nhận địng dạng tiếng việt được chuyển đổi.
 */