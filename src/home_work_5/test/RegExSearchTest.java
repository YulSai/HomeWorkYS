package home_work_5.test;

import home_work_5.additional.searchEngines.RegExSearch;
import home_work_5.additional.searchEngines.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {
    ISearchEngine searchEngine = new RegExSearch();

    @Test
    public void searchOneWord() {
        String text1 = "В войну воины воевали военным вооружением! Война войне - на войне как на Войне? Война... война";

        Assertions.assertEquals(1, searchEngine.search(text1, "война"));
        Assertions.assertEquals(2, searchEngine.search(text1, "Война"));
    }

    @Test
    public void searchWordForExampleFromTask() {
        String text1 = "привет, как дела!";
        String text2 = "привет,какдела!";
        String text3 = "привет;какдела!";
        String text4 = "как дела!.Что делаешь?";
        String text5 = "Привет-привет";
        String text6 = "Привет - привет";
        String text7 = "4-х";
        String text8 = "один и 1";
        String text9 = "бабушка бабушке бабушку";
        String text10 = "Привет - Привет, Привет";


        Assertions.assertEquals(1, searchEngine.search(text1, "привет"));
        Assertions.assertEquals(1, searchEngine.search(text1, "как"));
        Assertions.assertEquals(1, searchEngine.search(text1, "дела"));

        Assertions.assertEquals(1, searchEngine.search(text2, "привет"));
        Assertions.assertEquals(1, searchEngine.search(text2, "какдела"));

        Assertions.assertEquals(1, searchEngine.search(text3, "привет"));
        Assertions.assertEquals(1, searchEngine.search(text3, "какдела"));

        Assertions.assertEquals(1, searchEngine.search(text4, "как"));
        Assertions.assertEquals(1, searchEngine.search(text4, "дела"));
        Assertions.assertEquals(1, searchEngine.search(text4, "Что"));
        Assertions.assertEquals(1, searchEngine.search(text4, "делаешь"));

        Assertions.assertEquals(1, searchEngine.search(text5, "Привет-привет"));

        Assertions.assertEquals(1, searchEngine.search(text6, "Привет"));
        Assertions.assertEquals(1, searchEngine.search(text6, "привет"));

        Assertions.assertEquals(1, searchEngine.search(text7, "4-х"));

        Assertions.assertEquals(1, searchEngine.search(text8, "один"));
        Assertions.assertEquals(1, searchEngine.search(text8, "и"));
        Assertions.assertEquals(1, searchEngine.search(text8, "1"));

        Assertions.assertEquals(1, searchEngine.search(text9, "бабушка"));
        Assertions.assertEquals(1, searchEngine.search(text9, "бабушке"));
        Assertions.assertEquals(1, searchEngine.search(text9, "бабушку"));

        Assertions.assertEquals(3, searchEngine.search(text10, "Привет"));
    }

    @Test
    public void searchWordFromPatter() {
        String text1 = "Краб крабу сделал грабли, подарил грабли крабу: «Грабь граблями гравий, краб».";
        Assertions.assertEquals(1, searchEngine.search(text1, "Краб"));
        Assertions.assertEquals(1, searchEngine.search(text1, "краб"));
        Assertions.assertEquals(2, searchEngine.search(text1, "грабли"));
    }

    @Test
    public void searchWordFromSingle() {
        String text1 = "Ой у лузі червона калина похилилася,\n" +
                "Чогось наша славна Україна зажурилася.\n" +
                "А ми тую червону калину підіймемо,\n" +
                "А ми нашу славну Україну, гей, гей, розвеселимо!\n" +
                "\n" +
                "Марширують наші добровольці у кривавий тан\n" +
                "Визволяти братів-українців з ворожих кайдан.\n" +
                "А ми наших братів-українців визволимо,\n" +
                "А ми нашу славну Україну, гей, гей, розвеселимо!\n" +
                "\n" +
                "Не хилися, червона калино, маєш білий цвіт.\n" +
                "Не журися, славна Україно, маєш вільний рід.\n" +
                "А ми тую червону калину підіймемо,\n" +
                "А ми нашу славну Україну, гей, гей, розвеселимо!\n" +
                "\n" +
                "Гей, у полі ярої пшениці золотистий лан,\n" +
                "Розпочали стрільці українські з ворогами тан!\n" +
                "А ми тую ярую пшеницю ізберемо,\n" +
                "А ми нашу славну Україну, гей, гей, розвеселимо!\n" +
                "\n" +
                "Як повіє буйнесенький вітер з широких степів,\n" +
                "Та й прославить по всій Україні січових стрільців.\n" +
                "А ми тую стрілецькую славу збережемо,\n" +
                "А ми нашу славну Україну, гей, гей, розвеселимо!";

        Assertions.assertEquals(1, searchEngine.search(text1, "Ой"));
        Assertions.assertEquals(1, searchEngine.search(text1, "калина"));
        Assertions.assertEquals(1, searchEngine.search(text1, "Гей"));
        Assertions.assertEquals(10, searchEngine.search(text1, "гей"));
        Assertions.assertEquals(5, searchEngine.search(text1, "Україну"));
        Assertions.assertEquals(5, searchEngine.search(text1, "розвеселимо"));
    }

    @Test
    public void searchWordWarAndPeace() {
        String text1 = "Война и мир\n" +
                "\n" +
                "Первый вариант романа\n" +
                "\n" +
                "   Источник: Издательство: Захаров, 2007 г. Твердый переплет, 800 стр. ISBN   " +
                "978-5-8159-0748-5 Тираж: 5000 экз.\n" +
                "   Текст предоставлен издателем.\n" +
                "При подготовке этого издания использованы тексты, опубликованные Э.Е.Зайденшнур в 94-м томе " +
                "\"Литературного наследства\", рукописные материалы к роману из томов 13--16 юбилейного " +
                "90-томного собрания сочинений Л.Толстого, а также 3-е прижизненное издание романа, опубликованное " +
                "в 4-х томах в 1873 году.\n" +
                "\n" +
                "От издателя\n" +
                "\n" +
                "  \n" +
                "   \"1. В два раза короче и в пять раз интереснее.\n" +
                "   2. Почти нет философических отступлений.\n" +
                "   3. В сто раз легче читать: весь французский текст заменен русским в переводе самого Толстого.\n" +
                "   4. Гораздо больше мира и меньше войны.\n" +
                "   5. Хеппи-энд...\".\n" +
                "  \n" +
                "   Эти слова я поместил семь лет назад на обложку предыдущего издания, указав в аннотации: " +
                "\"Первая полная редакция великого романа, созданная к концу 1866 года, до того как Толстой переделал" +
                " его в 1867--1869 годах\", -- и что я использовал такие-то публикации.\n" +
                "   Думая, что все всё знают, я не объяснил, откуда взялась эта \"первая редакция\".\n" +
                "   Я оказался неправ, и в результате оголтелые и невежественные критики, выдающие себя за " +
                "знатоков русской литературы, публично стали обвинять меня и в фальсификации (\"это Захаров сам " +
                "всё сляпал\"), и в надругательстве над Толстым (\"ведь вот же Лев Николаевич не напечатал этот " +
                "первый вариант, а вы...\").\n";

        Assertions.assertEquals(1, searchEngine.search(text1, "Война"));
        Assertions.assertEquals(1, searchEngine.search(text1, "мир"));
        Assertions.assertEquals(3, searchEngine.search(text1, "я"));
        Assertions.assertEquals(1, searchEngine.search(text1, "Хеппи-энд"));
        Assertions.assertEquals(2, searchEngine.search(text1, "раз"));
        Assertions.assertEquals(0, searchEngine.search(text1, " роман"));
    }

    @Test
    public void searchWordFromInhabitedIsland() {
        String text1 = "Максим приоткрыл люк, высунулся и  опасливо  поглядел  в  небо.  Небо\n" +
                "здесь  было  низкое  и   какое-то   твердое,   без   этой   легкомысленной\n" +
                "прозрачности,  намекающей  на  бездонность   космоса   и   множественность\n" +
                "обитаемых миров, - настоящая библейская твердь, гладкая  и  непроницаемая.\n" +
                "Твердь эта несомненно  опиралась  на  могучие  плечи  местного  Атланта  и\n" +
                "равномерно  фосфоресцировала.  Максим  поискал  в  зените  дыру,  пробитую\n" +
                "кораблем, но дыры там не было - там расплывались только две большие черные\n" +
                "кляксы, словно капли туши в воде. Максим распахнул люк настежь и  соскочил\n" +
                "в высокую сухую траву. Воздух был горячий и густой,  пахло  пылью,  старым\n" +
                "железом, раздавленной  зеленью,  жизнью.  Смертью  тоже  пахло,  давней  и\n" +
                "непонятной. Трава была по пояс,  неподалеку  темнели  заросли  кустарника,\n" +
                "торчали кое-как унылые кривоватые деревья. Было почти светло, как в  яркую\n" +
                "лунную ночь на Земле, но не  было  лунной  туманной  голубизны,  все  было\n" +
                "серое, пыльное,  плоское.  Корабль  стоял  на  дне  огромной  котловины  с\n" +
                "пологими  склонами;  местность  вокруг  заметно  поднималась  к  размытому\n" +
                "неясному горизонту, и это было странно,  потому  что  где-то  рядом  текла\n" +
                "река, большая и спокойная, текла на запад, вверх по склону котловины.\n";

        Assertions.assertEquals(1, searchEngine.search(text1, "небо"));
        Assertions.assertEquals(2, searchEngine.search(text1, "там"));
        Assertions.assertEquals(5, searchEngine.search(text1, "было"));
        Assertions.assertEquals(1, searchEngine.search(text1, "был"));
        Assertions.assertEquals(3, searchEngine.search(text1, "Максим"));
    }
}