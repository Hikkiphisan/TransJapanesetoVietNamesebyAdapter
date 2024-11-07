public class VIetNameseCompany {
    public static void main(String[] args) {    //Client sử dụng Adapter qua interface:
        JapaneseTarget japanclient = new TranslatorAdapter(new VietNameseAdaptee());



        System.out.println("Khách hàng người Nhật giới thiệu bản thân: ");
        japanclient.send("ろくと申します．"); //Định dạng tiếng nhật
    }
}