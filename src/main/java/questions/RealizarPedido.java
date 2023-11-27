package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.SeleccionProductos;

public class RealizarPedido implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return SeleccionProductos.BTN_REALIZAR_PEDIDO.resolveFor(actor).getText();
    }
    public static Question<String> value() {return new RealizarPedido();}
}
