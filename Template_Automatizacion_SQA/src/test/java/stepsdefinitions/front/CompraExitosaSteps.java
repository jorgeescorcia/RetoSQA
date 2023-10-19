package stepsdefinitions.front;


import com.co.sqa.task.front.AbrirWeb;
import com.co.sqa.task.front.AñadirProductosAlCarrito;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraExitosaSteps extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario se encuentra en la pagina principal de Sanangel")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipalDeSanangel()  {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());

    }

    @Cuando("el usuario añade varios producto al carrito de compra")
    public void elUsuarioAñadeUnProductoAlCarritoDeCompra() {
        theActorInTheSpotlight().attemptsTo(AñadirProductosAlCarrito.añadirProductoAlCarrito());

    }


}
