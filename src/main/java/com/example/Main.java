package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Ứng dụng Phân loại điểm GPA đang khởi động...");

        try {
            System.out.print("Nhập điểm GPA của bạn (0.0 - 10.0): ");
            String input = scanner.nextLine();

            double gpa = Double.parseDouble(input);

            String result = GradeClassifier.classifyGrade(gpa);

            logger.info("Xử lý thành công. GPA: {} => Kết quả phân loại: {}", gpa, result);

        } catch (NumberFormatException e) {
            logger.error("Lỗi người dùng: Dữ liệu nhập vào không phải là số thực hợp lệ.");
        } catch (IllegalArgumentException e) {
            logger.error("Lỗi logic: {}", e.getMessage());
        } catch (Exception e) {
            logger.error("Đã xảy ra lỗi hệ thống nghiêm trọng: {}", e.getMessage());
        } finally {
            scanner.close();
            logger.info("Ứng dụng kết thúc an toàn.");
        }
    }
}