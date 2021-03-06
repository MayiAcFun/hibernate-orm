/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */

package org.hibernate.metamodel.source.spi;

import org.hibernate.xml.spi.Origin;

/**
 * Indicates a problem parsing a mapping document.
 *
 * @author Steve Ebersole
 */
public class MappingException extends org.hibernate.MappingException {
	private final Origin origin;

	public MappingException(String message, Origin origin) {
		super( message );
		this.origin = origin;
	}

	public MappingException(String message, Throwable root, Origin origin) {
		super( message, root );
		this.origin = origin;
	}

	@Override
	public String getMessage() {
		return super.getMessage() + " : origin(" + origin.getName() + ")";
	}

	public Origin getOrigin() {
		return origin;
	}
}
