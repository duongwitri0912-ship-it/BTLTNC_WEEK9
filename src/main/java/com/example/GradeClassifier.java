package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GradeClassifier {

    private static final Logger logger = LoggerFactory.getLogger(GradeClassifier.class);

    public static String classifyGrade(double gpa) {
        logger.info("Bắt đầu xử lý phân loại điểm cho GPA: {}", gpa);

        if (gpa < 0.0 || gpa > 10.0) {
            logger.error("Lỗi dữ liệu: GPA {} không hợp lệ (phải từ 0.0 đến 10.0)", gpa);
            throw new IllegalArgumentException("GPA không hợp lệ: " + gpa);
        }

        String result;
        if (gpa < 5.0) {
            result = "Yếu";
        } else if (gpa < 6.5) {
            result = "Trung bình";
        } else if (gpa < 8.0) {
            result = "Khá";
        } else {
            result = "Giỏi";
        }

        logger.info("Hoàn thành phân loại. Kết quả: {} (GPA: {})", result, gpa);
        return result;
    }
}