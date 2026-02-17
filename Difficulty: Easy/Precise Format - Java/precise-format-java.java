class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> list = new ArrayList<>();
        float e = a/b;
        String fo = String.format("%.3f",(e));
        list.add(e);
        list.add(Float.parseFloat(fo));
        return list;
    }
}