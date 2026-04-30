package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("   CHƯƠNG TRÌNH PHÂN LOẠI ĐIỂM (GPA)       ");
        System.out.println("===========================================");

        try {
            System.out.print("Nhập điểm GPA của bạn (0.0 - 10.0): ");
            // Đọc dữ liệu từ terminal
            String input = scanner.nextLine();
            double gpa = Double.parseDouble(input);

            // Gọi logic từ class GradeClassifier mà bạn đã viết
            String result = GradeClassifier.classifyGrade(gpa);

            System.out.println("-------------------------------------------");
            System.out.println("Kết quả phân loại: " + result);
            System.out.println("===========================================");

        } catch (NumberFormatException e) {
            System.err.println("Lỗi: Vui lòng nhập số thực hợp lệ (ví dụ: 8.5).");
        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi logic: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi hệ thống: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Cảm ơn bạn đã sử dụng phần mềm!");
        }
    }
}