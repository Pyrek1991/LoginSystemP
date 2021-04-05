import java.util.HashMap;

public class IDandPasswords {
     
     HashMap<String, String> logininfo = new HashMap<String, String>();
     
     IDandPasswords() {
          
          logininfo.put("Pyrek", "pyrek");
          logininfo.put("xDee", "xdee");
          logininfo.put("Avalos", "avalos");
     }
     
     protected HashMap<String, String> getLoginInfo () {
	    return logininfo;
     }
}
