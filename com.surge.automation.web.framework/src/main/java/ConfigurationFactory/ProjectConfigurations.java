package ConfigurationFactory;

import constants.FileConstant;

public class ProjectConfigurations {

    public static String username(){
     String username=System.getProperty("username");
     if(username==null){
       return FileConstant.getEnvironmentKey("defaultUsername");
     }
     return username;
    }

    public static String password(){
        String password=System.getProperty("password");
        if(password==null){
      return FileConstant.getEnvironmentKey("defaultPassword");
        }
        return password;
    }


    public static String browser(){
        String browser=System.getProperty("browser");
        if(browser==null){
          return  FileConstant.getEnvironmentKey("defaultBrowserName");
        }
        return browser;
    }

    public static String URL(){
        String environment=System.getProperty("envUrl");
        if(environment==null){
          return  FileConstant.getEnvironmentKey("dev");
        }
        return FileConstant.getEnvironmentKey(environment.toLowerCase());
    }

}
