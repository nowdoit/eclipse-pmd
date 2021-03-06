// =====================================================================
//
// Copyright (C) 2012 - 2016, Philip Graf
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// =====================================================================

package ch.acanda.eclipse.pmd.java.resolution.optimization;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import ch.acanda.eclipse.pmd.java.resolution.ASTQuickFixTestCase;
import ch.acanda.eclipse.pmd.java.resolution.QuickFixTestData.TestParameters;

/**
 * Unit plug-in test for {@link SimplifyStartsWithQuickFix}.
 * 
 * @author Philip Graf
 */
public class SimplifyStartsWithQuickFixTest extends ASTQuickFixTestCase<SimplifyStartsWithQuickFix> {
    
    public SimplifyStartsWithQuickFixTest(final TestParameters parameters) {
        super(parameters);
    }

    @Parameters
    public static Collection<Object[]> getTestData() {
        return createTestData(SimplifyStartsWithQuickFixTest.class.getResourceAsStream("SimplifyStartsWith.xml"));
    }

}
