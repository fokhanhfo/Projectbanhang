//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                e tong = 0;
//        DefaultTableModel model = (DefaultTableModel) SanPhamTable.getModel();
//        int rowCount = model.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            String thanhtien = SanPhamTable.getValueAt(i, 3).toString();
//            double tt = Double.parseDouble(thanhtien);
//            tong += tt;
//        }
//
//        return tong;
//    }
//
//    //search
//    public void search() {
//        String name = txtTimHoaDon.getText().trim();
//        QuanLyDonHangDAO ql = new QuanLyDonHangDAO();
//        DefaultTableModel model = (DefaultTableModel) DonHangtTable.getModel();
//        model.setRowCount(0);
//        Timestamp Ngay = null;
//        ResultSet rs = ql.TimKiem(name);
//        try {
//            while (rs.next()) {
//                int id = rs.getInt("ID");
//                String TenKH = rs.getString("TENKHACHHANG");
//                String TenNV = rs.getString("TENNV");
//                float tong = rs.getFloat("TONGTIEN");
//                Ngay = rs.getTimestamp("NGAYXUAT");
//                model.addRow(new Object[]{id, TenKH, TenNV, tong, Ngay});
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton btn = (JButton) e.getSource();
//        if (btn.equals(btnTim)) {
//            btnTim_actionPerformed();
//        } else if (btn.equals(btnAll)) {
//            btnAll_actionPerformed();
//        } else if (btn.equals(btnXoa)) {
//            btnXoa_actionPerformed();
//        } else {
//            btnExcel_actionPerformed();
//        }
//    }
//
//    public void GetTuNgay(PropertyChangeEvent evt) {
//        if ("date".equals(evt.getPropertyName())) {
//            selectedDateTuNgay = TuNgay.getDate();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
//            formattedDateTuNgay = sdf.format(selectedDateTuNgay);
//            //System.out.println(formattedDate);
//        }
//    }
//
//    public void GetDenNgay(PropertyChangeEvent evt) {
//        if ("date".equals(evt.getPropertyName())) {
//            selectedDateDenNgay = DenNgay.getDate();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());
//            formattedDateDenNgay = sdf.format(selectedDateDenNgay);
//            //System.out.println(formattedDate);
//        }
//    }
//
//    public void btnTim_actionPerformed() {
//        if (selectedDateTuNgay == null || selectedDateDenNgay == null) {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày!");
//        } else {
//            QuanLyDonHangDAO ql = new QuanLyDonHangDAO();
//            java.sql.Date tungay = new java.sql.Date(selectedDateTuNgay.getTime());
//            java.sql.Date denngay = new java.sql.Date(selectedDateDenNgay.getTime());
//            ResultSet rs = ql.SelectTheoNgay(tungay, denngay);
//            DefaultTableModel model = (DefaultTableModel) DonHangtTable.getModel();
//            model.setRowCount(0);
//            Timestamp Ngay = null;
//            try {
//                while (rs.next()) {
//                    int id = rs.getInt("ID");
//                    String TenKH = rs.getString("TENKHACHHANG");
//                    String TenNV = rs.getString("TENNV");
//                    float tong = rs.getFloat("TONGTIEN");
//                    Ngay = rs.getTimestamp("NGAYXUAT");
//                    model.addRow(new Object[]{id, TenKH, TenNV, tong, Ngay});
//                }
//                DoanhThu();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void btnAll_actionPerformed() {
//        HienThiThongTin();
//        selectedDateTuNgay = null;
//        DoanhThu();
//    }
//
//    public void btnXoa_actionPerformed() {
//        int idpx = 0;
//        QuanLyDonHangDAO ql = new QuanLyDonHangDAO();
//
//        if (SelectRow != -1) {
//            // Hiển thị hộp thoại xác nhận
//            int confirmed = JOptionPane.showConfirmDialog(this,
//                    "Bạn có muốn xóa đơn hàng này không?", "Xác nhận xóa đơn hàng",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (confirmed == JOptionPane.YES_OPTION) {
//                // Nếu người dùng chọn YES, thực hiện xóa đơn hàng
//                idpx = Integer.parseInt(DonHangtTable.getValueAt(SelectRow, 0).toString());
//                int kq = ql.XoaDonHang(idpx);
//                if (kq != 0) {
//                    JOptionPane.showMessageDialog(this, "Xóa đơn hàng thành công");
//                    HienThiThongTin();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Xóa đơn hàng không thành công!");
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng muốn xóa!");
//        }
//    }
//
//    public void btnExcel_actionPerformed() {
//        exportToExcel();
//    }
//
//    private void exportToExcel() {
//        // Tạo workbook mới
//        Workbook workbook = new XSSFWorkbook();
//
//        // Tạo một trang tính mới
//        Sheet sheet = workbook.createSheet("Data");
//
//        // Lấy số dòng và số cột của bảng
//        int rowCount = DonHangtTable.getRowCount();
//        int columnCount = DonHangtTable.getColumnCount();
//
//        // Ghi tên cột vào hàng đầu tiên
//        Row headerRow = sheet.createRow(0);
//        for (int col = 0; col < columnCount; col++) {
//            headerRow.createCell(col).setCellValue(DonHangtTable.getColumnName(col));
//        }
//
//        // Ghi dữ liệu từ bảng vào file Excel
//        for (int i = 0; i < rowCount; i++) {
//            Row row = sheet.createRow(i + 1); // Bắt đầu từ hàng thứ hai sau header
//            for (int j = 0; j < columnCount; j++) {
//                Object value = DonHangtTable.getValueAt(i, j);
//                Cell cell = row.createCell(j);
//                if (value != null) {
//                    cell.setCellValue(value.toString());
//                }
//            }
//        }
//
//        // Đường dẫn tới file Excel đích
//        String filePath = "D:\\on_java\\Supermarket\\excel\\table_DonHang.xlsx";
//
//        // Lưu workbook vào một file
//        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
//            workbook.write(outputStream);
//            JOptionPane.showMessageDialog(null, "Xuất file thành công.");
//        } catch (IOException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Lỗi, không thể xuất file: " + e.getMessage());
//        }
//    }
//
//}
