class Playlist
{
    Node head = null;
    Node tail = null;

    class Node
    {
        Song data;
        Node next;
        Node prev;
        Node(Song d)
        {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void insertToEnd(Song new_song) {
        // Your code here
    }

    public void insertToIndex(Song new_song, int index) {
        // Your code here
    }

    public void removeSong(String song_name){
        // Your code here
    }

    public void move(String song_name, int move_num ) {
        // Your code here
    }

    public void reverseSequence(int first_ind, int second_ind){
        //Your code here
    }

    //Your code here if you use helper methods

    public void displayList() {
        Node temp = head;

        if (temp == null){
            System.out.println("Playlist is empty!");
            return;
        }

        while (temp.next != head)
        {
            temp.data.displaySong();
            temp = temp.next;
        }
        temp.data.displaySong();
    }
}
