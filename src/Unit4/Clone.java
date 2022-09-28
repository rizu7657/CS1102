package Unit4;
public class Clone {
    private static int cloneCount = 0;
    private String name;
    private String rank;
    private String regiment;
    private int clankerCount;
    private static int totalClankersEliminated = 0;
    public int getClankerCount() {
        return clankerCount;
    }
    public String getName() {
        return name;
    }
    public String getRank() {
        return rank;
    }
    public String getRegiment() {
        return regiment;
    }
    public static int getCloneCount() {
        return cloneCount;
    }
    public static int getTotalClankersEliminated() {
        return totalClankersEliminated;
    }
    public void eliminateClanker(int amount) {
        clankerCount += amount;
        addClankerCount(amount);
    }
     private static void addClankerCount(int amount) {
        totalClankersEliminated = totalClankersEliminated + amount;
    }
    public Clone(String newName, String newRank, String newRegiment) {
        name = newName;
        rank = newRank;
        regiment = newRegiment;
        cloneCount++;
    }
}
