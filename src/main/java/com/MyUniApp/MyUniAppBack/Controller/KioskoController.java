package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Model.KioskoMenu;
import com.MyUniApp.MyUniAppBack.Repositories.KioskosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://myuniapp-eci.firebaseapp.com"})
@RestController
@RequestMapping("/kioskos")
public class KioskoController {

    @Autowired
    KioskosRepository ks;

    @RequestMapping(value = "/menuItems", method = RequestMethod.GET)
    public List<KioskoMenu> getAllKioskoMenuItems() {
        List<KioskoMenu> json = ks.findAll();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems/{id}", method = RequestMethod.GET)
    public KioskoMenu getKioskoMenuById(@PathVariable("id") String id) {
        KioskoMenu json = ks.findById(id).get();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems/k/{kiosko}", method = RequestMethod.GET)
    public List<KioskoMenu> getKioskoMenuItemsByKioskoId(@PathVariable("kiosko") String kiosko) {
        List<KioskoMenu> json  = ks.findAllByKiosko(kiosko);

        return json;
    }

    @RequestMapping(value = "/menuItems/tipo/{tipo}", method = RequestMethod.GET)
    public List<KioskoMenu> getKioskoMenuItemsByTipo(@PathVariable("tipo") String tipo) {
        List<KioskoMenu> json = json = ks.findAllByTipo(tipo);
        return json;
    }

    @RequestMapping(value = "/menuItems",
            produces = "application/json",
            method=RequestMethod.POST)
    public ResponseEntity<?> createKioskosMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL){

            ks.save(new KioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL));

        return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }

    @RequestMapping(value = "/menuItems",
            produces = "application/json",
            method=RequestMethod.PUT)
    public ResponseEntity<?> updateKioskosMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL){
        ks.save(new KioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "/menuItems/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> removeKioskosMenu(@PathVariable("id") String id) {
        ks.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }
}
