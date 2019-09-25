package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {

        /*
         - In the main method create a fleet
         - Achieve this output:
         Create a fleet of things to have this output:
         1. [ ] Get milk
         2. [ ] Remove the obstacles
         3. [x] Stand up
         4. [x] Eat lunch
        System.out.println(fleet);
         */
        Fleet firstFleet = new Fleet();
        Thing firstThing = new Thing("Get milk");
        firstFleet.add(firstThing);

        Thing secondThing = new Thing("Remove the obstacles");
        firstFleet.add(secondThing);
        //firstFleet.add(new Thing("Remove the obastacles"));

        Thing thirdThing = new Thing("Stand up");
        firstFleet.add(thirdThing);

        Thing fourthThing = new Thing("Eat lunch");
        firstFleet.add(fourthThing);
        //firstFleet.add(new Thing("Eat lunch"));

        //secondThing.complete();
        thirdThing.complete();
        fourthThing.complete();
        System.out.println(firstFleet.toString());

       // System.out.println();
    }
}
