package service;

import java.util.List;

/**
 *
 * @author cuongnguyenba
 * @param <T>
 */
public interface NhanVienService<T> {

    List<T> getAllNhanVien();

    String updateNhanVien(T nhanVien);
    
    String deleteNhanVien(String ma);
}
