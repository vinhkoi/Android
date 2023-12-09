package com.example.streamingapp_nhom12.request;

import com.example.streamingapp_nhom12.utils.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static ApiInterface apiInterface = retrofit.create(ApiInterface.class);

     public static ApiInterface getMovieApi() {
        return apiInterface;
    }
}







































//    Đây là một lớp đóng vai trò là một Client để tạo ra các yêu cầu
//    kết nối đến API của ứng dụng. Lớp này sử dụng Retrofit - một
//    thư viện HTTP client cho Android - để tạo ra các yêu cầu API.
//
//        Ở đây, lớp ApiClient được khai báo với một số phương thức
//        để khởi tạo và trả về một API Interface. Các phương thức
//        này bao gồm:
//
//        - retrofit: được khởi tạo với baseUrl là đường dẫn cơ bản của
//          API và GsonConverterFactory để chuyển đổi định dạng dữ liệu từ
//          JSON sang Java Objects.
//        - apiInterface: được khởi tạo bằng cách sử dụng retrofit để
//          tạo ra một đối tượng API Interface, sẽ được sử dụng để gửi
//          các yêu cầu kết nối đến API.
//        - getMovieApi(): phương thức này trả về đối tượng apiInterface
//          được khởi tạo từ Retrofit, để gửi các yêu cầu liên quan đến
//          phần mềm xem phim.