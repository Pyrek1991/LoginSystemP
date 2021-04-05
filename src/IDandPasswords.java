import java.util.HashMap;

public class IDandPasswords {
     
     HashMap<String, String> logininfo = new HashMap<String, String>();
     
     IDandPasswords() {
          
          logininfo.put("Pyrek", "pyrek");
          logininfo.put("Alan", "alan");
          logininfo.put("Karolina", "karolina");
     }
     
     protected HashMap<String, String> getLoginInfo () {
	    return logininfo;
     }
}
