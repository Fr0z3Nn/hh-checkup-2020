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
        Assert.assertFalse(result);
    }

    @Test
    public void test12(){
        boolean result = Main.conversion("б а");
        Assert.assertFalse(result);
    }

    @Test
    public void test13(){
        boolean result = Main.conversion("ббббб ааааа");
        Assert.assertFalse(result);
    }

}