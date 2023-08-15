import helpers.ApiHelper;
import helpers.ShopHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PetTest extends BaseTest {
    @BeforeEach
    void Befor(){

    }
    @Test
    void createPet(){
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),200," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),300," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),400," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),500," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),200," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),200," код не тот"));
       executableList.add(()-> Assertions.assertEquals(ShopHelper.createPet().getStatusCode(),200," код не тот"));
    }
}
