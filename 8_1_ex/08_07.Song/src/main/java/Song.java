    public class Song {

        private String name;
        private int length;

        public int length() {
            return length;
        }

        public String name() {
            return name;
        }

        public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    }