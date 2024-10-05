import DTO.ProfileMatch;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/findMatch")
    public ResponseEntity findMatchingOpportunities(@RequestParam(required = true) List<String> skills, @RequestParam(required = true) List<String> locationPreferences, @RequestParam(required = true) List<String> positionType){
        return ResponseEntity.ok(ProfileMatch.class);
    }


}
