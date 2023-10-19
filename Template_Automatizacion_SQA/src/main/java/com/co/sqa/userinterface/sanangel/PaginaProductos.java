package com.co.sqa.userinterface.sanangel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {



    public static final Target PRODUCTO_UNO =
            Target.the("Username").locatedBy("//img[@alt='arreglo floral manarola con 50 flores medellin']");

    public static final Target PRODUCTO_DOS =
            Target.the("Username").locatedBy("//img[@alt='cilindro con 24 rosas medellin']");
    public static final Target AÑADIR_CARRITO =
            Target.the("Username").locatedBy("//button[@class='single_add_to_cart_button button alt']");

    public static final Target HOME =
            Target.the("Username").locatedBy("//img[@class='navmenu__logo']");

    public static final Target BTN_CARRITO =
            Target.the("Username").locatedBy("//header/div[2]/nav[2]/ul[1]/li[2]/a[1]/i[1]");


}
