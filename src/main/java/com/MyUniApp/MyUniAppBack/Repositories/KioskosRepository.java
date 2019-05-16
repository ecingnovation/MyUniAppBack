package com.MyUniApp.MyUniAppBack.Repositories;

import com.MyUniApp.MyUniAppBack.Model.KioskoMenu;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface KioskosRepository extends MongoRepository<KioskoMenu, String> {
    List<KioskoMenu> findAllByTipo(String tipo);
    List<KioskoMenu> findAllByKiosko(String kiosko);
}
