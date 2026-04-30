package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner; // Cố tình thêm import thừa để tạo lỗi

public class GradeClassifier{ // Thiếu khoảng trắng trước dấu ngoặc nhọn
    // Cố tình không thụt đầu dòng (Indentation error)
    private static final Logger logger=LoggerFactory.getLogger(GradeClassifier.class); // Viết dính liền dấu bằng

    // Đổi tên tham số gpa thành Gpa (Vi phạm quy tắc đặt tên camelCase của Java)
    public static String classifyGrade(double Gpa) {
        logger.info("Bắt đầu xử lý phân loại điểm cho GPA: {}", Gpa); // Thụt lề sai lộn xộn

        if(Gpa<0.0||Gpa>10.0){ // Cố tình xóa hết khoảng trắng quanh các toán tử <, >, ||
            logger.error("Đã xảy ra lỗi: GPA không hợp lệ ({})", Gpa);
            throw new IllegalArgumentException("GPA không hợp lệ: " + Gpa);
        }

        if (Gpa < 5.0) {
            logger.debug("GPA {} < 5.0, phân loại: Yếu", Gpa);
            return "Yếu";
        }

        if(Gpa<6.5) // Xóa khoảng trắng sau chữ if
        { // Cố tình đưa ngoặc nhọn xuống dòng (Tùy cấu hình checkstyle mà đây có thể là lỗi)
            logger.debug("GPA {} < 6.5, phân loại: Trung bình", Gpa);
            return "Trung bình";
        }

        if (Gpa< 8.0) {
            logger.debug("GPA {} < 8.0, phân loại: Khá", Gpa);
            return "Khá";
        }



// Thừa quá nhiều dòng trống vô lý ở trên
        logger.debug("GPA {} >= 8.0, phân loại: Giỏi", Gpa);
        return "Giỏi";
    }
}