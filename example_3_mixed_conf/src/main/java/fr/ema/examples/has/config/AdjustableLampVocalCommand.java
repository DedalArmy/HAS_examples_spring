package fr.ema.examples.has.config;

import org.springframework.stereotype.Component;
import fr.ema.examples.has.config.AdjustableLamp;

@Component
public class AdjustableLampVocalCommand extends AdjustableLamp{
    boolean vocalCommandActivated;

	public boolean isVocalCommandActivated() {
		return vocalCommandActivated;
	}

	public void setVocalCommandActivated(boolean vocalCommandActivated) {
		this.vocalCommandActivated = vocalCommandActivated;
	}
}
