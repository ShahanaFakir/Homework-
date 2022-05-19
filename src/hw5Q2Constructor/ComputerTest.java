package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer(); // default Constructor initialized
		Computer computer01 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		Computer computer02 = new Computer("Apple");
		Computer computer03 = new Computer("Apple", "MacBook Air", "MacOS Mojave");
		Computer computer04 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800);
		Computer computer05 = new Computer("Apple", "MacBook Air");

	}

}
