package com.csb.agents;

import com.csb.virologist.Virologist;
import java.io.Serializable;

/**
 * The agent abstract class.
 */
public abstract class Agent implements Serializable {

    private int timeToLive = 3;

    /**
     * Apply the agent's effect to the virologist
     * @param virologist the virologist to apply the effect to
     */
    public abstract void applyEffect(Virologist virologist);

    /**
     * Decrements the agent's TTL
     * @param virologist the virologist who has the agent
     */
    public void decreaseTimeToLive(Virologist virologist) {
        this.timeToLive--;
        if (this.timeToLive <= 0) {
            removeEffect(virologist);
        }
    }

    /**
     * Remove the agent from the virologist
     * @param virologist the virologist whom we remove the agent from
     */
    public abstract void removeEffect(Virologist virologist);

    /**
     * The agent's TTL - Time To Live field
     * At each turn, the agent's TTL is decremented by 1, and when it reaches 0, the agent is removed from the virologist
     * @return the TTL
     */
    public int getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the agent's TTL - Time To Live field
     * @param timeToLive the TTL to set
     */
    public void setTimeToLive(int timeToLive) {
        this.timeToLive = timeToLive;
    }
}
