package net.home.BankTest.Controller;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController("/BankTest")
public class BankController {

@RequestMapping(value = "/get",method = RequestMethod.GET)
@ResponseBody
public String getBankTest(ModelMap model){
    return "fignya";
}

}
