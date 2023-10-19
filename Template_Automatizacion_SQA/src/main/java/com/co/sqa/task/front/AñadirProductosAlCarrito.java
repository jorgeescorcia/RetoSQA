package com.co.sqa.task.front;

import com.co.sqa.userinterface.sanangel.PaginaProductos;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AñadirProductosAlCarrito implements Task {

    private Faker faker = new Faker();

    @Override
    public <T extends Actor> void performAs(T actor) {
        int productoRamdom = faker.random().nextInt(1,6);
        actor.wasAbleTo(

                Click.on(PaginaProductos.PRODUCTO_UNO),
                Click.on(PaginaProductos.AÑADIR_CARRITO),
                Click.on(PaginaProductos.HOME),
                Click.on(PaginaProductos.PRODUCTO_DOS),
                Click.on(PaginaProductos.AÑADIR_CARRITO),
                Click.on(PaginaProductos.BTN_CARRITO)

        );
    }
    public static AñadirProductosAlCarrito añadirProductoAlCarrito(){
        return Tasks.instrumented(AñadirProductosAlCarrito.class);
    }
}
