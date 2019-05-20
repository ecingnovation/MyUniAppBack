package com.MyUniApp.MyUniAppBack.Services.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import com.MyUniApp.MyUniAppBack.Model.AppNew;
import com.MyUniApp.MyUniAppBack.Services.NewsService;

import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    private ArrayList<AppNew> newsList = new ArrayList<>();

    @PostConstruct
    private void populateSampleData()
    {
        newsList.add(new AppNew(1, "Primera Noticia Normal", "Juan Marín", "Normal", 1554126456114l, "juan.marin@escuelaing.edu.co", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://www.escuelaing.edu.co/escuela/iberdiscap2017/img/img-portada.jpg"));
        newsList.add(new AppNew(2, "Segunda Noticia Advertencia", "Andrés Ramírez", "Warning", 1577686456114l, "andres.ramirez@escuelaing.edu.co", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "https://www.escuelaing.edu.co/uploads/secciones/8916_conozcanos_01.jpg"));
        newsList.add(new AppNew(3, "Tercera Noticia Informativa", "Fabian Zabaleta", "Info", 1590886456114l, "fabian.zabaleta@escuelaing.edu.co", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "undefined"));
    }

    @Override
    public List<AppNew> getAllNews() {
        return newsList;
    }

    @Override
    public void postNew(AppNew appNew) {
        newsList.add(0, appNew);
    }

    @Override
    public int getNewsCount() {
        return this.newsList.size();
    }
}