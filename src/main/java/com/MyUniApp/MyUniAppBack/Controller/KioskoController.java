package com.MyUniApp.MyUniAppBack.Controller;

import com.MyUniApp.MyUniAppBack.Exceptions.KioskoException;
import com.MyUniApp.MyUniAppBack.Model.KioskoMenu;
import com.MyUniApp.MyUniAppBack.Services.KioskoService;
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
    KioskoService ks;

    @RequestMapping(value = "/menuItems", method = RequestMethod.GET)
    public List<KioskoMenu> getAllKioskoMenuItems() {
        List<KioskoMenu> json = ks.getAllKioskoMenuItems();
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems/{id}", method = RequestMethod.GET)
    public KioskoMenu getKioskoMenuById(@PathVariable("id") String id) {
        KioskoMenu json = null;
        try {
            json = ks.getKioskoMenuById(id);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems/k/{kiosko}", method = RequestMethod.GET)
    public List<KioskoMenu> getKioskoMenuItemsByKioskoId(@PathVariable("kiosko") String kiosko) {
        List<KioskoMenu> json = null;
        try {
            json = ks.getKioskoMenuItemsByKioskoId(kiosko);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems/tipo/{tipo}", method = RequestMethod.GET)
    public List<KioskoMenu> getKioskoMenuItemsByTipo(@PathVariable("tipo") String tipo) {
        List<KioskoMenu> json = null;
        try {
            json = ks.getKioskoMenuItemsByTipo(tipo);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/menuItems",
            produces = "application/json",
            method=RequestMethod.POST)
    public ResponseEntity<?> createKioskosMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL){
        try {
            ks.createKioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }

    @RequestMapping(value = "/menuItems",
            produces = "application/json",
            method=RequestMethod.PUT)
    public ResponseEntity<?> updateKioskosMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL){
        try {
            ks.updateKioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }

    @RequestMapping(path = "/menuItems/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> removeKioskosMenu(@PathVariable("id") String id) {
        try {
            ks.deleteKioskoMenyById(id);
        } catch (KioskoException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }
}
