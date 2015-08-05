package org.clael.lab.lambdaenum;

public enum Operation implements OperationStrategy<Integer> {

	ADD((x,y) -> x + y),
	SUB((x,y) -> x - y),
	MAX(Integer::max);

	private OperationStrategy<Integer> operationStrategy;

	Operation(final OperationStrategy<Integer> operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	@Override
	public Integer compute(Integer x, Integer y) {
		return operationStrategy.compute(x,y);
	}
}