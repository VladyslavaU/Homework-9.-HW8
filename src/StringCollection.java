public class StringCollection implements Collection {

    private String[] stringCollection;
    private int index = 0;

    public StringCollection() {
        this.stringCollection = new String[10];
    }

    public StringCollection(int size) {
        this.stringCollection = new String[size];
    }

    public boolean add(Object string) {
        if (string instanceof String) {
            this.stringCollection[this.index] = (String) string;
            this.index++;
            if (this.index >= stringCollection.length) {
                String[] newStringCollection = new String[this.index * 2];
                for (int i = 0; i < stringCollection.length; i++) {
                    newStringCollection[i] = stringCollection[i];

                }
                this.stringCollection = newStringCollection;
            }
            return true;


        }
        return false;
    }

    public boolean add(int indexToAdd, Object string) {
        if (string instanceof String) {
            if (this.stringCollection[indexToAdd] != null) {
                String temp = this.stringCollection[indexToAdd];
                this.stringCollection[indexToAdd] = (String) string;
                this.add(temp);
            } else {
                this.stringCollection[indexToAdd] = (String) string;
                this.index++;
            }
            return true;
        }
        return false;
    }


    public boolean delete(Object string) {
        for (int i = 0; i < this.index; i++) {
            if (stringCollection[i].equals(string)) {
                this.delete(i);
            }
        }
        return true;
    }

    //оставила, чтоб много не переписывать и использовать его выше. Объявила приватным,
    //чтобы его нельзя было использовать в других местах
    private void delete(int indexToDelete) {
        this.stringCollection[indexToDelete] = this.stringCollection[this.index - 1];
        this.stringCollection[this.index - 1] = null;
        this.index--;
    }

    public boolean contain(Object object) {
        for (int i = 0; i < this.index; i++) {
            if (this.stringCollection[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Collection str) {
        if (this.index != str.size()) {
            return false;
        }
        for (int i = 0; i < this.index; i++) {
            if (!this.stringCollection[i].equals(str.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.index;
    }

    public String get(int indexToGet) {
        return this.stringCollection[indexToGet];
    }

    public boolean clear() {
        for (int i = 0; i < this.index; i++) {
            this.stringCollection[i] = null;
        }
        this.index = 0;
        return true;
    }

    @Override
    public String toString() {
        String stringToReturn = "";
        for (int i = 0; i < this.index; i++) {
            stringToReturn += this.stringCollection[i] + " ";
        }
        return stringToReturn;
    }

}
