public class Main {
    public static void main(String[] args) {

        StringCollection strCol = new StringCollection(3);
        StringCollection strColEquals = new StringCollection(3);
        StringCollection strColDifferent = new StringCollection(3);

        System.out.println("boolean add( Object o)");
        strCol.add("StringOne");
        System.out.println(strCol.toString());

        System.out.println("boolean add(index, Object o)");

        strCol.add("StringThree");
        strCol.add(1, "StringTwo");
        System.out.println(strCol.toString());


        System.out.println("boolean delete (Object o)");
        strCol.add("StringToDelete");
        System.out.println("Before deletion: " + strCol.toString());
        strCol.delete("StringToDelete");
        System.out.println("After deletion: " + strCol.toString());

        System.out.println("Object get(int index)");
        System.out.println("get index 0: " + strCol.get(0));

        System.out.println("boolean contain(Object o)");
        System.out.println("Contains StringOne: " + strCol.contain("StringOne"));
        System.out.println("Does not contain StringFour: " + strCol.contain("StringFour"));


        strColEquals.add("StringOne");
        strColEquals.add("StringTwo");
        strColEquals.add("StringThree");

        strColDifferent.add("StringTwo");
        strColDifferent.add("StringOne");
        strColDifferent.add("StringThree");

        System.out.println("boolean equals (Collection str)");
        System.out.println("Equals: " + strCol.equals(strColEquals));
        System.out.println("Different: " + strCol.equals(strColDifferent));

        System.out.println("boolean clear()");

        System.out.println("Before Clearing:" + strColDifferent.toString());
        strColDifferent.clear();
        System.out.println("After Clearing: " + strColDifferent.toString());


        System.out.println("int size(),");
        System.out.println("Size of first StringCollection: " + strCol.size());
        System.out.println("Size of cleared collection: " + strColDifferent.size());


    }
}
