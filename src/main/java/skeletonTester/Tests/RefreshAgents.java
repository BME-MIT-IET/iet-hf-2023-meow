package main.java.skeletonTester.Tests;

import main.java.agents.Agent;
import main.java.agents.Paralyzed;
import main.java.agents.Protection;
import main.java.agents.VitusDance;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;
import java.util.ArrayList;

/**
 * For each agent we update the TTL property and check if the agent is still alive.
 */
public class RefreshAgents extends Test {

    public String getName() {
        return "Refresh Agents";
    }

    public void runTest() {
        Virologist virologist = new Virologist("bob");
        ArrayList<Agent> agents = new ArrayList<Agent>();
        Paralyzed par = new Paralyzed();
        par.setTimeToLive(20);
        Protection prot = new Protection();
        prot.setTimeToLive(0);
        VitusDance vitusDance = new VitusDance();
        vitusDance.setTimeToLive(0);
        agents.add(par);
        agents.add(prot);
        agents.add(vitusDance);
        virologist.setAgentlist(agents);
        virologist.refreshAgents();
    }
}
