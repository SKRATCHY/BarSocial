package udea.edu.co.barsocial.controller;

import udea.edu.co.barsocial.modelo.InfoDao;
import udea.edu.co.barsocial.modelo.LugarDao;

/**
 * Created by JD on 24/07/2015.
 */
public class DataController {

    private static  DataController dc;
    LugarDao[] lugares;
    private static LugarDao lugarDao;
    public static void createLugar(){

        lugarDao = new LugarDao();
        lugarDao.setName("primero");
        lugarDao.setInfo(new InfoDao());
        lugarDao.saveInBackground();


    }






    private DataController() {
    }
    public static DataController getInstance() {
        if(dc==null){
            dc = new DataController();
        }
        return dc;
    }
}
