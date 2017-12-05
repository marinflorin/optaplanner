/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.projectjobscheduling.persistence;

import java.io.File;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.optaplanner.examples.common.persistence.AbstractSolutionImporter;
import org.optaplanner.examples.common.persistence.SolutionImporterTest;
import org.optaplanner.examples.projectjobscheduling.app.ProjectJobSchedulingApp;
import org.optaplanner.examples.projectjobscheduling.domain.Schedule;

public class ProjectJobSchedulingImporterTest extends SolutionImporterTest<Schedule> {

    @Override
    protected ProjectJobSchedulingImporter createSolutionImporter() {
        return new ProjectJobSchedulingImporter();
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> getInputFilesAsParameters() {
        return getInputFilesAsParameters(ProjectJobSchedulingApp.DATA_DIR_NAME, new ProjectJobSchedulingImporter());
    }

    public ProjectJobSchedulingImporterTest(File solutionFile) {
        super(solutionFile);
    }

}
