package Display;

public class Menu {


    public String showMenuBegin() {
        return "-----------------Menu-------------\n"
                + "           1.Đăng nhập            \n"
                + "           2.Đăng ký            \n"
                + "           3.Thoát            \n";
    }
    public String showTypeSearch() {
        return "--------------Chọn Loại-------------\n"
                + "           1.ID                 \n"
                + "           2.Email            \n"
                + "           3.Phone            \n";
    }

    public String menuFunctionClient(String idname) {
        return "--------------" + idname + "------------------\n"
                + "          1.Thông tin tài khoản           \n"
                + "          2.Sách Có Ở Tiệm                 \n"
                + "          3.Mua Sách Online               \n"
                + "          4.Đăng xuất                        \n";
    }
    public String menuFunctionStaff(String idname) {
        return "--------------" + idname + "------------------\n"
                + "          1.Thông tin tài khoản           \n"
                + "          2.Quản lý tài khoản khách       \n"
                + "          3.Quản lý Bill                  \n"
                + "          4.Đăng xuất                          \n";
    }
    public String menuFunctionManager(String idname) {
        return "--------------" + idname + "------------------\n"
                + "          1.Thông tin tài khoản           \n"
                + "          2.Quản lý tài khoản khách       \n"
                + "          3.Quản lý tài khoản Staff       \n"
                + "          4.Quản lý Bill                  \n"
                + "          5.Quản lý Sách                  \n"
                + "          6.Đăng xuất                          \n"
                ;
    }
   public String infoYourAccount(String idname){
        return "--------------" + idname + "------------------\n"
                +"          1.Hiển thị thông tin tài khoản   \n"
                +"          2.Đổi mật khẩu                   \n"
                +"          3.Sửa lại tên                    \n"
                +"          4.Thoát                          \n";

   }

    public String menuManagerCRUD(String idname,String type){
        return "--------------" + idname + "------------------\n"
                +"          1.Danh Sách thông tin "+type+"   \n"
                +"          2.Tạo "+type+"                   \n"
                +"          3.Sửa thông tin "+type+"         \n"
                +"          4.Xóa  "+type+"                  \n"
                + "         5.Thoát                          \n";
    }

public String menuEditClient(String idname){
    return "--------------" + idname + "------------------\n"
            +"          1.Đổi Mật Khẩu                   \n"
            +"          2.Đổi Email                      \n"
            +"          3.Đổi Tên                      \n"
            +"          4.Sửa Hạng                       \n"
            +"          5.Sửa Điểm Thưởng                \n"
            + "         6.Thoát                          \n"
            + "         Tìm bằng ID                         \n";
}
    public String menuEditStaff(String idname){
        return "--------------" + idname + "------------------\n"
                +"          1.Đổi Mật Khẩu                   \n"
                +"          2.Đổi Email                      \n"
                +"          3.Đổi Tên                      \n"
                +"          4.Sửa Đánh Giá                   \n"
                +"          5.Sửa Lương                      \n"
                + "         6.Sửa Giờ Làm                    \n"
                + "         7.Thoát                          \n"
                + "         Tìm bằng ID                          \n";
    }
    public String menuEditBook(String idname){
        return "--------------" + idname + "------------------\n"
                +"          1.Sửa Tên Sách                   \n"
                +"          2.Sửa Miêu Tả                    \n"
                +"          3.Sửa Giá                        \n"
                +"          4.Sửa Khuyến Mại                 \n"
                +"          5.Bổ Sung Sách                   \n"
                + "         6.Thoát                          \n";
    }
    public String menuEditBill(String idname){
        return "--------------" + idname + "------------------\n"
                +"          1.Sửa Tên Sách                   \n"
                +"          2.Sửa Miêu Tả                    \n"
                +"          3.Sửa Giá                        \n"
                +"          4.Sửa Khuyến Mại                 \n"
                +"          5.Bổ Sung Sách                   \n"
                + "         6.Thoát                          \n";
    }

public String findID(){
        return "Tìm bằng ID";
}
    public String inputFullName() {
        return " Tên : ";
    }

    public String inputID() {
        return "ID : ";
    }

    public String inputPass() {
        return "PassWord : ";
    }

    public String inputPhone() {
        return "Số Điện Thoại : ";
    }

    public String inputEmail() {
        return "Email : ";
    }
    public String inputPointBonus() {
        return "Điểm Thưởng: ";
    }
    public String inputRating() {
        return "Hệ Số Đánh Giá: ";
    }
    public String inputHourWork() {
        return " Số Giờ Làm: ";
    }
    public String inputSalary() {
        return " Lương : ";
    }
    public String inputRealNumber(){return "Nhập số thực ";}
    public String inputDescribe() {
        return " Miêu tả: ";
    }

    public String inputNumber() {
        return "Nhập số : ";
    }
    public String validateFail(){
        return " Sai Định Dạng ";
    }
    public String duplicape(String name){
        return " Trùng "+name;
    }
    public String magicHappen(){
        return "dính bug ";
    }
    public String notAuthority(){
        return " bạn tuổi gì mà thao tác";
    }
    public String userNoBrain(){
        return "Người dùng nên có tư duy";
    }
    public String brainFish(){return "Não cá vàng rồi";}
    public String completeRegeiter(){
        return "Hoàn thành đăng ký";
    }
    public String done(){
        return "Done ! ";
    }
}
