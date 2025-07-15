package WorkShop;


public class MusicPlayList {
	class Node {
		String track;
		Node next;
		Node prev;

		public Node(String track) {
			this.track = track;
		}
	}

	private Node current;
	private Node currTrack;

	public void addTrack(String track) {
		Node newTrack = new Node(track);
		if (current == null) {
			current = newTrack;
			currTrack = current;
			return;
		}
		Node temp = current;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newTrack;
		newTrack.prev = temp;
	}

	public void displayAll() {
		if (current == null) {
			System.out.println("Playlist is empty.");
			return;
		}
		Node temp = current;
		System.out.println("Music Playlist:");
		while (temp != null) {
			System.out.println("---------------------------");
			System.out.println("Track: " + temp.track);
			temp = temp.next;
		}
		System.out.println("---------------------------");
	}

	public void nextTrack() {
		if (currTrack == null || currTrack.next == null) {
			System.out.println("No next track. Add more songs or move backward.");
			return;
		}
		currTrack = currTrack.next;
		System.out.println("Now playing: " + currTrack.track);
	}

	public void prevTrack() {
		if (currTrack == null || currTrack.prev == null) {
			System.out.println("Currently at the start of the playlist.");
			return;
		}
		currTrack = currTrack.prev;
		System.out.println("Now playing: " + currTrack.track);
	}

	public void currentTrack() {
		if (currTrack == null) {
			System.out.println("No track is currently selected.");
		} else {
			System.out.println("Current Track: " + currTrack.track);
		}
	}

	public static void main(String[] args) {
		MusicPlayList playlist = new MusicPlayList();
		playlist.addTrack("3 Drags - Vichar");
		playlist.addTrack("Sunn rha  - Ankit tiwari");
		playlist.addTrack("Galat karam - Panther");
		playlist.addTrack("Shape of You - Ed Sheeran");

		playlist.displayAll();

		System.out.println("\nPlaying next tracks:");
		playlist.currTrack = playlist.current;
		playlist.currentTrack();
		playlist.nextTrack();
		playlist.currentTrack();
		playlist.nextTrack();
		playlist.currentTrack();

		System.out.println("\nGoing back to previous tracks:");
		playlist.currentTrack();
		playlist.prevTrack();
		playlist.currentTrack();
		playlist.prevTrack();
		playlist.currentTrack();
	}
}
