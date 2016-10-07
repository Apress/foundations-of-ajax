/*
 * NameServiceTest.java
 *
 * Created on June 20, 2005, 8:20 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package proajax.chap4;

import ajaxbook.chap4.NameService;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author nate
 */
public class NameServiceTest extends TestCase {
    private List names = new ArrayList();
    private NameService service;
    
    /** Creates a new instance of NameServiceTest */
    public NameServiceTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        names.add("Abe");
        names.add("Abel");
        names.add("Abigail");
        names.add("Abner");
        names.add("Abraham");
        names.add("Marcus");
        names.add("Marcy");
        names.add("Marge");
        names.add("Marie");
        
        service = NameService.getInstance(names);
    }

    protected void tearDown() throws Exception {
        names = null;
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NameServiceTest.class);
        return suite;
    }
    
    public void testFindNamesLowerCase() {
        List actual = service.findNames("ab");
        assertEquals(actual.size(), 5);
    }
    
    public void testFindNamesUpperCase() {
        List actual = service.findNames("AB");
        assertEquals(actual.size(), 5);
    }
    
    public void testFindNamesMixedCase1() {
        List actual = service.findNames("Ab");
        assertEquals(actual.size(), 5);
    }

    public void testFindNamesMixedCase2() {
        List actual = service.findNames("aB");
        assertEquals(actual.size(), 5);
    }

    public void testFindNamesEmpty() {
        List actual = service.findNames("#$");
        assertEquals(actual.size(), 0);
    }
}
