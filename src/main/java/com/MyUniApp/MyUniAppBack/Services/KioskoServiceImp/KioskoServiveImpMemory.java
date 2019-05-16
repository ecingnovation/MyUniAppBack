package com.MyUniApp.MyUniAppBack.Services.KioskoServiceImp;

import com.MyUniApp.MyUniAppBack.Exceptions.KioskoException;
import com.MyUniApp.MyUniAppBack.Model.KioskoMenu;
import com.MyUniApp.MyUniAppBack.Services.KioskoService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class KioskoServiveImpMemory implements KioskoService {

    private HashMap<String,KioskoMenu> foods = new HashMap<>();

    @PostConstruct
    private void populateSampleDataKioskos()
    {
        foods.put("1", new KioskoMenu("1","Pechuga a la Plancha","A", 11000, "Pechuga + Papas + Ensalada", "RS", "https://media-cdn.tripadvisor.com/media/photo-s/0f/22/ac/a1/pechuga-de-pollo-a-la.jpg"));
        foods.put("2", new KioskoMenu("2","Huevos Rancheros","D",5700,"Huevos + Cafe + Pan","K1","http://cdn.elcocinerocasero.com/imagen/receta/1000/2017-12-16-00-38-17/huevos-rancheros-mexicanos.jpeg"));
        foods.put("3", new KioskoMenu("3","Empanada","I",2000,"Empanada de carne y papa","K2","https://1.bp.blogspot.com/-W1YRj_xiL9k/UUnwQFl1esI/AAAAAAAAAcQ/Q_vAsGNvXYM/s1600/empanada_2%5B1%5D.jpg"));
        foods.put("4", new KioskoMenu("4","Gaseosa Coca-Cola","B",2400,"Gaseosa Coca-Cola 500 ml personal","K3","https://jumbocolombiafood.vteximg.com.br/arquivos/ids/188559-1000-1000/7702535001752COCA-COLA--CLASICA-X-600-ML.jpg?v=636144861663370000"));
        foods.put("5", new KioskoMenu("5","Combo Perro","C",6500,"Perro + Papas + Gaseosa Vaso","HV","http://www.harveyrestaurante.com/bogota/images/COMBOS/Combo_Perro_2.jpg"));
    }


    @Override
    public List<KioskoMenu> getAllKioskoMenuItems() {
        List<KioskoMenu> allFoods = new ArrayList<KioskoMenu>(foods.values());
        return allFoods;
    }

    @Override
    public KioskoMenu getKioskoMenuById(String id) throws KioskoException {
        if(!foods.containsKey(id)){
            throw new KioskoException(KioskoException.NOT_FOUND);
        }
        KioskoMenu item = foods.get(id);
        return item;
    }

    @Override
    public List<KioskoMenu> getKioskoMenuItemsByKioskoId(String kiosko) throws KioskoException {
        List<KioskoMenu> allFoods = this.getAllKioskoMenuItems();
        List<KioskoMenu> kioskoFoods = new ArrayList<KioskoMenu>();
        for(int i=0; i<allFoods.size();i++){
            if(allFoods.get(i).getKiosko().equals(kiosko)){
                kioskoFoods.add(allFoods.get(i));
            }
        }
        if(kioskoFoods.isEmpty()){
            throw new KioskoException(KioskoException.NOT_FOUND);
        }
        return kioskoFoods;
    }

    @Override
    public List<KioskoMenu> getKioskoMenuItemsByTipo(String tipo) throws KioskoException {
        List<KioskoMenu> allFoods = this.getAllKioskoMenuItems();
        List<KioskoMenu> typeFoods = new ArrayList<KioskoMenu>();
        for(int i=0; i<allFoods.size();i++){
            if(allFoods.get(i).getTipo().equals(tipo)){
                typeFoods.add(allFoods.get(i));
            }
        }
        if(typeFoods.isEmpty()){
            throw new KioskoException(KioskoException.NOT_FOUND);
        }
        return typeFoods;
    }

    @Override
    public KioskoMenu createKioskoMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL) throws KioskoException {
        if(foods.containsKey(id)){
            throw new KioskoException(KioskoException.ALREADY_EXISTS);
        }
        foods.put(id,new KioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL));
        return foods.get(id);
    }

    @Override
    public KioskoMenu updateKioskoMenu(String id, String titulo, String tipo, long precio, String descripcion, String kiosko, String imageURL) throws KioskoException {
        if(!foods.containsKey(id)){
            throw new KioskoException(KioskoException.NOT_FOUND);
        }
        foods.replace(id,new KioskoMenu(id,titulo,tipo,precio,descripcion,kiosko,imageURL));
        return foods.get(id);
    }

    @Override
    public void deleteKioskoMenyById(String id) throws KioskoException {
        if(!foods.containsKey(id)){
            throw new KioskoException(KioskoException.NOT_FOUND);
        }
        foods.remove(id);
    }
}
