package prueba_tecnica.stepdefinitions;

import enums.TxtValidacion;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.DatosAuto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.RealizarPedido;
import task.Carrito;
import java.util.Map;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepsDefinitionsPrueba {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Daniel");
    }
    @Given("El usuario ingresa a la pagina SANANGEL")
    public void elUsuarioIngresaALaPaginaSANANGEL() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://sanangel.com.co/"));
    }
    @When("Realiza la seleccion de los productos")
    public void realizaLaSeleccionDelPrimerProducto(DatosAuto datos) {
        theActorInTheSpotlight().attemptsTo(Carrito.elFormulario(datos));
    }
    @Then("Se realiza la question de validacion")
    public void seRealizaLaQuestionDeValidacion() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(RealizarPedido.value(), equalTo(TxtValidacion.TXT_TEXTO.getMesaje()))
        );
    }
    @DataTableType
    public DatosAuto datosAuto(@Transpose Map<String, String> entry){
        return new DatosAuto(
                entry.get("strcant1"),
                entry.get("strcant2")
        );

    }
}
