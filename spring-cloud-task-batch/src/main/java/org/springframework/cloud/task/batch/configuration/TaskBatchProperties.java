/*
 *  Copyright 2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.task.batch.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Establish properties to be used for how Tasks work with
 * Spring Batch.
 *
 * @author Glenn Renfro
 * @author Michael Minella
 *
 * @since 2.0.0
 */
@ConfigurationProperties(prefix = "spring.cloud.task.batch")
public class TaskBatchProperties {

	/**
	 * Comma-separated list of job names to execute on startup (for instance,
	 * `job1,job2`). By default, all Jobs found in the context are executed.
	 */
	private String jobNames = "";

	/**
	 * The order for the {@code CommandLineRunner} used to run batch jobs when
	 * {@code spring.cloud.task.batch.fail-on-job-failure=true}.  Defaults to 0 (same as the
	 * {@link org.springframework.boot.autoconfigure.batch.JobLauncherCommandLineRunner}).
	 */
	private int commandLineRunnerOrder = 0;

	/**
	 * Maximum wait time in milliseconds that Spring Cloud Task will wait for tasks to complete
	 * when spring.cloud.task.batch.failOnJobFailure is set to true.  Defaults
	 * to 0.  0 indicates no wait time is enforced.
	 */
	private long failOnJobFailurewaitTime = 0;

	/**
	 * Fixed delay in milliseconds that Spring Cloud Task will wait when checking if
	 * {@link org.springframework.batch.core.JobExecution}s have completed,
	 * when spring.cloud.task.batch.failOnJobFailure is set to true.  Defaults
	 * to 5000.
	 */
	private long failOnJobFailurePollInterval = 5000l;

	public String getJobNames() {
		return this.jobNames;
	}

	public void setJobNames(String jobNames) {
		this.jobNames = jobNames;
	}

	public int getCommandLineRunnerOrder() {
		return commandLineRunnerOrder;
	}

	public void setCommandLineRunnerOrder(int commandLineRunnerOrder) {
		this.commandLineRunnerOrder = commandLineRunnerOrder;
	}

	public long getFailOnJobFailurewaitTime() {
		return failOnJobFailurewaitTime;
	}

	public void setFailOnJobFailurewaitTime(long failOnJobFailurewaitTime) {
		this.failOnJobFailurewaitTime = failOnJobFailurewaitTime;
	}

	public long getFailOnJobFailurePollInterval() {
		return failOnJobFailurePollInterval;
	}

	public void setFailOnJobFailurePollInterval(long failOnJobFailurePollInterval) {
		this.failOnJobFailurePollInterval = failOnJobFailurePollInterval;
	}
}
