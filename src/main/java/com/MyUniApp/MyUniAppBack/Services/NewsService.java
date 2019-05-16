package com.MyUniApp.MyUniAppBack.Services;

import com.MyUniApp.MyUniAppBack.Model.AppNew;
import java.util.List;

public interface NewsService {
        List<AppNew> getAllNews();
        void postNew(AppNew appNew);
        int getNewsCount();
}
