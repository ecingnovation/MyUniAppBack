
import com.MyUniApp.MyUniAppBack.Model.AppDiligence;
import com.MyUniApp.MyUniAppBack.Services.DiligenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/diligence")
public class DiligenceController {

    @Autowired
    DiligenceService diligenceService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<AppDiligence> getAllDiligences() {
        List<AppDiligence> value;
        value = diligenceService.getAllDiligences();
        return value;
    }



}

