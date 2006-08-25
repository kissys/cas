/*
 * Copyright 2005 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.uportal.org/license.html
 */
package org.jasig.cas.authentication.principal;

import java.util.Map;

/**
 * Interface representing a principal that can provide additional attributes.
 * 
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 3.1
 */
public interface AttributePrincipal extends Principal {

    /**
     * Map representing additional attributes about a user, such as another form
     * of ID (i.e. IID).
     * 
     * @return the map of attributes.
     */
    Map getAttributes();

}
