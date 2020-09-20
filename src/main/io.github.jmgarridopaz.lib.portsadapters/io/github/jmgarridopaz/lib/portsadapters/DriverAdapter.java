package io.github.jmgarridopaz.lib.portsadapters;


public abstract class DriverAdapter<T> {

	private final T driverPort;
	
	protected DriverAdapter ( T driverPort ) {
		this.driverPort = driverPort;
	}

	
	protected T driverPort() {
		return this.driverPort;
	}

	public abstract void run ( String[] args );

}
