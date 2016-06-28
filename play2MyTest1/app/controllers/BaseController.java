package controllers;

import play.Logger;
import play.mvc.Controller;

/**
 * Created by azmake on 16/5/23.
 */
public class BaseController extends Controller {
    public static void test() {
        Logger.info(request().toString());
        response().setHeader("Access-Control-Allow-Origin", "*");
        response().setHeader("Access-Control-Allow-Headers", "X-Requested-With");
    }
}
