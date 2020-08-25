import org.junit.Assert;
import org.junit.Test;
public class TestConversions {

    @Test
    public void test1(){
        boolean result = Main.conversion("привет прикол");
        Assert.assertTrue(result);
    }

    @Test
    public void test2(){
        boolean result = Main.conversion("ааббдд ддббаа");
        Assert.assertTrue(result);
    }

    @Test
    public void test3(){
        boolean result = Main.conversion("абаб ааах");
        Assert.assertFalse(result);
    }

    @Test
    public void test4(){
        boolean result = Main.conversion("абаб абаба");
        Assert.assertFalse(result);
    }

    @Test
    public void test5(){
        boolean result = Main.conversion("йцукенгшщзхъфывапролджэячсмитьбюё йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertFalse(result);
    }

    @Test
    public void test6(){
        boolean result = Main.conversion("йуцкенгшщзхъфывапролджэячсмитьбюё йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test7(){
        boolean result = Main.conversion("ёцукенгшщзхъфывапролджэячсмитьбюй йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertFalse(result);
    }

    @Test
    public void test8(){
        boolean result = Main.conversion("покот полок");
        Assert.assertTrue(result);
    }

    @Test
    public void test9(){
        boolean result = Main.conversion("ёуцкенгшщзхъфывапролджэячсмитбюй йуцкенгшщзхъфывапролджэячсмитбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test10(){
        boolean result = Main.conversion("ёуцкенгшщзхъфывапролджэячсмитбюйёуцкенгшщзхъфывапролджэячсмитбюй йуцкенгшщзхъфывапролджэячсмитбюёйуцкенгшщзхъфывапролджэячсмитбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test11(){
        boolean result = Main.conversion("аб аа");
        Assert.assertTrue(result);
    }

    @Test
    public void test12(){
        boolean result = Main.conversion("б а");
        Assert.assertTrue(result);
    }

    @Test
    public void test13(){
        boolean result = Main.conversion("ббббб ааааа");
        Assert.assertTrue(result);
    }

    @Test
    public void test14(){
        boolean result = Main.conversion("аабх ббвр");
        Assert.assertTrue(result);
    }

    @Test
    public void test15(){
        boolean result = Main.conversion("абв ааа");
        Assert.assertTrue(result);
    }

    @Test
    public void test16(){
        boolean result = Main.conversion("ааа ббб");
        Assert.assertTrue(result);
    }

    @Test
    public void test17(){
        boolean result = Main.conversion("абвгдеёжзийклмнопрстуфхцчшщъыьэюя абвгдеёжзийклмнопрстуфхцчшщъыьэюы");
        Assert.assertTrue(result);
    }

    @Test
    public void test18(){
        boolean result = Main.conversion("абвв авбб");
        Assert.assertTrue(result);
    }

}
