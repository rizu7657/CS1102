package Unit4;

public class CloneWar {
    public static void main(String[] args) {
        Clone firstClone = new Clone("Rex", "Captain", "501");

        System.out.println("The trade federation has captured Jedi and ordered their execution.");
        System.out.println("But to their surprise a clone army is at their disposal. " +
                "Master Yoda starts a battle with a platoon");
        System.out.println("Recruiting clones...");
        System.out.println("Platoon leader: " + firstClone.getName());
        System.out.println("Rank: " + firstClone.getRank());
        System.out.println("Regiment: " + firstClone.getRegiment());

        System.out.println("\n\n"+firstClone.getName()+" flanks the lot of executioners.");
        firstClone.eliminateClanker(10);
        System.out.println("So far " + Clone.getCloneCount() + " clone trooper has eliminated " +
                Clone.getTotalClankersEliminated() + " clankers.");
    }
}
