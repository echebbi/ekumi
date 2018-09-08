package fr.kazejiyu.ekumi.tests.common.fake.activities;

/**
 * Can be implemented by fake classes on which one wants to test DI.
 * 
 * @author Emmanuel CHEBBI
 */
public interface Injectable {

	/** @return whether the instance has been injected properly */
	boolean hasBeenInjected();

}
