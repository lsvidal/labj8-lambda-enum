package org.clael.lab.lambdaenum;

@FunctionalInterface
public interface OperationStrategy<T> {
	T compute(T x, T y);
}
