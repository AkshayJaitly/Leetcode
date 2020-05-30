
/*
Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"
*/

class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List<String> path : paths)
        {
            map.put(path.get(0),path.get(1));
        }

        String res = paths.get(0).get(0);

        while(res != null)
        {
            if(!graph.containsKey(res)) break;
            res = map.get(res);
        }

        return res;
    }
}
