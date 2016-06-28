package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import javax.inject.Singleton;

/**
 * Created by azmake on 16/5/19.
 */
@Singleton
public class Application extends Controller {
    public Result index(){return ok(index.render("I love you, do you know?"));}
}
