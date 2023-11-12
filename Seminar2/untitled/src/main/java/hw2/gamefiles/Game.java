package hw2.gamefiles;

public interface Game {
    void start(Integer sizeWord,Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
