package main.test.com.stackroute.exercise4test;

import main.java.com.stackroute.exercise4.ReplaceDWithFandLWithT;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ReplaceDWithFandLWithTTest
{
    ReplaceDWithFandLWithT object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new ReplaceDWithFandLWithT();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkandreplace()
    {
        String result=object.replacestring("The Marvel Cinematic Universe (MCU) is an American media franchise and shared universe centered on a series of superhero films, independently produced by Marvel Studios and based on characters that appear in American comic books published by Marvel Comics. The franchise also includes comic books, short films, television series, and digital series. The shared universe, much like the original Marvel Universe in comic books, was established by crossing over common plot elements, settings, cast, and characters. Phil Coulson, portrayed by Clark Gregg, is an original character to the MCU and the only character to appear across all its different media.");
        assertEquals("The Marvet Cinematic Universe (MCU) is an American mefia franchise anf sharef universe centeref on a series of superhero fitms, infepenfentty profucef by Marvet Stufios anf basef on characters that appear in American comic books pubtishef by Marvet Comics. The franchise atso inctufes comic books, short fitms, tetevision series, anf figitat series. The sharef universe, much tike the originat Marvet Universe in comic books, was estabtishef by crossing over common ptot etements, settings, cast, anf characters. Phit Coutson, portrayef by Ctark Gregg, is an originat character to the MCU anf the onty character to appear across att its fifferent mefia.",result);
    }
    @Test
    public void secondcheckandreplace()
    {
        String result=object.replacestring("The first MCU film was Iron Man (2008), which began the first phase of films culminating in the crossover film The Avengers (2012). Phase Two began with Iron Man 3 (2013) and concluded with Ant-Man (2015). Phase Three began with Captain America: Civil War (2016) and is set to conclude with Spider-Man: Far From Home (2019). The first three phases in the franchise are collectively known as \"The Infinity Saga\". Marvel Television expanded the universe to network television with Marvel's Agents of S.H.I.E.L.D. on ABC in the 2013–14 television season, followed by online streaming with Marvel's Daredevil on Netflix in 2015 and Marvel's Runaways on Hulu in 2017, and then to cable television with Marvel's Cloak & Dagger on Freeform in 2018. Marvel Television also produced the digital series Marvel's Agents of S.H.I.E.L.D.: Slingshot. Soundtrack albums have been released for all the films and many of the television series, as well compilation albums containing existing music heard in the films. The MCU also includes tie-in comics published by Marvel Comics, while Marvel Studios has also produced a series of direct-to-video short films and a viral marketing campaign for its films and the universe with the faux news program WHIH Newsfront.");
        assertEquals("The first MCU fitm was Iron Man (2008), which began the first phase of fitms cutminating in the crossover fitm The Avengers (2012). Phase Two began with Iron Man 3 (2013) anf conctufef with Ant-Man (2015). Phase Three began with Captain America: Civit War (2016) anf is set to conctufe with Spifer-Man: Far From Home (2019). The first three phases in the franchise are cottectivety known as \"The Infinity Saga\". Marvet Tetevision expanfef the universe to network tetevision with Marvet's Agents of S.H.I.E.L.D. on ABC in the 2013–14 tetevision season, fottowef by ontine streaming with Marvet's Darefevit on Netftix in 2015 anf Marvet's Runaways on Hutu in 2017, anf then to cabte tetevision with Marvet's Ctoak & Dagger on Freeform in 2018. Marvet Tetevision atso profucef the figitat series Marvet's Agents of S.H.I.E.L.D.: Stingshot. Sounftrack atbums have been reteasef for att the fitms anf many of the tetevision series, as wett compitation atbums containing existing music hearf in the fitms. The MCU atso inctufes tie-in comics pubtishef by Marvet Comics, white Marvet Stufios has atso profucef a series of firect-to-vifeo short fitms anf a virat marketing campaign for its fitms anf the universe with the faux news program WHIH Newsfront.",result);
    }
    @Test
    public void thirdcheckandreplace()
    {
        String result=object.replacestring("The franchise has been commercially successful, though some critics have found that some of its films and television series have suffered in service of the wider universe. It has inspired other film and television studios with comic book character adaptation rights to attempt to create similar shared universes. The MCU has also been the focus of other media, outside of the shared universe, including attractions at various Walt Disney Parks and Resorts, an attraction at Discovery Times Square, a Queensland Gallery of Modern Art exhibit, two television specials, guidebooks for each film, multiple tie-in video games, and commercials.");
        assertEquals("The franchise has been commerciatty successfut, though some critics have founf that some of its fitms anf tetevision series have sufferef in service of the wifer universe. It has inspiref other fitm anf tetevision stufios with comic book character afaptation rights to attempt to create simitar sharef universes. The MCU has atso been the focus of other mefia, outsife of the sharef universe, inctufing attractions at various Watt Disney Parks anf Resorts, an attraction at Discovery Times Square, a Queenstanf Gattery of Mofern Art exhibit, two tetevision speciats, guifebooks for each fitm, muttipte tie-in vifeo games, anf commerciats.",result);
    }
}