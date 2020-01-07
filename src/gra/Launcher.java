package gra;

/*
Zaprojektuj program, w którym użytkownik będzie znajdował się w pokoju. Będą znajdować
się w nim drzwi, okno i klucz.
Użytkownik będzie wykonać interakcje z jednym z wybranych przedmiotów (użyj narzędzia Scanner).
Gra kończy się gdy uda mu się otworzyć drzwi.

Jeśli użytkownik użyje:
okno: - otworzy się lub zamknie
klucz: - użytkownik zabierze klucz i klucz nie będzie się już pojawiał jako jedna z opcji
drzwi: - otworzą się ale tylko jeśli użytkownik zabrał klucz, jeśli nie, pozostaną zamknięte

Program ma być gotowy na dodanie nowych pomieszczeń i nowych rodzajów rzeczy zarówno możliwych
do użycia jak i do zabrania. Przy każdej próbie użycia obiektu powinnien wyświetlić się stosowny
komunikat. Wskazane jest rozdzielić komunikację z graczem od serwisu odpowiedzialnego za resztę rozgrywki
*/


import gra.model.*;
import gra.repository.House;
import gra.repository.Player;
import gra.repository.Room;
import gra.service.Controller;
import gra.service.Game;

public class Launcher {

    public static void main(String[] args) {
        //składanie aplikacji
        Room livingRoom = new Room();
        System.out.println("sdfg");
        Key key = new Key();
        livingRoom.addThing(key);
        Matches matches = new Matches();
        livingRoom.addThing(matches);
        livingRoom.addThing(new Window());
        livingRoom.addThing(new Door(key));
        livingRoom.addThing(new Candle(matches));

        House house1 = new House();
        Player player = new Player("MICHAEL");
        house1.addRoom(livingRoom);

        Game game = new Game(livingRoom,player);
        Controller controller = new Controller(game);

        //rozruch
        controller.startGame();


        // player????? jak dodac konkretnego gracza

        // dodawanie przedmiotow z poziomu main

        // wytrych?? do drzwi i np szansa 1/3, wytrych pęka po drugiej probie
        // zapałki znajduja sie w wiadrze z woda, Random czy sie odpala
        // gracz jest skuty kajdankami aby sie wydostać musi wpisac szyf trzy cyfrowy,
        //
        // podpowiedz znajduje na kartce, ktora trzeba oswietlic zeby przeczytac
        // odpalone zapalki gasna po czasie 5 sekund, czyszczona konsola z podpowiedzia
        // " gdy pomocy potrzebujesz, uzyj go jak najlepiej umiesz"
        // chodzi o numer 112

    }

}
