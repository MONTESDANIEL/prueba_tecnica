package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionProductos {
    public static final Target SEL_OBJETO1 = Target.the("Selecciona el primer objeto para añadir (manarola)")
            .located(By.xpath("//body/div[@id='primary']/main[@id='main']/article[@id='post-4492']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[2]/img[1]"));
    public static final Target SEL_OBJETO2 = Target.the("Selecciona el primer objeto para añadir (caja agata)")
            .located(By.xpath("//body/div[@id='primary']/main[@id='main']/article[@id='post-4492']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[2]/img[1]"));
    public static final Target CANTIDAD = Target.the("Dropdown cantidad")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/input[1]"));
    public static final Target BTN_AÑADIR_CARRITO = Target.the("Añade el producto seleccionado")
            .located(By.xpath("//button[contains(text(),'Añadir al carrito')]"));
     public static final Target BTN_INICIO = Target.the("Regresa al inicio de la pagina")
                .located(By.xpath("//body[1]/div[1]/header[1]/div[2]/div[1]/a[1]/img[1]"));
    public static final Target BTN_REALIZAR_PEDIDO = Target.the("Boton realizar el pedido")
                .located(By.xpath("//body[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[3]/div[2]/table[1]/tfoot[1]/tr[2]/td[1]/strong[1]/span[1]/bdi[1]"));

}
