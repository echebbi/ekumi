/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.func;

import static java.util.Objects.requireNonNull;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

public interface Try<T> {
	
	public static <T> Try<T> of(Computation<T> computation) {
		try {
			return new Success<>(computation.compute());
		}
		catch (Exception e) {
			return new Failure<>(e);
		}
	}

	public static <T> Try<T> failure(Exception e) {
		return new Failure<>(requireNonNull(e, "exception must not be null"));
	}
	
	public static <T> Success<T> success(T value) {
		return new Success<>(value);
	}
	
	/**
	 * Returns whether the instance represents a successful operation.
	 * @return whether the instance represents a successful operation
	 */
	boolean isSuccess();
	
	/**
	 * Returns whether the instance represents a failed operation.
	 * @return whether the instance represents a failed operation
	 */
	boolean isFailure();
	
	/**
	 * Returns the value if this is a success or throws the exception if this is a failure?
	 * @return the value if this is a success
	 */
	default T get() {
		try {
			return value().orElseThrow(exception()::get);
		} 
		catch (Exception e) {
			throw new EKumiRuntimeException("cannot get the value of a Failure", e);
		}
	}
	
	/**
	 * Returns the value if this is a success, or a default one.
	 * 
	 * @param other
	 * 			The default value to return if this is a failure.
	 * 
	 * @return the value of the success, or the default one
	 */
	default T orElse(T other) {
		return value().orElse(other);
	}
	
	/**
	 * Returns the value if this is a success, or a default one.
	 * 
	 * @param other
	 * 			The function supplying the default value to return
	 * 			if this is a failure.
	 * 
	 * @return the value of the success, or the default one
	 */
	default T orElseGet(Supplier<T> other) {
		return value().orElseGet(other);
	}
	
	/**
	 * Returns the value produced by the operation, if any.
	 * @return the value produced by the operation, if any
	 */
	default Optional<T> value() {
		return Optional.empty();
	}
	
	/**
	 * Returns the exception thrown by the operation if this instance
	 * {@link #isFailure() represents a failure}, or nothing if this
	 * instance {@link #isSuccess() represents a success}.
	 * 
	 * @return the exception caught during the execution of the operation, if any.
	 */
	default <E extends Exception> Optional<E> exception() {
		return Optional.empty();
	}
	
	/**
	 * <p>
	 * Creates a new success by transforming the value with the given
	 * mapper.
	 * <p>
	 * Has no effect if this is a failure.
	 * 
	 * @param transform
	 * 			The transformation function.
	 * 
	 * @return the new success if this is a success, or an equivalent failure
	 */
	<R> Try<R> map(Function<T, R> transform);
	
	@FunctionalInterface
	public static interface Computation<T> {
		
		@SuppressWarnings("squid:S00112") // we want to support all types of exception
		T compute() throws Exception;
	}
	
	public static final class Success<T> implements Try<T> {
		
		private final T value;
		
		Success(T value) {
			this.value = value;
		}
		
		@Override
		public boolean isSuccess() {
			return true;
		}
		
		@Override
		public boolean isFailure() {
			return false;
		}
		
		@Override
		public Optional<T> value() {
			return Optional.of(value);
		}
		
		@Override
		public <R> Success<R> map(Function<T, R> transform) {
			return new Success<>(transform.apply(value));
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof Success)) {
				return false;
			}
			Success<?> other = (Success<?>) obj;
			if (value == null) {
				if (other.value != null) {
					return false;
				}
			} else if (!value.equals(other.value)) {
				return false;
			}
			return true;
		}
		
		@Override
		public String toString() {
			return "Success<" + value().orElse(null) + ">";
		}
		
	}
	
	public static final class Failure<T> implements Try<T> {
		
		private Exception throwable;
		
		Failure(Exception throwable) {
			this.throwable = throwable;
		}
		
		@Override
		public boolean isSuccess() {
			return false;
		}
		
		@Override
		public boolean isFailure() {
			return true;
		}
		
		@Override
		public Optional<Exception> exception() {
			return Optional.of(throwable);
		}

		@Override
		public <R> Failure<R> map(Function<T, R> transform) {
			return new Failure<>(throwable);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((throwable == null) ? 0 : throwable.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof Failure)) {
				return false;
			}
			Failure<?> other = (Failure<?>) obj;
			if (throwable == null) {
				if (other.throwable != null) {
					return false;
				}
			} else if (!throwable.equals(other.throwable)) {
				return false;
			}
			return true;
		}
		
		@Override
		public String toString() {
			if (throwable == null) {
				return "Failure<null>";
			}
			return "Failure<" + throwable.getClass().getSimpleName() + " (" + throwable.getCause() + ")>";
		}
	}

}
