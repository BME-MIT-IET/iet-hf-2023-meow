package com.csb.skeletonTester.Tests;

import com.csb.agents.Agent;
import com.csb.agents.Paralyzed;
import com.csb.agents.Protection;
import com.csb.agents.VitusDance;
import com.csb.skeletonTester.Test;
import com.csb.virologist.Virologist;
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
