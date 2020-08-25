import org.junit.Assert;
import org.junit.Test;
public class Test2 {

    @Test
    public void test1(){
        boolean result = NewMain.conversion("привет прикол");
        Assert.assertTrue(result);
    }

    @Test
    public void test2(){
        boolean result = NewMain.conversion("ааббдд ддббаа");
        Assert.assertTrue(result);
    }

    @Test
    public void test3(){
        boolean result = NewMain.conversion("абаб ааах");
        Assert.assertFalse(result);
    }

    @Test
    public void test4(){
        boolean result = NewMain.conversion("абаб абаба");
        Assert.assertFalse(result);
    }

    @Test
    public void test5(){
        boolean result = NewMain.conversion("йцукенгшщзхъфывапролджэячсмитьбюё йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertFalse(result);
    }

    @Test
    public void test6(){
        boolean result = NewMain.conversion("йуцкенгшщзхъфывапролджэячсмитьбюё йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test7(){
        boolean result = NewMain.conversion("ёцукенгшщзхъфывапролджэячсмитьбюй йуцкенгшщзхъфывапролджэячсмитьбюё");
        Assert.assertFalse(result);
    }

    @Test
    public void test8(){
        boolean result = NewMain.conversion("покот полок");
        Assert.assertTrue(result);
    }

    @Test
    public void test9(){
        boolean result = NewMain.conversion("ёуцкенгшщзхъфывапролджэячсмитбюй йуцкенгшщзхъфывапролджэячсмитбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test10(){
        boolean result = NewMain.conversion("ёуцкенгшщзхъфывапролджэячсмитбюйёуцкенгшщзхъфывапролджэячсмитбюй йуцкенгшщзхъфывапролджэячсмитбюёйуцкенгшщзхъфывапролджэячсмитбюё");
        Assert.assertTrue(result);
    }

    @Test
    public void test11(){
        boolean result = NewMain.conversion("аб аа");
        Assert.assertTrue(result);
    }

    @Test
    public void test12(){
        boolean result = NewMain.conversion("б а");
        Assert.assertTrue(result);
    }

    @Test
    public void test13(){
        boolean result = NewMain.conversion("ббббб ааааа");
        Assert.assertTrue(result);
    }

    @Test
    public void test14(){
        boolean result = NewMain.conversion("аабх ббвр");
        Assert.assertTrue(result);
    }

    @Test
    public void test15(){
        boolean result = NewMain.conversion("абв ааа");
        Assert.assertTrue(result);
    }

    @Test
    public void test16(){
        boolean result = NewMain.conversion("ааа ббб");
        Assert.assertTrue(result);
    }

    @Test
    public void test17(){
        boolean result = NewMain.conversion("абвгдеёжзийклмнопрстуфхцчшщъыьэюя абвгдеёжзийклмнопрстуфхцчшщъыьэюы");
        Assert.assertTrue(result);
    }

    @Test
    public void test18(){
        boolean result = NewMain.conversion("абвв авбб");
        Assert.assertTrue(result);
    }

    @Test
    public void test19(){
        boolean result = NewMain.conversion("абвгдеёжзийклмнопрстуфхцчшщъыьэюя аввгдеёжзийклмнопрстуфхцчшщъыьэюя");
        Assert.assertTrue(result);
    }
}
