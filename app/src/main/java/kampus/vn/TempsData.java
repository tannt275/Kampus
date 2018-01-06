package kampus.vn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TanNT on 1/6/18.
 */

public class TempsData {

    public static List<EarthQuake> generateEarthQuakes () {
        List<EarthQuake> list = new ArrayList<>();
        list.add(new EarthQuake(5.1, "62Km Bắc của ", "Hà Đông, Hà Nội", "Jun 12, 2016", "8:01 PM"));
        list.add(new EarthQuake(1.1, "16Km Tây Bắc của ", "Chi Nê, Hoà ", "Jun 12, 2016", "7:55 PM"));
        list.add(new EarthQuake(2.2, "12Km Tây Nam của ", "Việt Trì, Phú Thọ", "Jun 12, 2016", "7:18 PM"));
        list.add(new EarthQuake(5.1, "6Km Đông Bắc của ", "Đồng Kị, Bắc Ninh", "Jun 12, 2016", "5:11 AM"));
        list.add(new EarthQuake(3.5, "21Km Đông Nam của ", "Đông Anh, Hà Nội", "Jun 12, 2016", "7:01 PM"));
        list.add(new EarthQuake(4.5, "7Km Bắc của ", "Kim Bảng, Hà Nam", "Jun 12, 2016", "6:13 AM"));
        return list;
    }
}
