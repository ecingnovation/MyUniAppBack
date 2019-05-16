package com.MyUniApp.MyUniAppBack.Services;

import com.MyUniApp.MyUniAppBack.Exceptions.KioskoException;
import com.MyUniApp.MyUniAppBack.Model.KioskoMenu;
import java.util.List;

public interface KioskoService {

    List<KioskoMenu> getAllKioskoMenuItems();

    KioskoMenu getKioskoMenuById(String id) throws KioskoException;

    List<KioskoMenu> getKioskoMenuItemsByKioskoId(String kiosko) throws KioskoException;

    List<KioskoMenu> getKioskoMenuItemsByTipo(String tipo) throws KioskoException;

    KioskoMenu createKioskoMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL) throws KioskoException;

    KioskoMenu updateKioskoMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL) throws KioskoException;

    void deleteKioskoMenyById(String id) throws KioskoException;

}
