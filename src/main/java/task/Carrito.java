package task;

import io.cucumber.java.bs.Dato;
import model.DatosAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SeleccionProductos;

public class Carrito implements Task {
    private DatosAuto datos;

    public Carrito(DatosAuto datos) {
        this.datos = datos;
    }
    public static Carrito elFormulario(DatosAuto datos) {
        return Tasks.instrumented(Carrito.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionProductos.SEL_OBJETO1),
                Click.on(SeleccionProductos.CANTIDAD),
                Enter.theValue(datos.getStrcant1()).into(SeleccionProductos.CANTIDAD),
                Click.on(SeleccionProductos.BTN_AÑADIR_CARRITO),
                Click.on(SeleccionProductos.BTN_INICIO),
                Click.on(SeleccionProductos.SEL_OBJETO2),
                Click.on(SeleccionProductos.CANTIDAD),
                Enter.theValue(datos.getStrcant2()).into(SeleccionProductos.CANTIDAD),
                Click.on(SeleccionProductos.BTN_AÑADIR_CARRITO)
        );
    }

}
