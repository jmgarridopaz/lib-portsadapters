package io.github.jmgarridopaz.lib.portsadapters;


	public abstract class AbstractDriverAdapter<T> implements DriverAdapter {

	private final T driverPort;
	
	protected AbstractDriverAdapter ( T driverPort ) {
		this.driverPort = driverPort;
	}

	
	protected T driverPort() {
		return this.driverPort;
	}

}
